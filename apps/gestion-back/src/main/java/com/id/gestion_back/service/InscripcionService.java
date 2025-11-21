package com.id.gestion_back.service;

import com.id.gestion_back.domain.Inscripcion;
import com.id.gestion_back.repository.InscripcionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionService {

    private final InscripcionRepository inscripcionRepository;

    public InscripcionService(InscripcionRepository inscripcionRepository) {
        this.inscripcionRepository = inscripcionRepository;
    }

    public List<Inscripcion> obtenerTodos() {
        return inscripcionRepository.findAll();
    }

    public Inscripcion obtenerInscripcionPorId(String id) {
        return inscripcionRepository.findById(id).orElse(null);
    }

    public Inscripcion crearUnaInscripcion(Inscripcion inscripcionInput) {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setProyecto(inscripcionInput.getProyecto());
        inscripcion.setEstudiante(inscripcionInput.getEstudiante());
        inscripcion.setEstado(inscripcionInput.getEstado());
        inscripcion.setFechaIngreso(inscripcionInput.getFechaIngreso());
        inscripcion.setFechaEgreso(inscripcionInput.getFechaEgreso());
        return inscripcionRepository.save(inscripcion);
    }
    public Inscripcion actualizarUnaInscripcion(String id, Inscripcion inscripcionInput) {
        return inscripcionRepository.findById(id).map(inscripcion -> {
            inscripcion.setProyecto(inscripcionInput.getProyecto());
            inscripcion.setEstudiante(inscripcionInput.getEstudiante());
            inscripcion.setEstado(inscripcionInput.getEstado());
            inscripcion.setFechaIngreso(inscripcionInput.getFechaIngreso());
            inscripcion.setFechaEgreso(inscripcionInput.getFechaEgreso());
            return inscripcionRepository.save(inscripcion);
        }).orElse(null);
    }

    public boolean eliminarUnaInscripcion(String id) {
    if(inscripcionRepository.existsById(id)) {
        inscripcionRepository.deleteById(id);
        return true;
    }
        return false;
    }
}

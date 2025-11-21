package com.id.gestion_back.service;

import com.id.gestion_back.domain.Proyecto;
import com.id.gestion_back.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> obtenerTodos() {
        return proyectoRepository.findAll();
    }

    public Proyecto obtenerProyectoPorId(String id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    public Proyecto crearUnProyecto(Proyecto proyectoInput) {
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre(proyectoInput.getNombre());
        proyecto.setObjetivos(proyectoInput.getObjetivos());
        proyecto.setPresupuesto(proyectoInput.getPresupuesto());
        proyecto.setFechaInicio(proyectoInput.getFechaInicio());
        proyecto.setFechaFin(proyectoInput.getFechaFin());
        proyecto.setLider(proyectoInput.getLider());
        proyecto.setEstado(proyectoInput.getEstado());
        proyecto.setFase(proyectoInput.getFase());
        proyecto.setInscripciones(proyectoInput.getInscripciones());
        proyecto.setAvances(proyectoInput.getAvances());
        return proyectoRepository.save(proyecto);
    }
    public Proyecto actualizarUnProyecto(String id, Proyecto proyectoInput) {
        return proyectoRepository.findById(id).map(proyecto -> {
            proyecto.setNombre(proyectoInput.getNombre());
            proyecto.setObjetivos(proyectoInput.getObjetivos());
            proyecto.setPresupuesto(proyectoInput.getPresupuesto());
            proyecto.setFechaInicio(proyectoInput.getFechaInicio());
            proyecto.setFechaFin(proyectoInput.getFechaFin());
            proyecto.setLider(proyectoInput.getLider());
            proyecto.setEstado(proyectoInput.getEstado());
            proyecto.setFase(proyectoInput.getFase());
            proyecto.setInscripciones(proyectoInput.getInscripciones());
            proyecto.setAvances(proyectoInput.getAvances());
            return proyectoRepository.save(proyecto);
        }).orElse(null);
    }

    public boolean eliminarUnProyecto(String id) {
        if(proyectoRepository.existsById(id)) {
            proyectoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
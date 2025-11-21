package com.id.gestion_back.service;

import com.id.gestion_back.domain.Avance;
import com.id.gestion_back.repository.AvanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvanceService {

    private final AvanceRepository avanceRepository;

    public AvanceService(AvanceRepository avanceRepository) {
        this.avanceRepository = avanceRepository;
    }

    public List<Avance> obtenerTodos() {
        return avanceRepository.findAll();
    }

    public Avance obtenerAvancePorId(String id) {
        return avanceRepository.findById(id).orElse(null);
    }

    public Avance crearUnAvance(Avance avanceInput) {
        Avance avance = new Avance();
        avance.setProyecto(avanceInput.getProyecto());
        avance.setFecha(avanceInput.getFecha());
        avance.setDescripcion(avanceInput.getDescripcion());
        avance.setObservaciones(avanceInput.getObservaciones());
        avance.setCreadoPor(avanceInput.getCreadoPor());
        return avanceRepository.save(avance);
    }

    public Avance actualizarUnAvance(String id, Avance avanceInput) {
        return avanceRepository.findById(id).map(avance -> {
            avance.setProyecto(avanceInput.getProyecto());
            avance.setFecha(avanceInput.getFecha());
            avance.setDescripcion(avanceInput.getDescripcion());
            avance.setObservaciones(avanceInput.getObservaciones());
            avance.setCreadoPor(avanceInput.getCreadoPor());
            return avanceRepository.save(avance);
        }).orElse(null);
    }

    public boolean borrarAvance(String id) {
        if(avanceRepository.existsById(id)) {
            avanceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

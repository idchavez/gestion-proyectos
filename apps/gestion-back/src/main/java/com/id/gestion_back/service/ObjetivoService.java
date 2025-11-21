package com.id.gestion_back.service;

import com.id.gestion_back.domain.Objetivo;
import com.id.gestion_back.repository.ObjetivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetivoService {

    private final ObjetivoRepository objetivoRepository;

    public ObjetivoService(ObjetivoRepository objetivoRepository) {
        this.objetivoRepository = objetivoRepository;
    }

    public List<Objetivo> obtenerTodos() {
        return objetivoRepository.findAll();
    }

    public Objetivo obtenerObjetivoPorId(String id) {
        return objetivoRepository.findById(id).orElse(null);
    }

    public Objetivo crearUnObjetivo(Objetivo objetivoInput) {
        Objetivo objetivo = new Objetivo();
        objetivo.setDescripcion(objetivoInput.getDescripcion());
        objetivo.setTipo(objetivoInput.getTipo());
        objetivo.setProyecto(objetivoInput.getProyecto());
        return objetivoRepository.save(objetivo);
    }

    public Objetivo actualizarUnObjetivo(String id, Objetivo objetivoInput ) {
        return objetivoRepository.findById(id).map(objetivo -> {
            objetivo.setDescripcion(objetivoInput.getDescripcion());
            objetivo.setTipo(objetivoInput.getTipo());
            objetivo.setProyecto(objetivoInput.getProyecto());
            return objetivoRepository.save(objetivo);
        }).orElse(null);
    }

    public boolean eliminarUnObjetivo(String id) {
        if (objetivoRepository.existsById(id)) {
            objetivoRepository.deleteById(id);
            return true;
        }
    }
}

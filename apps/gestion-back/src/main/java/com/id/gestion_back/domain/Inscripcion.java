package com.id.gestion_back.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "inscripciones")
public class Inscripcion {

    @Id
    private String _id;
    private Proyecto proyecto;
    private Usuario estudiante;
    private EnumEstadoInscripcion estado;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public String get_id() {
        return _id;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Usuario getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Usuario estudiante) {
        this.estudiante = estudiante;
    }

    public EnumEstadoInscripcion getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoInscripcion estado) {
        this.estado = estado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
}

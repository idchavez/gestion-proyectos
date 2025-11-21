package com.id.gestion_back.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "proyectos")
public class Proyecto {
    @Id
    private String _id;
    private String nombre;
    private Objetivo objetivos;
    private String presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Usuario lider;
    private EnumEstadoProyecto estado;
    private EnumFaseProyecto fase;
    private Inscripcion inscripciones;
    private Avance avances;

    public String get_id() {
        return _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Objetivo getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(Objetivo objetivos) {
        this.objetivos = objetivos;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public EnumEstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoProyecto estado) {
        this.estado = estado;
    }

    public EnumFaseProyecto getFase() {
        return fase;
    }

    public void setFase(EnumFaseProyecto fase) {
        this.fase = fase;
    }

    public Inscripcion getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(Inscripcion inscripciones) {
        this.inscripciones = inscripciones;
    }

    public Avance getAvances() {
        return avances;
    }

    public void setAvances(Avance avances) {
        this.avances = avances;
    }
}

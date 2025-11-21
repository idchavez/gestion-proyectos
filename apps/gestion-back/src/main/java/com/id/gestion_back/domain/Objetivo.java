package com.id.gestion_back.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "objetivos")
public class Objetivo {
    @Id
    private String _id;
    private String descripcion;
    private EnumTipoObjetivo tipo;
    private Proyecto proyecto;

    public String get_id() {
        return _id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EnumTipoObjetivo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoObjetivo tipo) {
        this.tipo = tipo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}

package com.id.gestion_back.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String _id;
    private String correo;
    private String identificacion;
    private String nombre;
    private String apellido;
    private EnumROL rol;
    private EnumEstadoUsuario estado;
    private Proyecto proyectosLiderados;
    private Inscripcion inscripciones;
    private Avance avancesCreados;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public EnumROL getRol() {
        return rol;
    }

    public void setRol(EnumROL rol) {
        this.rol = rol;
    }

    public EnumEstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EnumEstadoUsuario estado) {
        this.estado = estado;
    }

    public Proyecto getProyectosLiderados() {
        return proyectosLiderados;
    }

    public void setProyectosLiderados(Proyecto proyectosLiderados) {
        this.proyectosLiderados = proyectosLiderados;
    }

    public Inscripcion getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(Inscripcion inscripciones) {
        this.inscripciones = inscripciones;
    }

    public Avance getAvancesCreados() {
        return avancesCreados;
    }

    public void setAvancesCreados(Avance avancesCreados) {
        this.avancesCreados = avancesCreados;
    }
}

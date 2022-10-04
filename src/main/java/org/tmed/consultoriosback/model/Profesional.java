package org.tmed.consultoriosback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@SuppressWarnings("ALL")
@Table("PROFESIONALES")
public class Profesional {
    @Id
    private long id;
    private long dni;
    private String nombre;
    private String apellido;
    private String sobrenombre;
    private String especialidad;
    private java.sql.Date fechaDeSubscripcion;
    private String direccion;
    private String telefonoCelular;
    private String eMail;
    private String notas;
    private boolean oculto;

    public Profesional() {
    }

    public Profesional(int id, String eMail) {
        this.id = id;
        this.eMail = eMail;
    }

    public Profesional(long id, long dni, String nombre, String apellido, String sobrenombre, String especialidad, Date fechaDeSubscripcion, String direccion, String telefonoCelular, String eMail, String notas, boolean oculto) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobrenombre = sobrenombre;
        this.especialidad = especialidad;
        this.fechaDeSubscripcion = fechaDeSubscripcion;
        this.direccion = direccion;
        this.telefonoCelular = telefonoCelular;
        this.eMail = eMail;
        this.notas = notas;
        this.oculto = oculto;
    }

    public long getId() {
        return id;
    }

    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Date getFechaDeSubscripcion() {
        return fechaDeSubscripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNotas() {
        return notas;
    }

    public boolean isOculto() {
        return oculto;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setFechaDeSubscripcion(Date fechaDeSubscripcion) {
        this.fechaDeSubscripcion = fechaDeSubscripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }
}

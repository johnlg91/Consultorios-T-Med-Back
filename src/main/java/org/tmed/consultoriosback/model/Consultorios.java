package org.tmed.consultoriosback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@SuppressWarnings("unused")
@Table("CONSULTORIOS")
public class Consultorios {

    @Id
    private long id;
    private long numeroDeConsultorio;
    private long costoPorModulo;
    private long tamannioDelArea;
    private String imagenes;
    private String equipo;
    private String especialidades;

    public Consultorios() {
    }

    public Consultorios(long id, long numeroDeConsultorio, long costoPorModulo, long tamannioDelArea, String imagenes, String equipo, String especialidades) {
        this.id = id;
        this.numeroDeConsultorio = numeroDeConsultorio;
        this.costoPorModulo = costoPorModulo;
        this.tamannioDelArea = tamannioDelArea;
        this.imagenes = imagenes;
        this.equipo = equipo;
        this.especialidades = especialidades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getNumeroDeConsultorio() {
        return numeroDeConsultorio;
    }

    public void setNumeroDeConsultorio(long numeroDeConsultorio) {
        this.numeroDeConsultorio = numeroDeConsultorio;
    }


    public long getCostoPorModulo() {
        return costoPorModulo;
    }

    public void setCostoPorModulo(long costoPorModulo) {
        this.costoPorModulo = costoPorModulo;
    }


    public long getTamannioDelArea() {
        return tamannioDelArea;
    }

    public void setTamannioDelArea(long tamannioDelArea) {
        this.tamannioDelArea = tamannioDelArea;
    }


    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }


    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

}

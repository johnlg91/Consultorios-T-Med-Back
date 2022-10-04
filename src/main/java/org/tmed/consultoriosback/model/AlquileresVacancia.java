package org.tmed.consultoriosback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Time;

@Table("ALQUILERES_VACANCIA")
public class AlquileresVacancia {

    @Id
    private long id;
    private long idContratoDeAlquiler;
    private String diaDeLaSemana;
    private java.sql.Time empiezaVacancia;
    private java.sql.Time terminaVacancia;
    private long oculto;

    public AlquileresVacancia() {}

    public AlquileresVacancia(long id, long idContratoDeAlquiler, String diaDeLaSemana, Time empiezaVacancia, Time terminaVacancia, long oculto) {
        this.id = id;
        this.idContratoDeAlquiler = idContratoDeAlquiler;
        this.diaDeLaSemana = diaDeLaSemana;
        this.empiezaVacancia = empiezaVacancia;
        this.terminaVacancia = terminaVacancia;
        this.oculto = oculto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getIdContratoDeAlquiler() {
        return idContratoDeAlquiler;
    }

    public void setIdContratoDeAlquiler(long idContratoDeAlquiler) {
        this.idContratoDeAlquiler = idContratoDeAlquiler;
    }


    public String getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public void setDiaDeLaSemana(String diaDeLaSemana) {
        this.diaDeLaSemana = diaDeLaSemana;
    }


    public java.sql.Time getEmpiezaVacancia() {
        return empiezaVacancia;
    }

    public void setEmpiezaVacancia(java.sql.Time empiezaVacancia) {
        this.empiezaVacancia = empiezaVacancia;
    }


    public java.sql.Time getTerminaVacancia() {
        return terminaVacancia;
    }

    public void setTerminaVacancia(java.sql.Time terminaVacancia) {
        this.terminaVacancia = terminaVacancia;
    }


    public long getOculto() {
        return oculto;
    }

    public void setOculto(long oculto) {
        this.oculto = oculto;
    }

}

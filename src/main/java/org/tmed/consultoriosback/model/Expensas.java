package com.sample;


import java.sql.Date;

public class Expensas {

    private long id;
    private String descripción;
    private java.sql.Date fechaDeExpensa;
    private double cantidad;
    private String seRepite;
    private java.sql.Date fechaDePago;
    private long oculto;

    public Expensas() {
    }

    public Expensas(long id, String descripción, Date fechaDeExpensa, double cantidad, String seRepite, Date fechaDePago, long oculto) {
        this.id = id;
        this.descripción = descripción;
        this.fechaDeExpensa = fechaDeExpensa;
        this.cantidad = cantidad;
        this.seRepite = seRepite;
        this.fechaDePago = fechaDePago;
        this.oculto = oculto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }


    public java.sql.Date getFechaDeExpensa() {
        return fechaDeExpensa;
    }

    public void setFechaDeExpensa(java.sql.Date fechaDeExpensa) {
        this.fechaDeExpensa = fechaDeExpensa;
    }


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public String getSeRepite() {
        return seRepite;
    }

    public void setSeRepite(String seRepite) {
        this.seRepite = seRepite;
    }


    public java.sql.Date getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(java.sql.Date fechaDePago) {
        this.fechaDePago = fechaDePago;
    }


    public long getOculto() {
        return oculto;
    }

    public void setOculto(long oculto) {
        this.oculto = oculto;
    }

}

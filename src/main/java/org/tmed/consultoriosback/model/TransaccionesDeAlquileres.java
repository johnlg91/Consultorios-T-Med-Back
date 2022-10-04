package com.sample;


public class TransaccionesDeAlquileres {

  private long id;
  private long idProfesional;
  private java.sql.Date fechaDeTransaccion;
  private String tipo;
  private String metodoDePago;
  private double cantidad;
  private long oculto;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getIdProfesional() {
    return idProfesional;
  }

  public void setIdProfesional(long idProfesional) {
    this.idProfesional = idProfesional;
  }


  public java.sql.Date getFechaDeTransaccion() {
    return fechaDeTransaccion;
  }

  public void setFechaDeTransaccion(java.sql.Date fechaDeTransaccion) {
    this.fechaDeTransaccion = fechaDeTransaccion;
  }


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }


  public String getMetodoDePago() {
    return metodoDePago;
  }

  public void setMetodoDePago(String metodoDePago) {
    this.metodoDePago = metodoDePago;
  }


  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }


  public long getOculto() {
    return oculto;
  }

  public void setOculto(long oculto) {
    this.oculto = oculto;
  }

}

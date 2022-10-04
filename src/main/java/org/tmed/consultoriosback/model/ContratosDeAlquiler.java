package com.sample;


public class ContratosDeAlquiler {

  private long id;
  private long idConsultorio;
  private long idProfesional;
  private String tipoDeAlquiler;
  private java.sql.Date empiezaElContrato;
  private java.sql.Date finDelContrato;
  private long costoTotal;
  private String notas;
  private java.sql.Date fechaDeAlquiler;
  private long oculto;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getIdConsultorio() {
    return idConsultorio;
  }

  public void setIdConsultorio(long idConsultorio) {
    this.idConsultorio = idConsultorio;
  }


  public long getIdProfesional() {
    return idProfesional;
  }

  public void setIdProfesional(long idProfesional) {
    this.idProfesional = idProfesional;
  }


  public String getTipoDeAlquiler() {
    return tipoDeAlquiler;
  }

  public void setTipoDeAlquiler(String tipoDeAlquiler) {
    this.tipoDeAlquiler = tipoDeAlquiler;
  }


  public java.sql.Date getEmpiezaElContrato() {
    return empiezaElContrato;
  }

  public void setEmpiezaElContrato(java.sql.Date empiezaElContrato) {
    this.empiezaElContrato = empiezaElContrato;
  }


  public java.sql.Date getFinDelContrato() {
    return finDelContrato;
  }

  public void setFinDelContrato(java.sql.Date finDelContrato) {
    this.finDelContrato = finDelContrato;
  }


  public long getCostoTotal() {
    return costoTotal;
  }

  public void setCostoTotal(long costoTotal) {
    this.costoTotal = costoTotal;
  }


  public String getNotas() {
    return notas;
  }

  public void setNotas(String notas) {
    this.notas = notas;
  }


  public java.sql.Date getFechaDeAlquiler() {
    return fechaDeAlquiler;
  }

  public void setFechaDeAlquiler(java.sql.Date fechaDeAlquiler) {
    this.fechaDeAlquiler = fechaDeAlquiler;
  }


  public long getOculto() {
    return oculto;
  }

  public void setOculto(long oculto) {
    this.oculto = oculto;
  }

}

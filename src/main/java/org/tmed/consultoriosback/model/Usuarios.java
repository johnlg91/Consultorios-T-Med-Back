package com.sample;


public class Usuarios {

    private long id;
    private String usuario;
    private String nombreUsuario;
    private String email;
    private String contrasennia;
    private long esAdmin;
    private long oculto;

    public Usuarios() {
    }

    public Usuarios(long id, String usuario, String nombreUsuario, String email, String contrasennia, long esAdmin, long oculto) {
        this.id = id;
        this.usuario = usuario;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contrasennia = contrasennia;
        this.esAdmin = esAdmin;
        this.oculto = oculto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getContrasennia() {
        return contrasennia;
    }

    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
    }


    public long getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(long esAdmin) {
        this.esAdmin = esAdmin;
    }


    public long getOculto() {
        return oculto;
    }

    public void setOculto(long oculto) {
        this.oculto = oculto;
    }

}

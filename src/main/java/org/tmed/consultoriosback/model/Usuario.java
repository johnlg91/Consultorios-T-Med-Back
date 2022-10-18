package org.tmed.consultoriosback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USUARIOS")
public class Usuario {
    @Id
    private long id;
    private String usuario;
    private String nombreUsuario;
    private String email;
    private String contrasennia;
    private long esAdmin;
    private boolean oculto;

    public Usuario() {
    }

    public Usuario(long id, String usuario, String nombreUsuario, String email, String contrasennia, long esAdmin, boolean oculto) {
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


    public boolean getOculto() {
        return oculto;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }

}

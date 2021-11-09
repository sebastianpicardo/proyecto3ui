package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "DATOS_USUARIO")
public class DatosUsuario {
	private String mail_usuario;
    private long idestilos_musicales;

    public DatosUsuario() {
    }

    public DatosUsuario(String mail_usuario, long idestilos_musicales) {
    	this.mail_usuario = mail_usuario;
        this.idestilos_musicales = idestilos_musicales;
        
    }

    @Id

    @Column(name = "MAIL_USUARIO", unique = true, nullable = false, precision = 12, scale = 0)
    public String getMail_usuario() {
        return this.mail_usuario;
    }

    public void setMail_usuario(String mail_usuario) {
        this.mail_usuario = mail_usuario;
    }

    @Column(name = "IDESTILOS_MUSICALES")
    public long getIdestilos_musicales() {
        return this.idestilos_musicales;
    }

    public void setIdestilos_musicales(long idestilos_musicales) {
        this.idestilos_musicales = idestilos_musicales;
    }


}

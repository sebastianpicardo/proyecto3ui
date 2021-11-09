package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ESTILOS_MUSICALES")
public class EstilosMusicales {
	private long idestilos_musicales;
    private String TipoMusica;

    public EstilosMusicales() {
    }

    public EstilosMusicales(long idestilos_musicales, String TipoMusica) {
        this.idestilos_musicales = idestilos_musicales;
        this.TipoMusica = TipoMusica;
    }

    @Id

    @Column(name = "IDESTILOS_MUSICALES", unique = true, nullable = false, precision = 12, scale = 0)
    public long getIdestilos_musicales() {
        return this.idestilos_musicales;
    }

    public void setIdestilos_musicales(long idestilos_musicales) {
        this.idestilos_musicales = idestilos_musicales;
    }

    @Column(name = "TIPO_MUSICA")
    public String getTipoMusica() {
        return TipoMusica;
    }

    public void setTipoMusica(String TipoMusica) {
        this.TipoMusica = TipoMusica;
    }

}

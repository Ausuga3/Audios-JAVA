package com.aluracursos.audios.modelos;

public class Podcast extends Audio{
    private String autor;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getMeGusta() > 2000){
            return 8;
        }else{
            return 4;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

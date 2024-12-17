package com.aluracursos.audios.modelos;

public class Favoritos {
    public void incluirLista(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos");

        }else{
            System.out.println(audio.getTitulo() + " No es de los favoritos por ahora!");
        }
    }
}

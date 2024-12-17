package principal;

import com.aluracursos.audios.modelos.Cancion;
import com.aluracursos.audios.modelos.Favoritos;
import com.aluracursos.audios.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
         Cancion miCancion = new Cancion();
         miCancion.setTitulo("The emptiness machine");
         miCancion.setArtista("Linkin Park");

         Podcast miPodcast = new Podcast();
         miPodcast.setAutor("Gabriela Aguilar");
         miPodcast.setTitulo("Cafe.Tech");

    //Canciones
        for (int i = 0; i < 5001; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 100000; i++) {
            miCancion.reproduce();
        }

    // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("\nTotal Reproducciones: " + miCancion.getTotalDeReproduccion() + "\nTotal de Me Gusta: " + miCancion.getMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.incluirLista(miCancion);
        favoritos.incluirLista(miPodcast);

    }
}

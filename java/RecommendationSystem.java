package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecommendationSystem {

    private List<Music> canciones;

    public RecommendationSystem() {

        canciones = new ArrayList<>();

        cargarCanciones();
    }

    private void cargarCanciones() {

        canciones.add(new Music(
                "Numb",
                "Linkin Park",
                "Rock",
                2003,
                9.8
        ));

        canciones.add(new Music(
                "In The End",
                "Linkin Park",
                "Rock",
                2001,
                9.7
        ));

        canciones.add(new Music(
                "Believer",
                "Imagine Dragons",
                "Rock",
                2017,
                9.5
        ));

        canciones.add(new Music(
                "Radioactive",
                "Imagine Dragons",
                "Rock",
                2012,
                9.4
        ));

        canciones.add(new Music(
                "Shape Of You",
                "Ed Sheeran",
                "Pop",
                2017,
                9.2
        ));

        canciones.add(new Music(
                "Blinding Lights",
                "The Weeknd",
                "Pop",
                2020,
                9.6
        ));

        canciones.add(new Music(
                "Vivir Mi Vida",
                "Marc Anthony",
                "Salsa",
                2013,
                9.1
        ));

        canciones.add(new Music(
                "Bohemian Rhapsody",
                "Queen",
                "Rock",
                1975,
                10.0
        ));
    }

    // Mostrar catálogo completo
    public void mostrarCatalogo() {

        System.out.println("\n========== CATÁLOGO ==========");

        for (Music musica : canciones) {

            musica.mostrarInformacion();

        }
    }

    // Recomendación aleatoria
    public void recomendar() {

        Random random = new Random();

        Music recomendada =
                canciones.get(
                        random.nextInt(canciones.size())
                );

        System.out.println("\n==============================");
        System.out.println(" RECOMENDACIÓN MUSICAL ");
        System.out.println("==============================");

        recomendada.mostrarInformacion();
    }

    // Recomendar por género
    public void recomendarPorGenero(String genero) {

        System.out.println(
                "\nRecomendaciones del género: "
                        + genero
        );

        boolean encontrada = false;

        for (Music musica : canciones) {

            if (musica.getGenero()
                    .equalsIgnoreCase(genero)) {

                musica.mostrarInformacion();

                encontrada = true;
            }
        }

        if (!encontrada) {

            System.out.println(
                    "No se encontraron canciones."
            );
        }
    }

    // Total de canciones
    public int totalCanciones() {

        return canciones.size();
    }
}
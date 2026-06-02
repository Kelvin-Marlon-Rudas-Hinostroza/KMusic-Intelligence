package model;

import java.util.List;

public class RecursiveRecommendation {

    // Método recursivo para mostrar recomendaciones
    public void recomendarPorGeneroRecursivo(
            List<Music> canciones,
            String genero,
            int indice) {

        // Caso base
        if (indice >= canciones.size()) {

            return;
        }

        Music musica = canciones.get(indice);

        if (musica.getGenero()
                .equalsIgnoreCase(genero)) {

            System.out.println(
                    "🎵 " +
                    musica.getTitulo() +
                    " - " +
                    musica.getArtista()
            );
        }

        // Llamada recursiva
        recomendarPorGeneroRecursivo(
                canciones,
                genero,
                indice + 1
        );
    }

    // Método recursivo para contar canciones
    public int contarCanciones(
            List<Music> canciones,
            int indice) {

        if (indice >= canciones.size()) {

            return 0;
        }

        return 1 + contarCanciones(
                canciones,
                indice + 1
        );
    }

    // Método recursivo para mostrar catálogo
    public void mostrarCatalogoRecursivo(
            List<Music> canciones,
            int indice) {

        if (indice >= canciones.size()) {

            return;
        }

        Music musica = canciones.get(indice);

        System.out.println(
                (indice + 1) + ". " +
                musica.getTitulo() +
                " - " +
                musica.getArtista()
        );

        mostrarCatalogoRecursivo(
                canciones,
                indice + 1
        );
    }
}
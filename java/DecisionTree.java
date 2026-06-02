package main;

import java.util.Scanner;
import model.DecisionTree;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        DecisionTree arbol = new DecisionTree();

        int opcion;

        do {

            System.out.println("\n====================================");
            System.out.println("      KMUSIC AI RECOMMENDER");
            System.out.println(" Sistema de Recomendación Musical");
            System.out.println(" Java + WEKA 3.8 + J48");
            System.out.println("====================================");

            System.out.println("1. Entrenar modelo WEKA");
            System.out.println("2. Mostrar información del sistema");
            System.out.println("3. Generar recomendación");
            System.out.println("4. Salir");

            System.out.print("\nSeleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println(
                        "\nEntrenando modelo J48..."
                    );

                    arbol.entrenarModelo(
                        "data/music_preferences.arff"
                    );

                    break;

                case 2:

                    mostrarInformacion();

                    break;

                case 3:

                    generarRecomendacion();

                    break;

                case 4:

                    System.out.println(
                        "\nGracias por utilizar KMusic AI."
                    );

                    break;

                default:

                    System.out.println(
                        "\nOpción no válida."
                    );

            }

        } while (opcion != 4);

        teclado.close();
    }

    public static void mostrarInformacion() {

        System.out.println("\n==============================");
        System.out.println("      INFORMACIÓN");
        System.out.println("==============================");

        System.out.println("Aplicación : KMusic AI");
        System.out.println("Tecnología : Java + WEKA");
        System.out.println("Algoritmo  : J48");
        System.out.println("Autor      : Kelvin Marlon Rudas Hinostroza");
        System.out.println("Versión    : 1.0");

    }

    public static void generarRecomendacion() {

        String[] canciones = {

            "Numb - Linkin Park",
            "In The End - Linkin Park",
            "Believer - Imagine Dragons",
            "Radioactive - Imagine Dragons",
            "Bohemian Rhapsody - Queen",
            "Shape Of You - Ed Sheeran",
            "Blinding Lights - The Weeknd",
            "Vivir Mi Vida - Marc Anthony"

        };

        int indice =
            (int)(Math.random() * canciones.length);

        System.out.println("\n==============================");
        System.out.println(" RECOMENDACIÓN GENERADA");
        System.out.println("==============================");

        System.out.println(
            "Canción recomendada: "
            + canciones[indice]
        );

    }
}
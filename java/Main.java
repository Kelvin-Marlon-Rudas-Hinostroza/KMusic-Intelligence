package main;

import java.util.Scanner;
import model.DecisionTree;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecisionTree tree = new DecisionTree();

        int opcion;

        do {

            System.out.println("\n======================================");
            System.out.println("      KMUSIC AI RECOMMENDER");
            System.out.println("======================================");
            System.out.println("1. Entrenar modelo WEKA");
            System.out.println("2. Generar recomendación");
            System.out.println("3. Información del sistema");
            System.out.println("4. Salir");
            System.out.println("======================================");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("\nEntrenando modelo...");

                    tree.entrenarModelo(
                            "data/music_preferences.arff"
                    );

                    break;

                case 2:

                    recomendarCancion();

                    break;

                case 3:

                    mostrarInformacion();

                    break;

                case 4:

                    System.out.println(
                            "\nGracias por usar KMusic AI."
                    );

                    break;

                default:

                    System.out.println(
                            "\nOpción inválida."
                    );
            }

        } while (opcion != 4);

        sc.close();
    }

    private static void recomendarCancion() {

        String[] canciones = {

                "Numb - Linkin Park",
                "In The End - Linkin Park",
                "Believer - Imagine Dragons",
                "Radioactive - Imagine Dragons",
                "Bohemian Rhapsody - Queen",
                "Shape Of You - Ed Sheeran",
                "Blinding Lights - The Weeknd",
                "Vivir Mi Vida - Marc Anthony",
                "Titanium - David Guetta",
                "Bad Habits - Ed Sheeran"

        };

        int aleatorio =
                (int) (Math.random() * canciones.length);

        System.out.println("\n======================================");
        System.out.println(" RECOMENDACIÓN MUSICAL ");
        System.out.println("======================================");
        System.out.println(
                "Canción recomendada: "
                        + canciones[aleatorio]
        );
    }

    private static void mostrarInformacion() {

        System.out.println("\n======================================");
        System.out.println(" INFORMACIÓN DEL SISTEMA ");
        System.out.println("======================================");
        System.out.println("Nombre : KMusic AI");
        System.out.println("Autor  : Kelvin Marlon Rudas Hinostroza");
        System.out.println("WEKA   : 3.8");
        System.out.println("Modelo : J48 Decision Tree");
        System.out.println("Lenguaje : Java");
        System.out.println("Proyecto : Sistema de Recomendación Musical");
    }
}
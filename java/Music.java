package model;

public class Music {

    private String titulo;
    private String artista;
    private String genero;
    private int anio;
    private double calificacion;

    // Constructor
    public Music(String titulo, String artista, String genero,
                 int anio, double calificacion) {

        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Mostrar información
    public void mostrarInformacion() {

        System.out.println("================================");
        System.out.println("Título      : " + titulo);
        System.out.println("Artista     : " + artista);
        System.out.println("Género      : " + genero);
        System.out.println("Año         : " + anio);
        System.out.println("Calificación: " + calificacion);
        System.out.println("================================");

    }

    @Override
    public String toString() {

        return "Music{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", calificacion=" + calificacion +
                '}';
    }
}
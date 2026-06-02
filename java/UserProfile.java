package model;

public class UserProfile {

    private String nombre;
    private String generoFavorito;
    private int edad;
    private String artistaFavorito;
    private int cancionesEscuchadas;
    private int cancionesFavoritas;

    // Constructor
    public UserProfile(String nombre,
                       String generoFavorito,
                       int edad,
                       String artistaFavorito) {

        this.nombre = nombre;
        this.generoFavorito = generoFavorito;
        this.edad = edad;
        this.artistaFavorito = artistaFavorito;

        this.cancionesEscuchadas = 0;
        this.cancionesFavoritas = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public int getEdad() {
        return edad;
    }

    public String getArtistaFavorito() {
        return artistaFavorito;
    }

    public int getCancionesEscuchadas() {
        return cancionesEscuchadas;
    }

    public int getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setArtistaFavorito(String artistaFavorito) {
        this.artistaFavorito = artistaFavorito;
    }

    // Métodos de actividad
    public void escucharCancion() {
        cancionesEscuchadas++;
    }

    public void agregarFavorito() {
        cancionesFavoritas++;
    }

    // Mostrar perfil
    public void mostrarPerfil() {

        System.out.println("\n==============================");
        System.out.println(" PERFIL DEL USUARIO ");
        System.out.println("==============================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género Favorito: " + generoFavorito);
        System.out.println("Artista Favorito: " + artistaFavorito);
        System.out.println("Canciones Escuchadas: " + cancionesEscuchadas);
        System.out.println("Canciones Favoritas: " + cancionesFavoritas);
        System.out.println("==============================");
    }

    @Override
    public String toString() {

        return "UserProfile{" +
                "nombre='" + nombre + '\'' +
                ", generoFavorito='" + generoFavorito + '\'' +
                ", edad=" + edad +
                ", artistaFavorito='" + artistaFavorito + '\'' +
                ", cancionesEscuchadas=" + cancionesEscuchadas +
                ", cancionesFavoritas=" + cancionesFavoritas +
                '}';
    }
}
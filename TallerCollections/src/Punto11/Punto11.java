package Punto11;

public class Punto11 {
    public static void main(String[] args) {
        AplicacionMusica app = new AplicacionMusica();
        
        app.agregarFavorito("Bohemian Rhapsody - Queen");
        app.agregarFavorito("Imagine - John Lennon");
        app.agregarFavorito("Hotel California - Eagles");
        app.agregarFavorito("Thriller - Michael Jackson");
        
        app.mostrarFavoritos();
        
        app.agregarFavorito("Hotel California - Eagles");
        
        System.out.println("\nDespués de intentar agregar un duplicado:");
        app.mostrarFavoritos();
        
        app.eliminarFavorito("Imagine - John Lennon");
        
        System.out.println("\nDespués de eliminar una canción:");
        app.mostrarFavoritos();
    }
}

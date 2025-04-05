package Punto11;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class AplicacionMusica {
    private LinkedHashSet<String> cancionesFavoritas;
    
    public AplicacionMusica() {
        cancionesFavoritas = new LinkedHashSet<>();
    }
    
    public void agregarFavorito(String cancion) {
        boolean agregada = cancionesFavoritas.add(cancion);
        
        if (agregada) {
            System.out.println("Canción agregada a favoritos: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos: " + cancion);
        }
    }
    
    public void eliminarFavorito(String cancion) {
        boolean eliminada = cancionesFavoritas.remove(cancion);
        
        if (eliminada) {
            System.out.println("Canción eliminada de favoritos: " + cancion);
        } else {
            System.out.println("La canción no está en favoritos: " + cancion);
        }
    }
    
    public void mostrarFavoritos() {
        System.out.println("Canciones favoritas (en orden de agregación):");
        
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("No hay canciones favoritas");
        } else {
            int contador = 1;
            Iterator<String> iterador = cancionesFavoritas.iterator();
            
            while (iterador.hasNext()) {
                System.out.println(contador + ". " + iterador.next());
                contador++;
            }
        }
    }
} 
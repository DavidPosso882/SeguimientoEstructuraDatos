package Punto12;

import java.util.TreeSet;

public class GestorEstudiantes {
    private TreeSet<String> listaEstudiantes;
    
    public GestorEstudiantes() {
        listaEstudiantes = new TreeSet<>();
    }
    
    public void agregarEstudiante(String nombre) {
        listaEstudiantes.add(nombre);
    }
    
    public String obtenerPrimerEstudiante() {
        return listaEstudiantes.first();
    }
    
    public String obtenerUltimoEstudiante() {
        return listaEstudiantes.last();
    }
    
    public void mostrarEstudiantes() {
        for (String estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
} 
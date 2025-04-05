package Punto12;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<String> estudiantes = new TreeSet<>();
        
        estudiantes.add("David Posso");
        estudiantes.add("Daniela Arboleda");
        estudiantes.add("David Pedraza");
        estudiantes.add("Camilo Ospina");
        estudiantes.add("Juan Pablo"); 
        
        System.out.println("Lista ordenada:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        
        System.out.println("\nPrimer estudiante: " + estudiantes.first());
        System.out.println("Último estudiante: " + estudiantes.last());
    }
}

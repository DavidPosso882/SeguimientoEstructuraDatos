package Punto8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        lista.insertar(new Persona("12345", "Juan"));
        lista.insertar(new Persona("123456", "Maria"));
        lista.insertar(new Persona("123", "Pedro"));
        lista.insertar(new Persona("12345678", "Ana"));

        System.out.println("Lista original:");
        lista.imprimirLista();

        System.out.println("\nPersonas con cédula de longitud par:");
        List<Persona> personasPar = lista.obtenerPersonasCedulaPar();
        for (Persona p : personasPar) {
            System.out.println(p);
        }
    }
} 
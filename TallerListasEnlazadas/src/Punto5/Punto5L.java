package Punto5;

public class Punto5L {
    public static void main(String[] args) {

        ListaEnlazada miLista = new ListaEnlazada();

        miLista.agregar(5);
        miLista.agregar(10);
        miLista.agregar(3);
        miLista.agregar(5);
        miLista.agregar(8);
        miLista.agregar(5);
        miLista.agregar(10);
        miLista.agregar(2);

        // Mostramos la lista completa.
        System.out.println("--- Lista Creada ---");
        miLista.mostrar();

        // Probamos el método contarRepeticiones.
        int valorABuscar1 = 5;
        int cantidad1 = miLista.contarRepeticiones(valorABuscar1);
        System.out.println("\nEl número " + valorABuscar1 + " se repite " + cantidad1 + " veces.");

        int valorABuscar2 = 10;
        int cantidad2 = miLista.contarRepeticiones(valorABuscar2);
        System.out.println("El número " + valorABuscar2 + " se repite " + cantidad2 + " veces.");

        int valorABuscar3 = 7; // Un número que no está en la lista.
        int cantidad3 = miLista.contarRepeticiones(valorABuscar3);
        System.out.println("El número " + valorABuscar3 + " se repite " + cantidad3 + " veces.");

        int valorABuscar4 = 8;
        int cantidad4 = miLista.contarRepeticiones(valorABuscar4);
        System.out.println("El número " + valorABuscar4 + " se repite " + cantidad4 + " veces.");
    }
} 
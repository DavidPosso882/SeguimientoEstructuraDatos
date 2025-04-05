package Punto6;

// Clase principal para probar la impresión hacia atrás en una lista doble.
public class Punto6L {
    public static void main(String[] args) {
        // Creamos una nueva lista doblemente enlazada.
        ListaDoblementeEnlazada miListaDoble = new ListaDoblementeEnlazada();

        System.out.println("--- Agregando Elementos ---");
        // Agregamos algunos números.
        miListaDoble.agregarAlFinal(10);
        miListaDoble.agregarAlFinal(20);
        miListaDoble.agregarAlFinal(30);
        miListaDoble.agregarAlFinal(40);
        miListaDoble.agregarAlFinal(50);

        // Mostramos la lista en ambas direcciones.
        System.out.println("\n--- Mostrando la Lista ---");
        miListaDoble.imprimirHaciaAdelante();
        miListaDoble.imprimirHaciaAtras(); // ¡La prueba clave!

        // Probemos con una lista vacía
        System.out.println("\n--- Probando con Lista Vacía ---");
        ListaDoblementeEnlazada listaVacia = new ListaDoblementeEnlazada();
        listaVacia.imprimirHaciaAdelante();
        listaVacia.imprimirHaciaAtras();

        // Probemos con un solo elemento
        System.out.println("\n--- Probando con Un Elemento ---");
        ListaDoblementeEnlazada listaUnica = new ListaDoblementeEnlazada();
        listaUnica.agregarAlFinal(99);
        listaUnica.imprimirHaciaAdelante();
        listaUnica.imprimirHaciaAtras();
    }
} 
package Punto6;

// Este nodo es para listas doblemente enlazadas.
// Tiene una conexión hacia adelante y otra hacia atrás.
public class NodoDoble {
    int dato; // El número que guardamos.
    NodoDoble siguiente; // Apunta al nodo de adelante.
    NodoDoble anterior; // Apunta al nodo de atrás.

    // Constructor para crear un nuevo nodo doble.
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null; // Al inicio, no apunta a nadie adelante.
        this.anterior = null; // Al inicio, no apunta a nadie atrás.
    }
} 
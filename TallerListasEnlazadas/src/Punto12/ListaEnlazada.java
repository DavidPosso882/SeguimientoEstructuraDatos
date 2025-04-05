package Punto12;

public class ListaEnlazada {
    private Nodo cabeza;
    private int tamano;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamano = 0;
    }

    public void insertar(double dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamano++;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public int getTamano() {
        return tamano;
    }
} 
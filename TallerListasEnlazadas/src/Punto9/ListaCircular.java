package Punto9;

public class ListaCircular {
    private Nodo ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (ultimo == null) {
            ultimo = nuevoNodo;
            ultimo.setSiguiente(ultimo); // Apunta a sí mismo
        } else {
            nuevoNodo.setSiguiente(ultimo.getSiguiente()); // El nuevo apunta al primero
            ultimo.setSiguiente(nuevoNodo); // El último apunta al nuevo
            ultimo = nuevoNodo; // El nuevo es ahora el último
        }
    }

    public boolean buscar(int dato) {
        if (ultimo == null) {
            return false;
        }

        Nodo actual = ultimo.getSiguiente(); // Empezamos por el primero
        do {
            if (actual.getDato() == dato) {
                return true;
            }
            actual = actual.getSiguiente();
        } while (actual != ultimo.getSiguiente()); // Mientras no volvamos al inicio

        return false; // No se encontró
    }

    public void imprimirLista() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo actual = ultimo.getSiguiente(); // Empezamos por el primero
        System.out.print("Lista: ");
        do {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        } while (actual != ultimo.getSiguiente()); // Mientras no volvamos al inicio
        System.out.println("(vuelve al inicio)");
    }
} 
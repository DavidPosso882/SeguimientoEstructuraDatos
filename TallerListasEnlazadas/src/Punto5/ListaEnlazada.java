package Punto5;

public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public int contarRepeticiones(int valorBuscado) {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == valorBuscado) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrar() {
        System.out.print("Lista: ");
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.print("[Vacía]");
        }
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
} 
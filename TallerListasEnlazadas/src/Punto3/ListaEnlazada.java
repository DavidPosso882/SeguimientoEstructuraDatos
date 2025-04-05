package Punto3;

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
        System.out.println("Agregado: " + dato);
    }

    public void eliminarPares() {
        System.out.println("\nEliminando números pares...");

        while (cabeza != null && cabeza.dato % 2 == 0) {
            System.out.println("Eliminando par al inicio: " + cabeza.dato);
            cabeza = cabeza.siguiente;
        }

        if (cabeza == null) {
            System.out.println("La lista quedó vacía después de eliminar pares iniciales.");
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            // Si el *siguiente* nodo es par...
            if (actual.siguiente.dato % 2 == 0) {
                System.out.println("Eliminando par: " + actual.siguiente.dato);

                actual.siguiente = actual.siguiente.siguiente;
            } else {

                actual = actual.siguiente;
            }
        }
         System.out.println("Proceso de eliminación de pares completado.");
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
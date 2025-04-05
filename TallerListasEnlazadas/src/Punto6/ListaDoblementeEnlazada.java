package Punto6;

public class ListaDoblementeEnlazada {
    NodoDoble cabeza;
    NodoDoble cola;   

    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarAlFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        System.out.println("Agregando al final: " + dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo; 
            nuevoNodo.anterior = cola; 
            cola = nuevoNodo;          
        }
    }

    public void imprimirHaciaAdelante() {
        System.out.print("Lista (adelante): cabeza -> ");
        NodoDoble actual = cabeza;
        if (actual == null) {
            System.out.print("[Vacía]");
        }
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para imprimir la lista hacia atrás, desde la cola hasta la cabeza.
    public void imprimirHaciaAtras() {
        System.out.print("Lista (atrás):   cola -> ");
        NodoDoble actual = cola;

        // Si la lista está vacía...
        if (actual == null) {
            System.out.print("[Vacía]");
        }

        // Mientras haya un nodo actual...
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null (llegamos antes de la cabeza)");
    }
} 
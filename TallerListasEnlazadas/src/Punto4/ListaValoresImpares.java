package Punto4;

public class ListaValoresImpares {
    private static class Nodo {
        int dato;
        Nodo siguiente;
    
        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    Nodo cabeza;
    int size;
    public void agregar(int dato) {
        if (cabeza == null) {
            cabeza = new Nodo(dato);
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = new Nodo(dato);
        }
        size++;
    }
    
    public ListaValoresImpares obtenerListaImpares() {
        ListaValoresImpares listaImpares = new ListaValoresImpares();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato % 2 != 0) { // Verifica si el número es impar
                listaImpares.agregar(actual.dato);
            }
            actual = actual.siguiente;
        }
        return listaImpares;
    }
    
        public void imprimir() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
}

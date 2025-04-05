package Punto1;

public class ListaImpares {
    private static class Nodo {
        int dato;
        Nodo siguiente;
    
        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo cabeza;
    private int size;
    
    public void agregar(int dato) {
        if (cabeza == null) {
            cabeza = new Nodo(dato);
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = new Nodo(dato);
            size++;
        }
    }
    
    public void imprimirImpares() {
        Nodo actual = cabeza;
        int indice = 0; 
        while (actual != null) {
            if (indice % 2 != 0) { // Ahora tomamos los índices impares
                System.out.print(actual.dato + " ");
            }
            actual = actual.siguiente;
            indice++;
        }
        System.out.println();
    }

    public int size(){
        return size;
    }
}


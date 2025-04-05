package Punto7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaDobleIterador<T> implements Iterable<T> {
    private static class NodoDoble<T> {
        T dato;
        NodoDoble<T> siguiente, anterior;
        
        public NodoDoble(T dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int size;

    public ListaDobleIterador() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    public void agregarFinal(T dato) {
        NodoDoble<T> nuevoNodo = new NodoDoble<T>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        size++;
    }

    public int size() {
        return size;
    }
    
    // Eliminar el primer elemento de la lista
    public T removeFirst() {
        if (cabeza == null) {
            throw new RuntimeException("La lista está vacía");
        }
        T dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        if (cabeza != null) {  // Si aún quedan elementos, actualizamos el puntero 'anterior'
            cabeza.anterior = null;
        } else {             // Si la lista queda vacía, también ajustamos la referencia de 'cola'
            cola = null;
        }
        size--;
        return dato;
    }

    // Iterator
    @Override
	public Iterator<T> iterator() {
		
		return new IteradorListaDoble (cabeza);
	}

	public class IteradorListaDoble implements Iterator<T>{
		private NodoDoble<T> nodo;
        private int posicion;

        public IteradorListaDoble(NodoDoble<T> inicio) {
            this.nodo = inicio;
            this.posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return nodo != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T dato = nodo.dato;
            nodo = nodo.siguiente;
            posicion++;
            return dato;
        }
	}  
    
}

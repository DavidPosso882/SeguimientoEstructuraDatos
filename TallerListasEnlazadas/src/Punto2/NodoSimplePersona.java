package Punto2;

public class NodoSimplePersona {
    Persona dato;
    NodoSimplePersona siguiente;

    public NodoSimplePersona(Persona dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Persona getDato() {
        return dato;
    }

    public NodoSimplePersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimplePersona siguiente) {
        this.siguiente = siguiente;
    }
}

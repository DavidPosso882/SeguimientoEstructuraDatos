package Punto13;

public class NodoLista {
    int dato;
    NodoLista sig;
    public NodoLista(int x){
        dato = x;
        sig = null;
    }
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public NodoLista getSig() {
        return sig;
    }
    public void setSig(NodoLista sig) {
        this.sig = sig;
    }
    
}

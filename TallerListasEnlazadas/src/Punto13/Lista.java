package Punto13;

public class Lista {
    NodoLista inicio;
    int size;

    public Lista(){
        inicio = null;
        size=0;
    }

public int maximaDistancia(int clave) {
    return maximaDistanciaRec(inicio, clave, 0, -1, 0);
}

private int maximaDistanciaRec(NodoLista p, int clave, int indice, int posAnterior, int distMax) {
    if (p == null) {
        return distMax;
    }

    if (p.getDato() == clave) {
        if (posAnterior != -1) {
            int dist = indice - posAnterior;
            if (dist > distMax) {
                distMax = dist;
            }
        }
        
        posAnterior = indice;
    }

    return maximaDistanciaRec(p.getSig(), clave, indice + 1, posAnterior, distMax);
}
    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

}

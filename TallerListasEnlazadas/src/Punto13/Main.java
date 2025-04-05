package Punto13;

public class Main {
    public static void main(String[] args) {
        Lista miLista = new Lista();

        // Supongamos que agregamos elementos así:
        miLista.setInicio(new NodoLista(9));
        miLista.getInicio().setSig(new NodoLista(4));;
        miLista.getInicio().getSig().setSig(new NodoLista(6));
        miLista.getInicio().getSig().getSig().setSig(new NodoLista(8));
        miLista.getInicio().getSig().getSig().getSig().setSig(new NodoLista(4));
        miLista.getInicio().getSig().getSig().getSig().getSig().setSig(new NodoLista(5));
        miLista.getInicio().getSig().getSig().getSig().getSig().getSig().setSig(new NodoLista(4));
        miLista.getInicio().getSig().getSig().getSig().getSig().getSig().getSig().setSig(new NodoLista(4));

        int clave = 4;
        int resultado = miLista.maximaDistancia(clave);

        System.out.println("Máxima distancia entre elementos con clave " + clave + ": " + resultado);

        System.out.println("Recorrido de la lista:");
        NodoLista actual = miLista.getInicio();
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSig();
        }
    }
}

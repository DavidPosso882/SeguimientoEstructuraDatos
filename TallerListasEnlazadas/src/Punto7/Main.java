package Punto7;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListaDobleIterador<Integer> lista = new ListaDobleIterador<>();
        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        lista.agregarFinal(40);

        Iterator<Integer> iterador = lista.iterator();        

        System.out.println("Recorrido hacia adelante:");
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }
    }
}

package Punto3;

public class Punto3L {
    public static void main(String[] args) {

        ListaEnlazada miLista = new ListaEnlazada();

        miLista.agregar(2);
        miLista.agregar(4);
        miLista.agregar(1);
        miLista.agregar(3);
        miLista.agregar(6);
        miLista.agregar(8);
        miLista.agregar(5);
        miLista.agregar(10);
        miLista.agregar(7);
        miLista.agregar(12);

        System.out.println("\n--- Lista Original ---");
        miLista.mostrar();

        miLista.eliminarPares();

        System.out.println("\n--- Lista Modificada (sin pares) ---");
        miLista.mostrar();

        System.out.println("\n--- Nueva Lista ---");
        ListaEnlazada otraLista = new ListaEnlazada();
        otraLista.agregar(1);
        otraLista.agregar(2);
        otraLista.agregar(3);
        otraLista.agregar(4);
        otraLista.agregar(5);

        System.out.println("\n--- Lista Original 2 ---");
        otraLista.mostrar();
        otraLista.eliminarPares();
        System.out.println("\n--- Lista Modificada 2 (sin pares) ---");
        otraLista.mostrar();

        System.out.println("\n--- Lista Solo Pares ---");
        ListaEnlazada listaPares = new ListaEnlazada();
        listaPares.agregar(2);
        listaPares.agregar(4);
        listaPares.agregar(6);

        System.out.println("\n--- Lista Original 3 ---");
        listaPares.mostrar();
        listaPares.eliminarPares();
        System.out.println("\n--- Lista Modificada 3 (sin pares) ---");
        listaPares.mostrar();
    }
} 
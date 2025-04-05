package Punto9;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        System.out.println("Lista después de insertar:");
        lista.imprimirLista();

        System.out.println("\nBuscando elementos:");
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 50: " + lista.buscar(50));
        System.out.println("Buscar 10: " + lista.buscar(10)); 
        System.out.println("Buscar 40: " + lista.buscar(40));
    }
} 
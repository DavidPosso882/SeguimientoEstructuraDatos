package Punto1;

public class Main {
    public static void main(String[] args) {
        ListaImpares lista = new ListaImpares();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("Tamaño de la lista: " + lista.size()); 
        lista.imprimirImpares();
    }
}

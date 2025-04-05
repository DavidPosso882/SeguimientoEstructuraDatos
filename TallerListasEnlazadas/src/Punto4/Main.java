package Punto4;

public class Main {
    public static void main(String[] args) {
        ListaValoresImpares lista = new ListaValoresImpares();
        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(22);
        lista.agregar(33);
        lista.agregar(41);
        lista.agregar(50);

        System.out.println("Lista original:");
        lista.imprimir();

        ListaValoresImpares listaImpares = lista.obtenerListaImpares();
        System.out.println("Lista de números impares:");
        listaImpares.imprimir();
    }
}

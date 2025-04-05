package Punto2;

public class Main{

    public static void main(String[] args) {

        ListaSimplePersona listaOriginal = new ListaSimplePersona();

        System.out.println("Agregando personas a la lista original...");
        listaOriginal.agregarAlFinal(new Persona("Ana", 12345));
        listaOriginal.agregarAlFinal(new Persona("Luis", 9876));
        listaOriginal.agregarAlFinal(new Persona("Carlos", 1020304));
        listaOriginal.agregarAlFinal(new Persona("Maria", 55));
        listaOriginal.agregarAlFinal(new Persona("Juan", 8));
        listaOriginal.agregarAlFinal(new Persona("Sofia", 12345678));
        listaOriginal.agregarAlFinal(new Persona("Pedro", 101));

        System.out.println("\nLista Original Completa:");
        listaOriginal.imprimirLista();

        System.out.println("\nObteniendo la lista de personas con cédula de longitud par...");
        ListaSimplePersona listaFiltrada = listaOriginal.obtenerPersonasCedulaPar();

        System.out.println("\nLista Filtrada (Solo cédulas con longitud par):");
        listaFiltrada.imprimirLista();

        System.out.println("\nVerificación: Lista Original (no debe haber cambiado):");
        listaOriginal.imprimirLista();
    }
}

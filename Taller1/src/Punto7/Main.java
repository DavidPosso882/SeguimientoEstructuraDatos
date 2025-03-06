package Punto7;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente("Cliente 1");
        banco.agregarCliente("Cliente 2");
        banco.agregarClienteUrgente("Cliente Urgente 1");
        banco.agregarCliente("Cliente 3");

        banco.mostrarCola();

        System.out.println("Atendiendo: " + banco.atenderCliente());
        banco.mostrarCola();
    }
}

package Punto7;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String> colaClientes;

    public Banco() {
        colaClientes = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
    }

    public String atenderCliente() {
        if (!colaClientes.isEmpty()) {
            return colaClientes.removeFirst();
        } else {
            return "No hay clientes en la cola.";
        }
    }

    public void agregarClienteUrgente(String cliente) {
        colaClientes.addFirst(cliente);
    }

    public void mostrarCola() {
        System.out.println("Cola de clientes: " + colaClientes);
    }
}

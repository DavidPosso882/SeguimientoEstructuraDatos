package Punto8;

import java.util.ArrayList;
import java.util.List;

public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    public List<Persona> obtenerPersonasCedulaPar() {
        List<Persona> personasCedulaPar = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getCedula().length() % 2 == 0) {
                personasCedulaPar.add(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        return personasCedulaPar;
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
} 
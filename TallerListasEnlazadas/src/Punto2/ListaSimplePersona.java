package Punto2;

public class ListaSimplePersona {
    private NodoSimplePersona inicio;

    public ListaSimplePersona() {
        this.inicio = null;
    }

    public boolean estaVacia() {
        return this.inicio == null;
    }

    public void agregarAlFinal(Persona persona) {
        NodoSimplePersona nuevoNodo = new NodoSimplePersona(persona);
        if (estaVacia()) {
            this.inicio = nuevoNodo;
        } else {
            NodoSimplePersona actual = this.inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("Lista vacía.");
            return;
        }
        System.out.print("Lista Personas (Cédulas): ");
        NodoSimplePersona actual = this.inicio;
        while (actual != null) {
            System.out.print(actual.getDato().getCedula() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    public ListaSimplePersona obtenerPersonasCedulaPar() {
        ListaSimplePersona listaResultado = new ListaSimplePersona();
        NodoSimplePersona actual = this.inicio;

        while (actual != null) {
            Persona personaActual = actual.getDato();
            long cedula = personaActual.getCedula();

            String cedulaStr = String.valueOf(cedula);
            int cantidadDigitos = cedulaStr.length();

            if (cantidadDigitos > 0 && cantidadDigitos % 2 == 0) {
                listaResultado.agregarAlFinal(personaActual);
            }


            actual = actual.getSiguiente();
        }

        return listaResultado;
    }
}

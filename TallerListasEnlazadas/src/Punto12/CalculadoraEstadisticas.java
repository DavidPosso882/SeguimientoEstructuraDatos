package Punto12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculadoraEstadisticas {

    public static ListaEnlazada leerNumerosDeArchivo(String nombreArchivo) throws IOException {
        ListaEnlazada lista = new ListaEnlazada();
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            try {
                double numero = Double.parseDouble(linea.trim());
                lista.insertar(numero);
            } catch (NumberFormatException e) {
                System.err.println("Advertencia: Ignorando línea no numérica: " + linea);
            }
        }
        reader.close();
        return lista;
    }

    public static double calcularMedia(ListaEnlazada lista) {
        if (lista.getTamano() == 0) {
            return 0.0;
        }
        double suma = 0.0;
        Nodo actual = lista.getCabeza();
        while (actual != null) {
            suma += actual.getDato();
            actual = actual.getSiguiente();
        }
        return suma / lista.getTamano();
    }

    public static double calcularDesviacionEstandar(ListaEnlazada lista, double media) {
        if (lista.getTamano() <= 1) {
            return 0.0;
        }
        double sumaDiferenciasCuadrado = 0.0;
        Nodo actual = lista.getCabeza();
        while (actual != null) {
            sumaDiferenciasCuadrado += Math.pow(actual.getDato() - media, 2);
            actual = actual.getSiguiente();
        }
        return Math.sqrt(sumaDiferenciasCuadrado / (lista.getTamano() - 1));
    }
} 
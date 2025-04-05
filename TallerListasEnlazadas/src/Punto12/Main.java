package Punto12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";

        // Crear un archivo de ejemplo si no existe
        crearArchivoEjemplo(nombreArchivo);

        try {
            ListaEnlazada numeros = CalculadoraEstadisticas.leerNumerosDeArchivo(nombreArchivo);

            if (numeros.getTamano() > 0) {
                System.out.println("Números leídos del archivo:");
                Nodo actual = numeros.getCabeza();
                while (actual != null) {
                    System.out.print(actual.getDato() + " ");
                    actual = actual.getSiguiente();
                }
                System.out.println("\n");

                double media = CalculadoraEstadisticas.calcularMedia(numeros);
                double desviacionEstandar = CalculadoraEstadisticas.calcularDesviacionEstandar(numeros, media);

                System.out.println("Resultados:");
                System.out.println("Cantidad de números (N): " + numeros.getTamano());
                System.out.printf("Media: %.4f\n", media);
                System.out.printf("Desviación Estándar: %.4f\n", desviacionEstandar);
            } else {
                System.out.println("El archivo está vacío o no contiene números válidos.");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Metodo auxiliar para crear un archivo de ejemplo
    private static void crearArchivoEjemplo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("10.5\n");
            writer.write("20.3\n");
            writer.write("15.8\n");
            writer.write("25.1\n");
            writer.write("18.9\n");
            writer.write("abc\n"); // Línea no numérica para probar el manejo de errores
            writer.write("22.7\n");
            System.out.println("Archivo de ejemplo '" + nombreArchivo + "' creado/sobreescrito.");
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo de ejemplo: " + e.getMessage());
        }
    }
} 
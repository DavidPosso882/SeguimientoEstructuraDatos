package Punto11;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();

        // Representando el polinomio: 3x^4 - 4x^2 + 11
        polinomio.agregarTermino(3, 4);
        polinomio.agregarTermino(-4, 2);
        polinomio.agregarTermino(11, 0);

        System.out.println("Polinomio: " + polinomio);
        System.out.println("\nTabla de valores:");
        System.out.println("-------------------");
        System.out.println("|   x   |  P(x)  |");
        System.out.println("-------------------");

        DecimalFormat df = new DecimalFormat("#.####");

        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double resultado = polinomio.evaluar(x);
            System.out.printf("| %5.1f | %6s |\n", x, df.format(resultado));
        }
        System.out.println("-------------------");
    }
} 
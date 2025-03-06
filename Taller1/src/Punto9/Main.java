package Punto9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Navegador navegador = new Navegador();
        int opcion;

        do {
            System.out.println("\n1. Visitar página");
            System.out.println("2. Retroceder");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la URL: ");
                    String url = scanner.nextLine();
                    navegador.visitarPagina(url);
                    break;
                case 2:
                    System.out.println(navegador.retroceder());
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (true);
    }
}


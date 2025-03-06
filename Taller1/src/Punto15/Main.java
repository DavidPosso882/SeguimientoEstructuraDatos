package Punto15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        Scanner scanner = new Scanner(System.in);
        
        directorio.agregarContacto("David Posso", "3301234567");
        directorio.agregarContacto("Daniela Arboleda", "3109876543");
        directorio.agregarContacto("David Pedraza", "3201111111");
        directorio.agregarContacto("Camilo Ospina", "3201111111");
        directorio.agregarContacto("Juan Pablo", "3109876543");
        
        while (true) {
            System.out.println("\n--- Directorio Telefónico ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Ver todos los contactos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            String opcionStr = scanner.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número: ");
                    String numero = scanner.nextLine();
                    directorio.agregarContacto(nombre, numero);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    nombre = scanner.nextLine();
                    directorio.buscarContacto(nombre);
                    break;
                case 3:
                    directorio.mostrarTodos();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }
} 
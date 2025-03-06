package Punto10;

import java.util.Scanner;

public class Main {

    /*
    En un edificio con control de acceso, los empleados deben identificarse mediante un
    código único para poder ingresar. Para gestionar estos accesos sin permitir
    duplicados, se utilizará un HashSet, donde cada ID de empleado será almacenado y
    verificado antes de permitir la entrada.
    */
    
    public static void main(String[] args) {
        Edificio control = new Edificio();
        Scanner scanner = new Scanner(System.in);

        control.registrarEmpleado(new Empleado("EMP001", "Juan Pérez"));
        control.registrarEmpleado(new Empleado("EMP002", "Ana Gómez"));
        control.registrarEmpleado(new Empleado("EMP003", "Carlos López"));
        control.registrarEmpleado(new Empleado("EMP003", "Diana López"));
        control.registrarEmpleado(new Empleado("EMP004", "Carlos López"));

        System.out.println("Ingrese su ID para acceder:");
        String idIngresado = scanner.nextLine();

        Empleado empleado = control.verificarAcceso(idIngresado);
        if (empleado != null) {
            System.out.println("Acceso permitido. Bienvenido, " + empleado.getNombre() + ".");
        } else {
            System.out.println("Acceso denegado. ID no registrado.");
        }

        scanner.close();

        System.out.println("Empleados registrados:");
        control.imprimirEmpleados();
    }
}

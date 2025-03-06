package Punto10.Formasencilla;

import java.util.HashSet;
import java.util.Scanner;

public class ControlAcceso {
    private HashSet<String> empleadosRegistrados;

    public ControlAcceso() {
        empleadosRegistrados = new HashSet<>();
    }

    public boolean registrarEmpleado(String id) {
        return empleadosRegistrados.add(id);
    }

    public boolean verificarAcceso(String id) {
        return empleadosRegistrados.contains(id);
    }

    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();
        Scanner scanner = new Scanner(System.in);

        control.registrarEmpleado("EMP001");
        control.registrarEmpleado("EMP002");
        control.registrarEmpleado("EMP003");

        System.out.println("Ingrese su ID para acceder:");
        String idIngresado = scanner.nextLine();

        if (control.verificarAcceso(idIngresado)) {
            System.out.println("Acceso permitido. Bienvenido.");
        } else {
            System.out.println("Acceso denegado. ID no registrado.");
        }

        scanner.close();
    }
}


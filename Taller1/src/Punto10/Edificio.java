package Punto10;

import java.util.HashSet;

public class Edificio {
    private HashSet<Empleado> empleados;

    public Edificio() {
        empleados = new HashSet<>();
    }

    public boolean registrarEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }

    public Empleado verificarAcceso(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
    public boolean eliminarEmpleado(Empleado empleado) {
        return empleados.remove(empleado);
    }

    public void imprimirEmpleados() {
        for (Empleado e : empleados) {
            System.out.println("ID: " + e.getId() + ", Nombre: " + e.getNombre());
        }
    }
    
}

package Punto10;

import java.util.Objects;

public class Empleado {
    private String id;
    private String nombre;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } 
        if (obj == null || getClass() != obj.getClass()){
            return false;
        } 
        Empleado empleado = (Empleado) obj;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

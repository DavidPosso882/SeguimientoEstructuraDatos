package Punto2;

public class Persona {
    String nombre;
    long cedula;

    public Persona(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Persona[Nombre: " + nombre + ", Cédula: " + cedula + "]";
    }
}

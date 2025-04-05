package Punto4;

public class Tarea implements Comparable<Tarea> {

    private String nombre;
    private int duracion;

    public Tarea(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        return Integer.compare(otraTarea.getDuracion(), this.duracion);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
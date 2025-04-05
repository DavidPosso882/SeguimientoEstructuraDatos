package Punto1;

public class Producto implements Comparable<Producto> {
    private String codigo;
    private String nombre;

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.codigo.compareTo(otroProducto.getCodigo());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
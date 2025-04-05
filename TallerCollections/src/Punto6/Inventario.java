package Punto6;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    public void eliminarProducto(String codigo) {
        boolean eliminado = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(codigo)) {
                productos.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void listarPorNombre() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("\nProductos ordenados por nombre:");
        ArrayList<Producto> productosOrdenados = new ArrayList<>(productos);
        productosOrdenados.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        for (Producto producto : productosOrdenados) {
            System.out.println(producto);
        }
    }

    public void listarPorPrecio() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("\nProductos ordenados por precio:");
        ArrayList<Producto> productosOrdenados = new ArrayList<>(productos);
        productosOrdenados.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });
        for (Producto producto : productosOrdenados) {
            System.out.println(producto);
        }
    }
} 
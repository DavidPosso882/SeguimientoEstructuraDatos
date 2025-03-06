package Punto6;

public class Tienda {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(new Producto("001", "Arroz", 2500));
        inventario.agregarProducto(new Producto("002", "Frijoles", 3000));
        inventario.agregarProducto(new Producto("003", "Leche", 1800));
        
        inventario.listarPorNombre();
        
        inventario.listarPorPrecio();
        
        Producto encontrado = inventario.buscarProducto("002");
        if (encontrado != null) {
            System.out.println("\nProducto encontrado: " + encontrado);
        }
        
        inventario.eliminarProducto("001");
        
        inventario.listarPorNombre();
    }
} 
package Punto1;

public class Main {
    /*
    Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar un método que busque un producto por su código.
    Se utiliza un comparador para que los productos se ordenen por código y su busqueda sea más eficiente.
    */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar productos a la empresa
        empresa.agregarProducto(new Producto("001", "Producto A"));
        empresa.agregarProducto(new Producto("002", "Producto B"));
        empresa.agregarProducto(new Producto("003", "Producto C"));

        // Buscar un producto por su código
        Producto productoBuscado = empresa.buscarProductoPorCodigo("004");
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("Producto no encontrado");
        }

        // Mostrar todos los productos
        empresa.mostrarProductos();
    }
}

package Punto16;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Supermercado {

    /*
    En un supermercado, se desea registrar los productos comprados en el orden en
    que fueron escaneados y calcular el total de la compra. Para lograr esto, se
    empleará un LinkedHashMap, asegurando que los productos y sus precios se
    almacenen en el mismo orden en que se añadieron, facilitando el procesamiento de
    la factura final.
    */
    public static void main(String[] args) {
        LinkedHashMap<String, Double> carrito = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String producto;
        double precio, total = 0.0;

        System.out.println("Ingrese los productos y sus precios (Escriba 'fin' para terminar):");

        while (true) {
            System.out.print("Producto: ");
            producto = scanner.nextLine();
            if (producto.equalsIgnoreCase("fin")){
                break;
            }

            System.out.print("Precio: ");
            precio = scanner.nextDouble();
            scanner.nextLine(); 

            carrito.put(producto, precio);
        }

        scanner.close();

        System.out.println("\nFactura de compra:");
        for (Map.Entry<String, Double> entry : carrito.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
            total += entry.getValue();
        }

        System.out.println("\nTotal a pagar: $" + total);
    }
}

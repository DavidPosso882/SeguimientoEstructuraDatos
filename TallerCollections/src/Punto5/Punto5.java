package Punto5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Punto5 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapaHash = new HashMap<>();
        
        mapaHash.put(101, "Teclado");
        mapaHash.put(102, "Mouse");
        mapaHash.put(103, "Monitor");
        mapaHash.put(104, "Auriculares");
        
        System.out.println("HashMap de productos:");
        for (Integer codigo : mapaHash.keySet()) {
            System.out.println("Código: " + codigo + ", Producto: " + mapaHash.get(codigo));
        }
        
        LinkedHashMap<Integer, String> mapaLinked = new LinkedHashMap<>();
        
        mapaLinked.put(101, "Teclado");
        mapaLinked.put(102, "Mouse");
        mapaLinked.put(103, "Monitor");
        mapaLinked.put(104, "Auriculares");
        
        System.out.println("\nLinkedHashMap de productos:");
        for (Integer codigo : mapaLinked.keySet()) {
            System.out.println("Código: " + codigo + ", Producto: " + mapaLinked.get(codigo));
        }
        
        TreeMap<Integer, String> mapaTree = new TreeMap<>();
        
        mapaTree.put(103, "Monitor");
        mapaTree.put(101, "Teclado");
        mapaTree.put(104, "Auriculares");
        mapaTree.put(102, "Mouse");
        
        System.out.println("\nTreeMap de productos:");
        for (Integer codigo : mapaTree.keySet()) {
            System.out.println("Código: " + codigo + ", Producto: " + mapaTree.get(codigo));
        }
        
        System.out.println("\nDiferencias entre los tipos de mapas:");
        
        System.out.println("1. HashMap:");
        System.out.println("   - No mantiene ningún orden específico de las claves");
        System.out.println("   - Operaciones básicas (put, get, remove) tienen complejidad O(1)");
        System.out.println("   - Es más rápido para búsquedas");
        
        System.out.println("\n2. LinkedHashMap:");
        System.out.println("   - Mantiene el orden de inserción de las claves");
        System.out.println("   - Operaciones básicas (put, get, remove) tienen complejidad O(1)");
        System.out.println("   - Útil cuando necesitamos recordar el orden en que se agregaron los elementos");
        
        System.out.println("\n3. TreeMap:");
        System.out.println("   - Mantiene las claves ordenadas (por orden natural o con un comparador)");
        System.out.println("   - Operaciones básicas (put, get, remove) tienen complejidad O(log n)");
        System.out.println("   - Útil cuando necesitamos los elementos ordenados por clave");
    }
}

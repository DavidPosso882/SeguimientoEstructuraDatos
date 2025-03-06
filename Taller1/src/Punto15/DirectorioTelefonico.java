package Punto15;

import java.util.HashMap;

public class DirectorioTelefonico {
    private HashMap<String, String> contactos;
    
    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }
    
    public void agregarContacto(String nombre, String numero) {
        contactos.put(nombre, numero);
        System.out.println("Contacto agregado exitosamente!");
    }
    
    public void buscarContacto(String nombre) {
        String numero = contactos.get(nombre);
        if (numero != null) {
            System.out.println("Número de " + nombre + ": " + numero);
        } else {
            System.out.println("No se encontró el contacto.");
        }
    }
    
    public void mostrarTodos() {
        if (contactos.isEmpty()) {
            System.out.println("El directorio está vacío.");
            return;
        }
        
        System.out.println("\nLista de contactos:");
        for (String nombre : contactos.keySet()) {
            System.out.println("Nombre: " + nombre + " - Teléfono: " + contactos.get(nombre));
        }
    }
} 
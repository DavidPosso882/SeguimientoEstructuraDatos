package Punto8;

import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios;
    
    public EditorTexto() {
        historialCambios = new Vector<>();
    }
    
    public void agregarCambio(String cambio) {
        historialCambios.add(cambio);
        System.out.println("Cambio realizado: " + cambio);
    }
    
    public void deshacer() {
        if (!historialCambios.isEmpty()) {
            String cambioEliminado = historialCambios.remove(historialCambios.size() - 1);
            System.out.println("Cambio deshecho: " + cambioEliminado);
        } else {
            System.out.println("No hay cambios para deshacer");
        }
    }
    
    public void mostrarHistorial() {
        System.out.println("Historial de cambios:");
        
        if (historialCambios.isEmpty()) {
            System.out.println("No hay cambios registrados");
        } else {
            for (int i = 0; i < historialCambios.size(); i++) {
                System.out.println((i + 1) + ". " + historialCambios.get(i));
            }
        }
    }
} 
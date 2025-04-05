package Punto14;

import java.util.ArrayDeque;
import java.util.Iterator;

public class AplicacionMensajeria {
    private ArrayDeque<String> historialMensajes;
    private final int LIMITE_MENSAJES = 10;
    
    public AplicacionMensajeria() {
        historialMensajes = new ArrayDeque<>();
    }
    
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado: " + mensaje);
        
        historialMensajes.addLast(mensaje);
        
        if (historialMensajes.size() > LIMITE_MENSAJES) {
            historialMensajes.removeFirst();
        }
    }
    
    public void mostrarHistorial() {
        System.out.println("Historial de mensajes (más recientes primero):");
        
        if (historialMensajes.isEmpty()) {
            System.out.println("No hay mensajes en el historial");
        } else {
            String[] mensajes = new String[historialMensajes.size()];
            int indice = mensajes.length - 1;
            
            Iterator<String> iterador = historialMensajes.iterator();
            while (iterador.hasNext()) {
                mensajes[indice] = iterador.next();
                indice--;
            }
            
            for (int i = 0; i < mensajes.length; i++) {
                System.out.println((i + 1) + ". " + mensajes[i]);
            }
        }
    }
} 
package Punto17;

import java.text.ParseException;

public class Punto17 {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        
        try {
            agenda.agregarEvento("2024-11-15 10:00", "Reunión de trabajo");
            agenda.agregarEvento("2025-06-20 15:30", "Cita médica");
            agenda.agregarEvento("2025-10-03 12:00", "Cumpleaños de David");
            agenda.agregarEvento("2025-12-05 20:00", "Cena de navidad");
            agenda.agregarEvento("2025-03-18 09:00", "Conferencia de tecnología");
            
            agenda.mostrarEventos();
            
            agenda.mostrarProximoEvento();
            
            agenda.eliminarEvento("2025-06-20 15:30");
            
            System.out.println("\nDespués de eliminar un evento:");
            agenda.mostrarEventos();
            
        } catch (ParseException e) {
            System.out.println("Error al procesar las fechas: " + e.getMessage());
        }
    }
} 
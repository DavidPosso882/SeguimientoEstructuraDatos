package Punto17;

import java.util.TreeMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class AgendaEventos {
    private TreeMap<Date, String> eventos;
    private SimpleDateFormat formatoFecha;
    
    public AgendaEventos() {
        eventos = new TreeMap<>();
        formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    }
    
    public void agregarEvento(String fechaHora, String descripcion) throws ParseException {
        Date fecha = formatoFecha.parse(fechaHora);
        eventos.put(fecha, descripcion);
        System.out.println("Evento agregado: " + descripcion + " para el " + formatoFecha.format(fecha));
    }
    
    public void eliminarEvento(String fechaHora) throws ParseException {
        Date fecha = formatoFecha.parse(fechaHora);
        String evento = eventos.remove(fecha);
        
        if (evento != null) {
            System.out.println("Evento eliminado: " + evento + " del " + formatoFecha.format(fecha));
        } else {
            System.out.println("No se encontró ningún evento para la fecha: " + fechaHora);
        }
    }
    
    public void mostrarEventos() {
        System.out.println("\nEventos en la agenda (ordenados por fecha):");
        
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos programados");
        } else {
            int contador = 1;
            for (Map.Entry<Date, String> entrada : eventos.entrySet()) {
                System.out.println(contador + ". " + formatoFecha.format(entrada.getKey()) + 
                                  " - " + entrada.getValue());
                contador++;
            }
        }
    }
    
    public void mostrarProximoEvento() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos programados");
        } else {
            Date ahora = new Date();
            Date proximaFecha = null;
            
            for (Date fecha : eventos.keySet()) {
                if (fecha.after(ahora)) {
                    proximaFecha = fecha;
                    break;
                }
            }
            
            if (proximaFecha != null) {
                System.out.println("\nPróximo evento:");
                System.out.println(formatoFecha.format(proximaFecha) + " - " + 
                                  eventos.get(proximaFecha));
            } else {
                System.out.println("\nNo hay eventos futuros programados");
            }
        }
    }
} 
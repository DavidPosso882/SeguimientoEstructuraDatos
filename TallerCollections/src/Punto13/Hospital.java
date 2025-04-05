package Punto13;

import java.util.PriorityQueue;

public class Hospital {
    
    PriorityQueue<Paciente> pacientes;
    
    public Hospital(){
        pacientes = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente){
        pacientes.offer(paciente);
    }

    public Paciente atenderPaciente(){
        return pacientes.poll();
    }

    public void imprimirPacientes(){
        for (Paciente p : pacientes) {
            System.out.println("Nombre: " + p.getNombre() + ", Prioridad: " + p.getPrioridad());
        }
    }
    
}

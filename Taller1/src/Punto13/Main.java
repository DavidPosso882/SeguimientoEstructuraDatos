package Punto13;

public class Main {

    /*
    En un hospital, los pacientes deben ser atendidos según la gravedad de su
    condición, con los más urgentes siendo tratados primero. Para manejar esto, se
    implementará una PriorityQueue, donde cada paciente será ingresado con un nivel
    de prioridad y el sistema garantizará que aquellos con mayor urgencia sean
    atendidos antes que los demás.
    */

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Paciente p1 = new Paciente("Juan", 1);
        Paciente p2 = new Paciente("Pedro", 2);
        Paciente p3 = new Paciente("Maria", 3);
        Paciente p4 = new Paciente("Ana", 4);
        Paciente p5 = new Paciente("Luis", 5);
        hospital.agregarPaciente(p5);
        hospital.agregarPaciente(p4);
        hospital.agregarPaciente(p3);
        hospital.agregarPaciente(p2);
        hospital.agregarPaciente(p1);
        hospital.imprimirPacientes();
        while(!hospital.pacientes.isEmpty()){
            System.out.println("Atendiendo a: " + hospital.atenderPaciente().getNombre());
        }
        
    }
}

package Punto4;

import java.util.PriorityQueue;

public class Main {
    /*
    Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una
    prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad
    de cada tarea según su importancia.
    la prioridad es la tarea con mayor duración.
    */
    public static void main(String[] args) {
        PriorityQueue<Tarea> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Tarea("Tarea1", 20));
        priorityQueue.add(new Tarea("Tarea2", 30));
        priorityQueue.add(new Tarea("Tarea3", 100));
        

        System.out.println("Elemento con mayor prioridad: " + priorityQueue.peek());

        while (!priorityQueue.isEmpty()) {
            System.out.println("Procesando: " + priorityQueue.poll());
        }

        System.out.println(priorityQueue.toString());

    }

}

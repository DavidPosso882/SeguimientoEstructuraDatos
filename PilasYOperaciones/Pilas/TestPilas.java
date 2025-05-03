package Pilas;

public class TestPilas {

    public static void main(String[] args) {
        System.out.println("Probando la clase Stack...");

        Stack<Integer> miPila = new Stack<>();
        System.out.println("Pila recién creada. ¿Está vacía? " + miPila.isEmpty());

        System.out.println("Apilando: 5, 10, 15");
        miPila.push(5);
        miPila.push(10);
        miPila.push(15);
        miPila.print();

        System.out.println("Tamaño actual: " + miPila.getSize());
        System.out.println("Elemento en el tope (peek): " + miPila.peek());
        System.out.println("¿Está vacía? " + miPila.isEmpty());

        System.out.println("Desapilando un elemento: " + miPila.pop());
        miPila.print();
        System.out.println("Desapilando otro elemento: " + miPila.pop());
        System.out.println("Elemento en el tope (peek): " + miPila.peek());
        System.out.println("Tamaño actual: " + miPila.getSize());

        System.out.println("Vaciando la pila...");
        miPila.clear();
        System.out.println("Tamaño después de clear: " + miPila.getSize());
        System.out.println("¿Está vacía después de clear? " + miPila.isEmpty()); 

        try {
            System.out.println("Intentando desapilar de pila vacía...");
            miPila.pop();
        } catch (RuntimeException e) {
            System.out.println("Excepción capturada (esperado): " + e.getMessage());
        }

        System.out.println("\nProbando eliminación de duplicados...");
        Stack<Integer> pilaConDuplicados = new Stack<>();
        pilaConDuplicados.push(5);
        pilaConDuplicados.push(10);
        pilaConDuplicados.push(5); 
        pilaConDuplicados.push(15);
        pilaConDuplicados.push(10);
        pilaConDuplicados.push(20);
        System.out.print("Pila original con duplicados: ");
        pilaConDuplicados.print();
        System.out.println("Tamaño original: " + pilaConDuplicados.getSize());

        pilaConDuplicados.eliminarDuplicados();

        System.out.print("Pila después de eliminar duplicados: ");
        pilaConDuplicados.print();
        System.out.println("Tamaño después de eliminar duplicados: " + pilaConDuplicados.getSize());

        System.out.println("\nPruebas de Stack completadas.");
    }
} 
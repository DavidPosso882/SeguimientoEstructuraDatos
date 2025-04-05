package Punto10;

public class ListaEnlazadaSimple<T> {
    // Clase interna que representa un nodo de la lista
    private static class Node<T> {
        T data;         // Dato almacenado en el nodo
        Node<T> next;   // Referencia al siguiente nodo
        public Node(T data) {
            super();
            this.data = data;
            this.next = null;
        }
    }
    // Atributos de la lista
    private Node<T> head;  // Referencia al primer nodo (cabeza)
    private int size;      // Número de elementos en la lista
    // Constructor de la lista
    public ListaEnlazadaSimple() {
        head = null;
        size = 0;
    }
    // Método para saber si la lista está vacía
    public boolean isEmpty() {
        return (head == null)?true:false;
    }
    // Verificar si el indice es válido
    private boolean indexValid(int index) {
        if(index >= 0 && index < size){
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds " + size);
    }
    // Obtener el tamaño de la lista
    public int size() {
        return size;
    }
    // Limpiar la lista
    public void clear() {
        head = null;
        size = 0;
    }    
    // Añadir un elemento al inicio de la lista
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // Imprimir la lista
    public void print() {
        if(isEmpty()){
            System.out.println("null");
        }
        else{
            Node<T> current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    public T get(int index) {
        if(index>=0 && index<size){
            Node<T> current = getNode(index);
            return current.data;
        }
        return null;
    }
    // Obtener el nodo en un lugar específico de la lista
    private Node<T> getNode(int index) {
        if(index>=0 && index<size){
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
        return null;
    }
}

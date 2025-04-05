package Punto10;

public class Main {
    public static void main(String[] args) {
        
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();
        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);
        System.out.println("Lista enlazada simple 1:");
        lista.print();

        ListaEnlazadaSimple<Integer> lista2 = new ListaEnlazadaSimple<>();
        lista2.addFirst(6);
        lista2.addFirst(5);
        lista2.addFirst(4);
        System.out.println("Lista enlazada simple 2:");
        lista2.print();

        // Concatenar las listas
        ListaEnlazadaSimple<Integer> listaConcatenada = concatenar(lista, lista2);
        System.out.println("Listas concatenadas:");
        listaConcatenada.print();

    }
    public static <T> ListaEnlazadaSimple<T> concatenar(ListaEnlazadaSimple <T> lista1, ListaEnlazadaSimple<T> lista2) {
        ListaEnlazadaSimple<T> listaConcatenada = new ListaEnlazadaSimple<>();
        if (lista1.isEmpty()) {
            for(int i = 0; i < lista2.size(); i++){
                listaConcatenada.addFirst(lista2.get(i));
            }
            return listaConcatenada;
        } else if (lista2.isEmpty()) {
            for(int i = 0; i < lista1.size(); i++){
                listaConcatenada.addFirst(lista1.get(i));
            }
            return listaConcatenada;
        }
        else{
            for (int i = 0; i < lista1.size(); i++) {
                listaConcatenada.addFirst(lista1.get(i));
            }
            for (int i = 0; i < lista2.size(); i++) {
                listaConcatenada.addFirst(lista2.get(i));
            }
            return listaConcatenada;
        }

    }
}

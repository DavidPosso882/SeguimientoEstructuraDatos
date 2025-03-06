package Punto3;

import java.util.HashSet;
import java.util.Iterator;

public class ElementosNoDuplicados {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("David");
        set.add("Daniela");
        set.add("David");
        set.add("Juan");
        set.add("Daniela");
        set.add("José");

        System.out.println("Elementos: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
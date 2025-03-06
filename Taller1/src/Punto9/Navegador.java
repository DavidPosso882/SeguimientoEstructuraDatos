package Punto9;

import java.util.Stack;

class Navegador {
    Stack<String> historial;

    public Navegador() {
        historial = new Stack<String>();
    }

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitaste: " + url);
    }

    public String retroceder() {
        if (historial.isEmpty()) {
            return "No hay páginas anteriores.";
        }
        historial.pop();
        if (historial.isEmpty()) {
            return "No hay más páginas anteriores.";
        } else {
            return "Regresaste a: " + historial.peek();
        }
    }
} 
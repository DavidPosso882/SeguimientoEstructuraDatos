package Operaciones;

import Pilas.Stack;

public class ConvertidorInfijoAPostfijo {

    private static int obtenerPrecedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String convertirAPostfijo(String expresionInfija) {
        StringBuilder expresionPostfija = new StringBuilder();
        Stack<Character> pilaOperadores = new Stack<>();

        for (int i = 0; i < expresionInfija.length(); i++) {
            char caracterActual = expresionInfija.charAt(i);

            if (Character.isDigit(caracterActual)) {
                expresionPostfija.append(caracterActual);
            }
            else if (caracterActual == '(') {
                pilaOperadores.push(caracterActual);
            }
            else if (caracterActual == ')') {
                while (!pilaOperadores.isEmpty() && pilaOperadores.peek() != '(') {
                    expresionPostfija.append(pilaOperadores.pop());
                }
                if (pilaOperadores.isEmpty()) {
                    return "Error: Expresión infija inválida (paréntesis)";
                }
                pilaOperadores.pop();
            }
            else if (obtenerPrecedencia(caracterActual) > 0) {
                while (!pilaOperadores.isEmpty() &&
                       pilaOperadores.peek() != '(' &&
                       obtenerPrecedencia(pilaOperadores.peek()) >= obtenerPrecedencia(caracterActual)) {
                    expresionPostfija.append(pilaOperadores.pop());
                }
                pilaOperadores.push(caracterActual);
            }
        }

        while (!pilaOperadores.isEmpty()) {
            if (pilaOperadores.peek() == '(') {
                return "Error: Expresión infija inválida (paréntesis)";
            }
            expresionPostfija.append(pilaOperadores.pop());
        }

        return expresionPostfija.toString();
    }
} 
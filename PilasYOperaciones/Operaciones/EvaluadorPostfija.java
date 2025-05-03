package Operaciones;

import Pilas.Stack;
import java.lang.Math;

public class EvaluadorPostfija {

    public static int evaluarPostfija(String expresion) {
        Stack<Integer> pilaOperandos = new Stack<>();
        String[] tokens = expresion.trim().split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;
            try {
                int numero = Integer.parseInt(token);
                pilaOperandos.push(numero);
            } catch (NumberFormatException e) {
                if (pilaOperandos.isEmpty()) throw new RuntimeException("Error: Faltan operandos para " + token);
                int operando2 = pilaOperandos.pop();

                if (pilaOperandos.isEmpty()) throw new RuntimeException("Error: Faltan operandos para " + token);
                int operando1 = pilaOperandos.pop();

                int resultado = 0;
                switch (token) {
                    case "+":
                        resultado = operando1 + operando2;
                        break;
                    case "-":
                        resultado = operando1 - operando2;
                        break;
                    case "*":
                        resultado = operando1 * operando2;
                        break;
                    case "/":
                        if (operando2 == 0) throw new RuntimeException("Error: División por cero");
                        resultado = operando1 / operando2;
                        break;
                    case "^":
                        resultado = (int) Math.pow(operando1, operando2);
                        break;
                    default:
                        throw new RuntimeException("Error: Operador desconocido '" + token + "'");
                }
                pilaOperandos.push(resultado); 
            }
        }

        if (pilaOperandos.isEmpty()) throw new RuntimeException("Error: Expresión vacía o inválida");
        int resultadoFinal = pilaOperandos.pop();
        if (!pilaOperandos.isEmpty()) throw new RuntimeException("Error: Sobran operandos en la pila");

        return resultadoFinal;
    }

    public static void main(String[] args) {
        //String infija = "3 + (6 * 8 / (3 ^ 2)) - 1";
        String infija = "(2 * ( 5 - 4 * 6 + ( 8 * 3 ^ 2 ) - 1 ) * 2)";
        System.out.println("Expresión Infija: " + infija);

        String postfija = ConvertidorInfijoAPostfijo.convertirAPostfijo(infija);
        System.out.println("Expresión Postfija: " + postfija);

        String postfijaConEspacios = postfija.replaceAll("", " ").trim();
         System.out.println("Expresión Postfija con espacios: " + postfijaConEspacios);


        try {
             int resultado = evaluarPostfija(postfijaConEspacios);
             System.out.println("Resultado: " + resultado);
         } catch (Exception e) {
            System.err.println("Error en la evaluación: " + e.getMessage());
         }
    }
}

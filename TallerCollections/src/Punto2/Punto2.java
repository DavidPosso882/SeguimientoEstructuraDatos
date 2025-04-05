package Punto2;

import java.util.Stack;

public class Punto2 {
    public static Stack<Object> stack = new Stack<>();
    public static void main(String[] args) {

        //stack.push(new Persona ("Daniela",20,"Estudiante"));
        apilar(new Persona("Dani",20,"estudiante"));

    }
    public static void apilar(Object ob){
        if(stack.empty()){
            stack.push(ob);
            System.out.print("Se guardo con exito, stack estaba vacio\n");

        }
        else if(ob.getClass().equals(stack.peek().getClass())){
            stack.push(ob);
            System.out.print("Si se puede\n");
        }
        else{
            System.out.print("No se puede\n");
        }
    }

}
package Punto8;

public class Punto8 {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        
        editor.agregarCambio("Escribir: Hola");
        editor.agregarCambio("Escribir: mundo");
        editor.agregarCambio("Agregar signo: !");
        
        editor.mostrarHistorial();
        
        editor.deshacer();
        System.out.println("\nDespués de deshacer:");
        editor.mostrarHistorial();
        
        editor.deshacer();
        System.out.println("\nDespués de deshacer nuevamente:");
        editor.mostrarHistorial();
    }
}

package Punto14;

public class Punto14 {
    public static void main(String[] args) {
        AplicacionMensajeria app = new AplicacionMensajeria();
        
        app.enviarMensaje("Hola, ¿cómo estás?");
        app.enviarMensaje("¿Vamos al cine esta noche?");
        app.enviarMensaje("Tengo entradas para las 8 PM");
        app.enviarMensaje("La película es 'El Padrino'");
        app.enviarMensaje("Podemos cenar después");
        
        app.mostrarHistorial();
        
        app.enviarMensaje("¿Te parece bien?");
        app.enviarMensaje("Nos vemos en la entrada");
        app.enviarMensaje("Llevo palomitas");
        app.enviarMensaje("No llegues tarde");
        app.enviarMensaje("Recuerda traer tu identificación");
        app.enviarMensaje("Ya estoy en camino");
        
        System.out.println("\nHistorial actualizado (últimos 10 mensajes):");
        app.mostrarHistorial();
    }
} 
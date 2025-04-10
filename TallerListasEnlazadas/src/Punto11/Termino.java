package Punto11;

public class Termino {
    private double coeficiente;
    private int exponente;
    private Termino siguiente;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public Termino getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Termino siguiente) {
        this.siguiente = siguiente;
    }
} 
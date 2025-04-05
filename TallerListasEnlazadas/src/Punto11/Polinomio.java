package Punto11;

public class Polinomio {
    private Termino cabeza;

    public Polinomio() {
        this.cabeza = null;
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Termino nuevoTermino = new Termino(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevoTermino;
        } else {
            Termino actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoTermino);
        }
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Termino actual = cabeza;
        while (actual != null) {
            resultado += actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    @Override
    public String toString() {
        if (cabeza == null) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Termino actual = cabeza;
        boolean primerTermino = true;

        while (actual != null) {
            double coef = actual.getCoeficiente();
            int exp = actual.getExponente();

            if (coef == 0) { 
                actual = actual.getSiguiente();
                continue;
            }

            if (!primerTermino) {
                sb.append(coef > 0 ? " + " : " - ");
            } else if (coef < 0) {
                 sb.append("-");
            }
            
            double absCoef = Math.abs(coef);
            if (absCoef != 1 || exp == 0) {
                 sb.append(absCoef);
            }
           
            if (exp > 0) {
                sb.append("x");
                if (exp > 1) {
                    sb.append("^").append(exp);
                }
            }

            primerTermino = false;
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
} 
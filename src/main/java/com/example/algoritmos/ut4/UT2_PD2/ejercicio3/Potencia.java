package com.example.ut4.UT2_PD2.ejercicio3;

public class Potencia {
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else if (exponente == 1) {
            return base; 
        } else if (exponente < 0) {

            return 1 / (base * potencia(base, -exponente - 1)); 
        } else {
            return base * potencia(base, exponente - 1); 
        }
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponente = 3;

        // Pruebas del algoritmo
        System.out.println("Resultado de " + base + " elevado a la potencia " + exponente + ": " + potencia(base, exponente));
        
        base = -2.0;
        exponente = 3;
        System.out.println("Resultado de " + base + " elevado a la potencia " + exponente + ": " + potencia(base, exponente));
        
        base = 2.0;
        exponente = -3;
        System.out.println("Resultado de " + base + " elevado a la potencia " + exponente + ": " + potencia(base, exponente));
        
        base = -2.0;
        exponente = -3;
        System.out.println("Resultado de " + base + " elevado a la potencia " + exponente + ": " + potencia(base, exponente));
    }
}


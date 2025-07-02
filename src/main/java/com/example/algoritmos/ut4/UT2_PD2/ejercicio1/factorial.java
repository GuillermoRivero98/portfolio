package com.example.ut4.UT2_PD2.ejercicio1;
 

public class factorial {
    public static int factorial(int numero) {

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return -1; 
        }

        if (numero == 0) {
            return 1; 
            
        } else {
            return numero * factorial(numero - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 0;
        int num4 = -3;

        // Pruebas del algoritmo
        System.out.println("Factorial de " + num1 + ": " + factorial(num1));
        System.out.println("Factorial de " + num2 + ": " + factorial(num2));
        System.out.println("Factorial de " + num3 + ": " + factorial(num3));
        System.out.println("Factorial de " + num4 + ": " + factorial(num4));
    }
}

package com.example.ut4.UT2_PD2.ejercicio2;

public class SumaLineal {
    public static int sumaLineal(int[] A, int n) {
        if (n <= 0) {

            System.out.println("El parámetro 'n' debe ser mayor que 0.");
            return 0;
        }
        if (n == 1) {
            return A[0]; 
        } else {
            return A[n - 1] + sumaLineal(A, n - 1); 
        }
    }

    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {};
        int n1 = 5;
        int n2 = -3;

        // Pruebas del algoritmo
        System.out.println("Suma lineal del arreglo1: " + sumaLineal(arreglo1, n1));
        System.out.println("Suma lineal del arreglo2: " + sumaLineal(arreglo2, 0));
        System.out.println("Suma lineal con n negativo: " + sumaLineal(arreglo1, n2));
    }
}

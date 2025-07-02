package com.example.ut4.UT2_PD2.ejercicio4;

public class InvertirVector {
    public static int[] invertirVector(int[] A, int inicio, int fin) {

        if (inicio >= fin || A.length == 0 || inicio < 0 || fin >= A.length) {
            return A;

        } else {
            
            int temp = A[inicio];
            A[inicio] = A[fin];
            A[fin] = temp;
            return invertirVector(A, inicio + 1, fin - 1);
        }
    }

    public static void main(String[] args) {
        // Prueba del algoritmo
        int[] vector = {1, 2, 3, 4, 5};
        
        System.out.println("Vector original:");
        imprimirVector(vector);

        invertirVector(vector, 1, 3);
        System.out.println("Vector invertido entre los índices 1 y 3:");
        imprimirVector(vector);

        int[] vectorVacio = {};
        invertirVector(vectorVacio, 0, 2);
        
        int[] vectorUnElemento = {9};
        System.out.println("Vector original (un elemento):");
        imprimirVector(vectorUnElemento);
        invertirVector(vectorUnElemento, 0, 0);
        System.out.println("Intento de invertir el vector con un solo elemento:");
        imprimirVector(vectorUnElemento);
        
        invertirVector(vector, -1, 6);
    }
    
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}


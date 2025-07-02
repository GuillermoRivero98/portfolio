package com.example.algoritmos.ut9.pruebas;

import com.example.algoritmos.ut9.ordenamiento.TClasificador;
import com.example.algoritmos.ut9.generador.GeneradorDatosGenericos;

public class MainUT9 {

    private static boolean estaOrdenado(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            if (vector[i - 1] > vector[i]) return false;
        }
        return true;
    }

    private static void imprimirVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TClasificador clasificador = new TClasificador();
        GeneradorDatosGenericos generador = new GeneradorDatosGenericos();

        // Vectores pequeños
        int[] vectorDesordenado = {5, 1, 4, 2, 3};
        int[] vectorAscendente = {1, 2, 3, 4, 5};
        int[] vectorDescendente = {5, 4, 3, 2, 1};

        // Pruebas de Inserción Directa
        System.out.println("Inserción directa:");
        probarMetodo(clasificador, vectorDesordenado.clone(), TClasificador.METODO_CLASIFICACION_INSERCION, "Desordenado");
        probarMetodo(clasificador, vectorAscendente.clone(), TClasificador.METODO_CLASIFICACION_INSERCION, "Ascendente");
        probarMetodo(clasificador, vectorDescendente.clone(), TClasificador.METODO_CLASIFICACION_INSERCION, "Descendente");

        // Pruebas de ShellSort
        System.out.println("\nShellSort:");
        probarMetodo(clasificador, vectorDesordenado.clone(), TClasificador.METODO_CLASIFICACION_SHELL, "Desordenado");
        probarMetodo(clasificador, vectorAscendente.clone(), TClasificador.METODO_CLASIFICACION_SHELL, "Ascendente");
        probarMetodo(clasificador, vectorDescendente.clone(), TClasificador.METODO_CLASIFICACION_SHELL, "Descendente");

        // Pruebas de Burbuja
        System.out.println("\nBurbuja:");
        probarMetodo(clasificador, vectorDesordenado.clone(), TClasificador.METODO_CLASIFICACION_BURBUJA, "Desordenado");
        probarMetodo(clasificador, vectorAscendente.clone(), TClasificador.METODO_CLASIFICACION_BURBUJA, "Ascendente");
        probarMetodo(clasificador, vectorDescendente.clone(), TClasificador.METODO_CLASIFICACION_BURBUJA, "Descendente");
    }

    private static void probarMetodo(TClasificador clasificador, int[] vector, int metodo, String tipo) {
        long inicio = System.nanoTime();
        int[] resultado = clasificador.clasificar(vector, metodo);
        long fin = System.nanoTime();
        System.out.println("Tipo: " + tipo);
        imprimirVector(resultado);
        System.out.println("¿Está ordenado?: " + estaOrdenado(resultado));
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ns\n");
    }
}

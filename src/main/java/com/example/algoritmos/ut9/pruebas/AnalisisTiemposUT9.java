package com.example.algoritmos.ut9.pruebas;

import com.example.algoritmos.ut9.generador.GeneradorDatosGenericos;
import com.example.algoritmos.ut9.ordenamiento.TClasificador;

public class AnalisisTiemposUT9 {

    public static void main(String[] args) {
        TClasificador clasificador = new TClasificador();
        GeneradorDatosGenericos generador = new GeneradorDatosGenericos();

        int[][] vectores = {
            generador.generarDatosAscendentes(),
            generador.generarDatosDescendentes(),
            generador.generarDatosAleatorios()
        };

        String[] nombresVectores = { "Ascendente", "Descendente", "Aleatorio" };
        int[] metodos = {
            TClasificador.METODO_CLASIFICACION_INSERCION,
            TClasificador.METODO_CLASIFICACION_BURBUJA,
            TClasificador.METODO_CLASIFICACION_SHELL,
            TClasificador.METODO_CLASIFICACION_QUICKSORT
        };
        String[] nombresMetodos = {
            "Inserción",
            "Burbuja",
            "ShellSort",
            "QuickSort"
        };

        System.out.printf("%-15s%-15s%-15s%n", "Vector", "Método", "Tiempo (ms)");

        for (int i = 0; i < vectores.length; i++) {
            for (int j = 0; j < metodos.length; j++) {
                int[] copia = vectores[i].clone(); 
                long inicio = System.nanoTime();
                clasificador.clasificar(copia, metodos[j]);
                long fin = System.nanoTime();
                long tiempoMs = (fin - inicio) / 1_000_000;
                System.out.printf("%-15s%-15s%-15d%n", nombresVectores[i], nombresMetodos[j], tiempoMs);
            }
        }
    }
}

/*
 * Burbuja es el más ineficiente en todos los casos.
 * Inserción funciona bien solo con datos ya ordenados.
 * ShellSort es muy eficiente hasta con vectores grandes o desordenados.
 * QuickSort con mediana como pivote tiene gran estabilidad y velocidad.
 */
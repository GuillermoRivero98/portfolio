package com.example.algoritmos.ut9.ordenamiento;

import org.junit.jupiter.api.Test;

import com.example.algoritmos.ut9.generador.GeneradorDatosGenericos;
import com.example.algoritmos.ut9.ordenamiento.TClasificador;

import static org.junit.jupiter.api.Assertions.*;

public class TClasificadorTest {

    TClasificador clasificador = new TClasificador();
    GeneradorDatosGenericos generador = new GeneradorDatosGenericos();

    @Test
    public void testInsercionAscendente() {
        int[] datos = {5, 2, 9, 1, 3};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_INSERCION);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, resultado);
    }

    @Test
    public void testBurbujaAscendente() {
        int[] datos = {8, 3, 7, 4, 2};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_BURBUJA);
        assertArrayEquals(new int[]{2, 3, 4, 7, 8}, resultado);
    }

    @Test
    public void testShellAscendente() {
        int[] datos = {10, 1, 5, 3, 7};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_SHELL);
        assertArrayEquals(new int[]{1, 3, 5, 7, 10}, resultado);
    }

    @Test
    public void testQuickSortAscendente() {
        int[] datos = {12, 4, 6, 9, 2};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_QUICKSORT);
        assertArrayEquals(new int[]{2, 4, 6, 9, 12}, resultado);
    }

    @Test
    public void testVectorVacio() {
        int[] datos = new int[]{};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_INSERCION);
        assertArrayEquals(new int[]{}, resultado);
    }

    @Test
    public void testUnElemento() {
        int[] datos = new int[]{42};
        int[] resultado = clasificador.clasificar(datos, TClasificador.METODO_CLASIFICACION_BURBUJA);
        assertArrayEquals(new int[]{42}, resultado);
    }

    @Test
    public void testAscendenteGrande() {
        int[] datos = generador.generarDatosAscendentes();
        int[] resultado = clasificador.clasificar(datos.clone(), TClasificador.METODO_CLASIFICACION_SHELL);
        assertTrue(estaOrdenado(resultado));
    }

    private boolean estaOrdenado(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            if (vector[i - 1] > vector[i]) return false;
        }
        return true;
    }
}

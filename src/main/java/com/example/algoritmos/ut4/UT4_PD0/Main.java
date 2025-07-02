package com.example.ut4.UT4_PD0;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creación del árbol binario desde notación prefija
        String expresionPrefija = "+ * 5 3 2"; // Ejemplo de expresión prefija
        
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = crearArbolDesdePrefija(expresionPrefija);
        
        // Evaluación de la expresión con valores concretos
        Map<String, Double> valores = new HashMap<>();
        valores.put("x", 5.0);
        valores.put("y", 3.0);
        
        double resultado = arbol.evaluarExpresion(valores);
        System.out.println("Resultado de la expresión: " + resultado);
    }

    private static Nodo crearArbolDesdePrefija(String expresionPrefija) {
        String[] tokens = expresionPrefija.split(" ");
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = arbol.construirArbol(tokens);
        return arbol.raiz;
    }
}

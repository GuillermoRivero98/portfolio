package com.example.ut4.UT4_PD0;

import java.util.Map;

class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario() {
        raiz = null;
    }
    
    public double evaluarExpresion(Map<String, Double> valoresVariables) {
        return evaluarExpresionRecursivo(raiz, valoresVariables);
    }
    
    private double evaluarExpresionRecursivo(Nodo nodo, Map<String, Double> valoresVariables) {
        if (nodo == null)
            throw new IllegalArgumentException("Árbol vacío");
        
        if (nodo.esOperando()) {
            if (nodo.esVariable()) {
                return valoresVariables.getOrDefault(nodo.valor, 0.0);
            } else {
                return Double.parseDouble(nodo.valor);
            }
        }
        
        double izquierdo = evaluarExpresionRecursivo(nodo.izquierdo, valoresVariables);
        double derecho = evaluarExpresionRecursivo(nodo.derecho, valoresVariables);
        
        switch (nodo.valor) {
            case "+":
                return izquierdo + derecho;
            case "-":
                return izquierdo - derecho;
            case "*":
                return izquierdo * derecho;
            case "/":
                if (derecho != 0)
                    return izquierdo / derecho;
                else
                    throw new ArithmeticException("División por cero");
            default:
                throw new IllegalArgumentException("Operador no válido");
        }
    }
    
    public Nodo crearArbolDesdePrefija(String expresion) {
        String[] tokens = expresion.split(" ");
        return construirArbol(tokens);
    }
    
    Nodo construirArbol(String[] tokens) {
        return construirArbolRecursivo(tokens, new int[]{0});
    }
    
    private Nodo construirArbolRecursivo(String[] tokens, int[] indice) {
        if (indice[0] >= tokens.length)
            return null;
        
        Nodo nodo = new Nodo(tokens[indice[0]]);
        indice[0]++;
        
        if (nodo.esOperando()) {
            nodo.izquierdo = construirArbolRecursivo(tokens, indice);
            nodo.derecho = construirArbolRecursivo(tokens, indice);
        }
        
        return nodo;
    }
}


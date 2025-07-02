package com.example.ut4.UT4_PD5;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    
    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(int clave) {
        raiz = insertarRecursivo(raiz, clave);
    }
    
    private Nodo insertarRecursivo(Nodo nodo, int clave) {
        if (nodo == null) {
            return new Nodo(clave);
        }
        
        if (clave < nodo.clave) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, clave);
        } else if (clave > nodo.clave) {
            nodo.derecho = insertarRecursivo(nodo.derecho, clave);
        }
        
        return nodo;
    }
    
    public Integer obtenerMenorClave() {
        if (raiz == null) return null;
        Nodo nodoActual = raiz;
        while (nodoActual.izquierdo != null) {
            nodoActual = nodoActual.izquierdo;
        }
        return nodoActual.clave;
    }

    public Integer obtenerMayorClave() {
        if (raiz == null) return null;
        Nodo nodoActual = raiz;
        while (nodoActual.derecho != null) {
            nodoActual = nodoActual.derecho;
        }
        return nodoActual.clave;
    }

    public Integer obtenerClaveAnterior(int clave) {
        if (raiz == null) return null;
        return obtenerClaveAnteriorRecursivo(raiz, clave, null);
    }
    
    private Integer obtenerClaveAnteriorRecursivo(Nodo nodo, int clave, Integer claveAnterior) {
        if (nodo == null) return claveAnterior;
        
        if (nodo.clave >= clave) {
            return obtenerClaveAnteriorRecursivo(nodo.izquierdo, clave, claveAnterior);
        } else {
            return obtenerClaveAnteriorRecursivo(nodo.derecho, clave, nodo.clave);
        }
    }

    public int contarNodosEnNivel(int nivel) {
        return contarNodosEnNivelRecursivo(raiz, 0, nivel);
    }
    
    private int contarNodosEnNivelRecursivo(Nodo nodo, int nivelActual, int nivelDeseado) {
        if (nodo == null) return 0;
        
        if (nivelActual == nivelDeseado) {
            return 1;
        }
        
        return contarNodosEnNivelRecursivo(nodo.izquierdo, nivelActual + 1, nivelDeseado) +
               contarNodosEnNivelRecursivo(nodo.derecho, nivelActual + 1, nivelDeseado);
    }
    
    public List<NodoHoja> listarHojasConNivel() {
        List<NodoHoja> hojas = new ArrayList<>();
        listarHojasConNivelRecursivo(raiz, 1, hojas);
        return hojas;
    }
    
    private void listarHojasConNivelRecursivo(Nodo nodo, int nivel, List<NodoHoja> hojas) {
        if (nodo == null) return;
        
        if (nodo.izquierdo == null && nodo.derecho == null) {
            hojas.add(new NodoHoja(nodo.clave, nivel));
        }
        
        listarHojasConNivelRecursivo(nodo.izquierdo, nivel + 1, hojas);
        listarHojasConNivelRecursivo(nodo.derecho, nivel + 1, hojas);
    }

    public boolean esArbolDeBusqueda() {
        return esArbolDeBusquedaRecursivo(raiz, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean esArbolDeBusquedaRecursivo(Nodo nodo, int min, int max) {
        if (nodo == null) return true;
        
        if (nodo.clave <= min || nodo.clave >= max) return false;
        
        return esArbolDeBusquedaRecursivo(nodo.izquierdo, min, nodo.clave) &&
               esArbolDeBusquedaRecursivo(nodo.derecho, nodo.clave, max);
    }
}

class Nodo {
    int clave;
    Nodo izquierdo;
    Nodo derecho;
    
    public Nodo(int clave) {
        this.clave = clave;
        this.izquierdo = null;
        this.derecho = null;
    }
}

class NodoHoja {
    int clave;
    int nivel;
    
    public NodoHoja(int clave, int nivel) {
        this.clave = clave;
        this.nivel = nivel;
    }
}

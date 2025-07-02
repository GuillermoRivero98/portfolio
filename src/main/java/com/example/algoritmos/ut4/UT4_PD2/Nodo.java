package com.example.ut4.UT4_PD2;

public class Nodo<T extends Comparable<T>> {
    private T clave;
    private Nodo<T> izquierdo;
    private Nodo<T> derecho;

    public Nodo(T clave) {
        this.clave = clave;
        this.izquierdo = null;
        this.derecho = null;
    }

    public T getClave() {
        return clave;
    }

    public Nodo<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo<T> derecho) {
        this.derecho = derecho;
    }
}


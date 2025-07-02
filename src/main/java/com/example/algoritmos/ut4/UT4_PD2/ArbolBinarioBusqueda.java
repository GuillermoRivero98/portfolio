package com.example.ut4.UT4_PD2;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public void insertar(T clave) {
        raiz = insertarRec(raiz, clave);
    }

    private Nodo<T> insertarRec(Nodo<T> nodo, T clave) {
        if (nodo == null) {
            return new Nodo<>(clave);
        }

        if (clave.compareTo(nodo.getClave()) < 0) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), clave));
        } else if (clave.compareTo(nodo.getClave()) > 0) {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), clave));
        }

        return nodo;
    }

    public boolean buscar(T clave) {
        return buscarRec(raiz, clave);
    }

    private boolean buscarRec(Nodo<T> nodo, T clave) {
        if (nodo == null) {
            return false;
        }

        if (clave.compareTo(nodo.getClave()) == 0) {
            return true;
        }

        return clave.compareTo(nodo.getClave()) < 0 ?
                buscarRec(nodo.getIzquierdo(), clave) :
                buscarRec(nodo.getDerecho(), clave);
    }

    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.getClave() + " ");
            preordenRec(nodo.getIzquierdo());
            preordenRec(nodo.getDerecho());
        }
    }
}

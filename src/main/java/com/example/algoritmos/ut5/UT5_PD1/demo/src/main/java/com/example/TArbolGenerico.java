package com.example.ut5.UT5_PD1.demo.src.main.java.com.example;

public class TArbolGenerico {
    private TNodoArbolGenerico raiz;

    public TArbolGenerico() {
        this.raiz = null;
    }

    public boolean insertar(String unaEtiqueta, String etiquetaPadre) {
        if (etiquetaPadre.isEmpty()) {
            if (raiz == null) {
                raiz = new TNodoArbolGenerico(unaEtiqueta);
                return true;
            } else {
                return false;
            }
        }

        TNodoArbolGenerico padre = buscarNodo(raiz, etiquetaPadre);
        if (padre == null) {
            return false;
        }

        TNodoArbolGenerico nuevo = new TNodoArbolGenerico(unaEtiqueta);
        if (padre.getPrimerHijo() == null) {
            padre.setPrimerHijo(nuevo);
        } else {
            TNodoArbolGenerico hermano = padre.getPrimerHijo();
            while (hermano.getHermanoDerecho() != null) {
                hermano = hermano.getHermanoDerecho();
            }
            hermano.setHermanoDerecho(nuevo);
        }

        return true;
    }

    private TNodoArbolGenerico buscarNodo(TNodoArbolGenerico nodo, String etiqueta) {
        if (nodo == null) {
            return null;
        }
        if (nodo.getEtiqueta().equals(etiqueta)) {
            return nodo;
        }
        TNodoArbolGenerico encontrado = buscarNodo(nodo.getPrimerHijo(), etiqueta);
        if (encontrado == null) {
            encontrado = buscarNodo(nodo.getHermanoDerecho(), etiqueta);
        }
        return encontrado;
    }

    public TNodoArbolGenerico buscar(String etiqueta) {
        return buscarNodo(raiz, etiqueta);
    }

    public String listarIndentado() {
        return listarIndentado(raiz, 0);
    }

    private String listarIndentado(TNodoArbolGenerico nodo, int nivel) {
        if (nodo == null) {
            return "";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            resultado.append("  ");
        }
        resultado.append(nodo.getEtiqueta()).append("\n");
        resultado.append(listarIndentado(nodo.getPrimerHijo(), nivel + 1));
        resultado.append(listarIndentado(nodo.getHermanoDerecho(), nivel));
        return resultado.toString();
    }
}

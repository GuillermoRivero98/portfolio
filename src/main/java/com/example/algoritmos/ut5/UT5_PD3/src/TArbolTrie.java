package com.example.ut5.UT5_PD3.src;

import java.util.LinkedList;

public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz == null) {
            return 0;
        }
        return raiz.buscar(palabra);
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        LinkedList<String> palabras = new LinkedList<>();
        if (raiz != null) {
            raiz.predecir(prefijo, palabras);
        }
        return palabras;
    }

    public TNodoTrie buscarNodoTrie(String lowerCase) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarNodoTrie'");
    }
}

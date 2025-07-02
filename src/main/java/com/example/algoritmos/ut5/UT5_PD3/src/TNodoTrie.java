package com.example.ut5.UT5_PD3.src;

import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;
    private LinkedList<Integer> paginas;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
        paginas = new LinkedList<>();
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    @Override
    public int buscar(String s) {
        TNodoTrie nodo = buscarNodoTrie(s);
        if (nodo == null) {
            return 0;
        }
        return s.length(); 
    }

    private TNodoTrie buscarNodoTrie(String s) {
        TNodoTrie nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
        }
        return nodo;
    }

    @Override
    public void imprimir() {
        imprimir("", this);
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie nodo = buscarNodoTrie(prefijo);
        if (nodo != null) {
            predecir(prefijo, "", palabras, nodo);
        }
    }

    private void predecir(String prefijo, String s, LinkedList<String> palabras, TNodoTrie nodo) {
        if (nodo.esPalabra) {
            palabras.add(prefijo + s);
        }
        for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
            if (nodo.hijos[c] != null) {
                predecir(prefijo, s + (char) (c + 'a'), palabras, nodo.hijos[c]);
            }
        }
    }
    
    public void agregarPagina(int pagina) {
        paginas.add(pagina);
    }

    public LinkedList<Integer> getPaginas() {
        return paginas;
    }
}

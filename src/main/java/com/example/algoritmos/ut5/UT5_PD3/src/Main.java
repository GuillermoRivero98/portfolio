package com.example.ut5.UT5_PD3.src;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasIndice = ManejadorArchivosGenerico.leerArchivo("PalabrasIndice.txt");
        for (String palabra : palabrasIndice) {
            trie.insertar(palabra);
        }

        indizarLibro(trie, "libro.txt");

        imprimirIndice(trie);
    }

    public static void indizarLibro(TArbolTrie trie, String nombreArchivoLibro) {
        String[] lineasLibro = ManejadorArchivosGenerico.leerArchivo(nombreArchivoLibro);
        int pagina = 1;
        for (String linea : lineasLibro) {
            String[] palabras = limpiarYDividirLinea(linea);
            for (String palabra : palabras) {
                trie.buscar(palabra.toLowerCase());
                TNodoTrie nodo = trie.buscarNodoTrie(palabra.toLowerCase());
                if (nodo != null) {
                    nodo.agregarPagina(pagina);
                }
            }
            pagina++;
        }
    }

    public static void imprimirIndice(TArbolTrie trie) {
        trie.imprimir();
    }

    private static String[] limpiarYDividirLinea(String linea) {
        linea = linea.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        return linea.split("\\s+");
    }
}

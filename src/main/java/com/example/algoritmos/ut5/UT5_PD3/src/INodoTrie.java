package com.example.ut5.UT5_PD3.src;

import java.util.LinkedList;

public interface INodoTrie {

    int buscar(String s); 
    void imprimir();

    void insertar(String unaPalabra);
    void predecir(String prefijo, LinkedList<String> palabras);
    
}

package com.example.ut5.UT5_PD3.src;

import java.util.LinkedList;

public interface IArbolTrie {

    void imprimir();
    int buscar(String palabra);

    void insertar(String palabra);

    LinkedList<String> predecir(String prefijo);
    
}

package com.example.ut4.UT4_PD2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>();

        try {
            String[] claves = ManejadorArchivosGenerico.leerArchivo("claves.txt");
            for (String clave : claves) {
                arbol.insertar(Integer.parseInt(clave.trim()));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        int claveABuscar = 10;
        System.out.println("¿La clave " + claveABuscar + " está en el árbol? " + arbol.buscar(claveABuscar));

        System.out.println("Recorrido preorden del árbol:");
        arbol.preorden();
    }
}

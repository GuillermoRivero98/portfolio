package com.example.ut5.UT5_PD1.demo.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar("RECTORÍA", "");
        arbol.insertar("VICERRECTORÍA DEL MEDIO UNIVERSITARIO", "RECTORÍA");

        TNodoArbolGenerico nodo = arbol.buscar("RECTORÍA");
        if (nodo != null) {
            System.out.println("Encontrado: " + nodo.getEtiqueta());
        } else {
            System.out.println("No encontrado");
        }

        nodo = arbol.buscar("NO_EXISTE");
        if (nodo != null) {
            System.out.println("Encontrado: " + nodo.getEtiqueta());
        } else {
            System.out.println("No encontrado");
        }

        arbol.insertar("VICERRECTORÍA ACADÉMICA", "RECTORÍA");
        arbol.insertar("VICERRECTORÍA ADMINISTRATIVA", "RECTORÍA");
        arbol.insertar("FACULTAD DE CIENCIAS EMPRESARIALES", "VICERRECTORÍA ACADÉMICA");
        arbol.insertar("FACULTAD DE CIENCIAS HUMANAS", "VICERRECTORÍA ACADÉMICA");
        arbol.insertar("FACULTAD DE INGENIERÍA Y TECNOLOGÍAS", "VICERRECTORÍA ACADÉMICA");
        arbol.insertar("FACULTAD DE PSICOLOGÍA", "VICERRECTORÍA ACADÉMICA");
        arbol.insertar("DEPARTAMENTO DE INFORMÁTICA Y CIENCIAS DE LA COMPUTACIÓN", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        arbol.insertar("DEPARTAMENTO DE INGENIERÍA ELÉCTRICA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        arbol.insertar("DEPARTAMENTO DE MATEMÁTICAS", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");

        System.out.println(arbol.listarIndentado());
    }
}

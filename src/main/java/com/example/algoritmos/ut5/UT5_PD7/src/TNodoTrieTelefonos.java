package com.example.ut5.UT5_PD7.src;

import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {

    private HashMap<Character, TNodoTrieTelefonos> hijos;
    private LinkedList<TAbonado> abonados;

    public TNodoTrieTelefonos() {
        hijos = new HashMap<>();
        abonados = new LinkedList<>();
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        if (primerosDigitos.isEmpty()) {
            abonados.addAll(this.abonados);
            abonados.sort(null); // Orden alfabético por nombre
            return;
        }
        char primerCaracter = primerosDigitos.charAt(0);
        if (hijos.containsKey(primerCaracter)) {
            hijos.get(primerCaracter).buscarTelefonos(primerosDigitos.substring(1), abonados);
        }
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        String telefono = unAbonado.getTelefono();
        insertarRecursivo(telefono, unAbonado, 0);
    }

    private void insertarRecursivo(String telefono, TAbonado abonado, int indice) {
        if (indice == telefono.length()) {
            abonados.add(abonado);
            return;
        }
        char caracter = telefono.charAt(indice);
        if (!hijos.containsKey(caracter)) {
            hijos.put(caracter, new TNodoTrieTelefonos());
        }
        hijos.get(caracter).insertarRecursivo(telefono, abonado, indice + 1);
    }
}

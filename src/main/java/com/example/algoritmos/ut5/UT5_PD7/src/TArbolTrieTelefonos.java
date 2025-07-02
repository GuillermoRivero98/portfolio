package com.example.ut5.UT5_PD7.src;

import java.util.LinkedList;

public class TArbolTrieTelefonos implements IArbolTrieTelefonos {

    private TNodoTrieTelefonos raiz;

    public TArbolTrieTelefonos() {
        raiz = new TNodoTrieTelefonos();
    }

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String codigoPais, String codigoArea) {
        LinkedList<TAbonado> abonados = new LinkedList<>();
        String primerosDigitos = codigoPais + codigoArea;
        raiz.buscarTelefonos(primerosDigitos, abonados);
        return abonados;
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        raiz.insertar(unAbonado);
    }
}

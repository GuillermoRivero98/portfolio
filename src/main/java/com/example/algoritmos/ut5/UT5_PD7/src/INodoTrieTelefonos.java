package com.example.ut5.UT5_PD7.src;

import java.util.LinkedList;

public interface INodoTrieTelefonos {

    void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados);

    void insertar(TAbonado unAbonado);
}

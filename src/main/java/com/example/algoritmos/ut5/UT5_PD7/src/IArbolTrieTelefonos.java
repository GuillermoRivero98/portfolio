package com.example.ut5.UT5_PD7.src;

import java.util.LinkedList;

public interface IArbolTrieTelefonos {

    LinkedList<TAbonado> buscarTelefonos(String codigoPais, String codigoArea);

    void insertar(TAbonado unAbonado);
}

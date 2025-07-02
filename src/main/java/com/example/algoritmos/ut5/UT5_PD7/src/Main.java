package com.example.ut5.UT5_PD7.src;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

        String[] lineasAbonados = ManejadorArchivosGenerico.leerArchivo("abonados.txt");
        for (String linea : lineasAbonados) {
            String[] partes = linea.split(",");
            if (partes.length == 2) {
                String telefono = partes[0].trim();
                String nombre = partes[1].trim();
                TAbonado abonado = new TAbonado(nombre, telefono);
                trieAbonados.insertar(abonado);
            }
        }

        String[] codigos = ManejadorArchivosGenerico.leerArchivo("codigos.txt");
        if (codigos.length == 2) {
            String codigoPais = codigos[0].trim();
            String codigoArea = codigos[1].trim();

            LinkedList<TAbonado> abonadosEncontrados = trieAbonados.buscarTelefonos(codigoPais, codigoArea);
            abonadosEncontrados.sort(null); 

            String[] lineasSalida = new String[abonadosEncontrados.size()];
            int i = 0;
            for (TAbonado abonado : abonadosEncontrados) {
                lineasSalida[i] = abonado.getNombre() + ", " + abonado.getTelefono();
                i++;
            }

            ManejadorArchivosGenerico.escribirArchivo("salida.txt", lineasSalida);
        }
    }
}

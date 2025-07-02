package com.example.ut4.UT4_PD2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejadorArchivosGenerico {
    public static String[] leerArchivo(String nombreArchivo) throws IOException {
        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        StringBuilder contenido = new StringBuilder();
        while ((linea = br.readLine()) != null) {
            contenido.append(linea).append("\n");
        }

        br.close();
        return contenido.toString().split("\n");
    }
}

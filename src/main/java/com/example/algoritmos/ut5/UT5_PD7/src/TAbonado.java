package com.example.ut5.UT5_PD7.src;

public class TAbonado implements Comparable<TAbonado> {

    private String nombre;
    private String telefono;

    public TAbonado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public int compareTo(TAbonado otroAbonado) {
        return this.nombre.compareTo(otroAbonado.getNombre());
    }
}

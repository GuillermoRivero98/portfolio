package com.example.ut5.UT5_PD1.demo.src.main.java.com.example;

public class TNodoArbolGenerico {
    private String etiqueta;
    private TNodoArbolGenerico primerHijo;
    private TNodoArbolGenerico hermanoDerecho;

    public TNodoArbolGenerico(String etiqueta) {
        this.etiqueta = etiqueta;
        this.primerHijo = null;
        this.hermanoDerecho = null;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public TNodoArbolGenerico getPrimerHijo() {
        return primerHijo;
    }

    public void setPrimerHijo(TNodoArbolGenerico primerHijo) {
        this.primerHijo = primerHijo;
    }

    public TNodoArbolGenerico getHermanoDerecho() {
        return hermanoDerecho;
    }

    public void setHermanoDerecho(TNodoArbolGenerico hermanoDerecho) {
        this.hermanoDerecho = hermanoDerecho;
    }
}

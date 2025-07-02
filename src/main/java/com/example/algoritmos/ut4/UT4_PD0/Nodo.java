package com.example.ut4.UT4_PD0;

class Nodo {
    String valor;
    Nodo izquierdo, derecho;
    
    public Nodo(String valor) {
        this.valor = valor;
        this.izquierdo = this.derecho = null;
    }
    
    public boolean esOperando() {
        return esNumero() || esVariable();
    }
    
    public boolean esNumero() {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean esVariable() {
        return valor.matches("[a-zA-Z]+");
    }
}

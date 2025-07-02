package com.example.ut4.UT4_TA9.src;

public class MainArbolBB {

  public static void main(String[] args) {
      TArbolBB<Integer> arbol = new TArbolBB<>();

      arbol.insertar(50);
      arbol.insertar(30);
      arbol.insertar(70);
      arbol.insertar(20);
      arbol.insertar(40);
      arbol.insertar(60);
      arbol.insertar(80);

      int etiquetaBuscar = 30;
      TElementoAB<Integer> encontrado = arbol.buscar(etiquetaBuscar);
      if (encontrado != null) {
          System.out.println("Elemento encontrado con etiqueta " + etiquetaBuscar + ": " + encontrado.getDatos());
      } else {
          System.out.println("Elemento con etiqueta " + etiquetaBuscar + " no encontrado.");
      }

      etiquetaBuscar = 90;
      encontrado = arbol.buscar(etiquetaBuscar);
      if (encontrado != null) {
          System.out.println("Elemento encontrado con etiqueta " + etiquetaBuscar + ": " + encontrado.getDatos());
      } else {
          System.out.println("Elemento con etiqueta " + etiquetaBuscar + " no encontrado.");
      }
  }
}

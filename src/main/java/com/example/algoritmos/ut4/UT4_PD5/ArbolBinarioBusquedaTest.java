package com.example.ut4.UT4_PD5;

import java.util.List;

public class ArbolBinarioBusquedaTest {
    public static void main(String[] args) {
        testObtenerMenorClave();
        testObtenerMayorClave();
        testObtenerClaveAnterior();
        testContarNodosEnNivel();
        testListarHojasConNivel();
        testEsArbolDeBusqueda();
    }
    
    public static void testObtenerMenorClave() {
        ArbolBinarioBusqueda arbolVacio = new ArbolBinarioBusqueda();
        ArbolBinarioBusqueda arbolUnico = new ArbolBinarioBusqueda();
        arbolUnico.insertar(10);
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        assert arbolVacio.obtenerMenorClave() == null : "Error: La menor clave del árbol vacío no es null";
        assert arbolUnico.obtenerMenorClave() == 10 : "Error: La menor clave del árbol con un solo nodo no es correcta";
        assert arbol.obtenerMenorClave() == 3 : "Error: La menor clave del árbol no es correcta";
        
        System.out.println("Test de obtenerMenorClave() completado correctamente.");
    }
    
    public static void testObtenerMayorClave() {
        ArbolBinarioBusqueda arbolVacio = new ArbolBinarioBusqueda();
        ArbolBinarioBusqueda arbolUnico = new ArbolBinarioBusqueda();
        arbolUnico.insertar(10);
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        assert arbolVacio.obtenerMayorClave() == null : "Error: La mayor clave del árbol vacío no es null";
        assert arbolUnico.obtenerMayorClave() == 10 : "Error: La mayor clave del árbol con un solo nodo no es correcta";
        assert arbol.obtenerMayorClave() == 17 : "Error: La mayor clave del árbol no es correcta";
        
        System.out.println("Test de obtenerMayorClave() completado correctamente.");
    }
    
    public static void testObtenerClaveAnterior() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        assert arbol.obtenerClaveAnterior(11) == 10 : "Error: La clave inmediata anterior a 11 no es correcta";
        assert arbol.obtenerClaveAnterior(12) == 10 : "Error: La clave inmediata anterior a 12 no es correcta";
        assert arbol.obtenerClaveAnterior(6) == 5 : "Error: La clave inmediata anterior a 6 no es correcta";
        
        System.out.println("Test de obtenerClaveAnterior() completado correctamente.");
    }
    
    public static void testContarNodosEnNivel() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        assert arbol.contarNodosEnNivel(1) == 1 : "Error: La cantidad de nodos en el nivel 1 no es correcta";
        assert arbol.contarNodosEnNivel(2) == 2 : "Error: La cantidad de nodos en el nivel 2 no es correcta";
        assert arbol.contarNodosEnNivel(3) == 4 : "Error: La cantidad de nodos en el nivel 3 no es correcta";
        
        System.out.println("Test de contarNodosEnNivel() completado correctamente.");
    }
    
    public static void testListarHojasConNivel() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        List<NodoHoja> hojas = arbol.listarHojasConNivel();
        
        assert hojas.size() == 4 : "Error: La cantidad de hojas no es la esperada";
        assert hojas.get(0).clave == 3 && hojas.get(0).nivel == 3 : "Error: La hoja 1 no tiene los valores esperados";
        assert hojas.get(1).clave == 7 && hojas.get(1).nivel == 3 : "Error: La hoja 2 no tiene los valores esperados";
        assert hojas.get(2).clave == 12 && hojas.get(2).nivel == 3 : "Error: La hoja 3 no tiene los valores esperados";
        assert hojas.get(3).clave == 17 && hojas.get(3).nivel == 3 : "Error: La hoja 4 no tiene los valores esperados";
        
        System.out.println("Test de listarHojasConNivel() completado correctamente.");
    }
    
    public static void testEsArbolDeBusqueda() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        assert arbol.esArbolDeBusqueda() : "Error: El árbol no es reconocido como árbol de búsqueda";
        
        System.out.println("Test de esArbolDeBusqueda() completado correctamente.");
    }
}

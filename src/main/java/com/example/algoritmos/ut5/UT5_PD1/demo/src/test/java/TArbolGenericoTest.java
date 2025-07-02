package com.example.ut5.UT5_PD1.demo.src.test.java;

/*import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TArbolGenericoTest {
    private TArbolGenerico arbol;

    @Before
    public void setUp() {
        arbol = new TArbolGenerico();
    }

    @Test
    public void testInsertarRaiz() {
        assertTrue(arbol.insertar("RECTORÍA", ""));
        assertFalse(arbol.insertar("RECTORÍA2", ""));
    }

    @Test
    public void testInsertarHijo() {
        arbol.insertar("RECTORÍA", "");
        assertTrue(arbol.insertar("VICERRECTORÍA ACADÉMICA", "RECTORÍA"));
        assertFalse(arbol.insertar("FACULTAD DE PSICOLOGÍA", "NO_EXISTE"));
    }

    @Test
    public void testBuscar() {
        arbol.insertar("RECTORÍA", "");
        arbol.insertar("VICERRECTORÍA ACADÉMICA", "RECTORÍA");
        assertNotNull(arbol.buscar("RECTORÍA"));
        assertNotNull(arbol.buscar("VICERRECTORÍA ACADÉMICA"));
        assertNull(arbol.buscar("NO_EXISTE"));
    }

    @Test
    public void testListarIndentado() {
        arbol.insertar("RECTORÍA", "");
        arbol.insertar("VICERRECTORÍA ACADÉMICA", "RECTORÍA");
        arbol.insertar("FACULTAD DE INGENIERÍA Y TECNOLOGÍAS", "VICERRECTORÍA ACADÉMICA");
        String esperado = "RECTORÍA\n  VICERRECTORÍA ACADÉMICA\n    FACULTAD DE INGENIERÍA Y TECNOLOGÍAS\n";
        assertEquals(esperado, arbol.listarIndentado());
    }
}
*/
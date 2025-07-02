package porfolio.ut3.UT3_PD6;

import java.util.NoSuchElementException;

public class ListaEnlazada<T> {
    private Nodo<T> primero;
    private int size;

    public ListaEnlazada() {
        primero = null;
        size = 0;
    }

    public void agregar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        size++;
    }

    public boolean buscar(T valor) {
        Nodo<T> actual = primero;
        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void quitar(T valor) {
        if (primero == null) {
            throw new NoSuchElementException("Lista vacía");
        }
        if (primero.getValor().equals(valor)) {
            primero = primero.getSiguiente();
            size--;
            return;
        }
        Nodo<T> anterior = primero;
        Nodo<T> actual = primero.getSiguiente();
        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                anterior.setSiguiente(actual.getSiguiente());
                size--;
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        throw new NoSuchElementException("El elemento no se encontró en la lista");
    }

    public void listar() {
        Nodo<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean estaVacia() {
        return size == 0;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getValor();
    }

    public void imprimir(String separador) {
        Nodo<T> actual = primero;
        while (actual != null) {
            System.out.print(actual.getValor());
            actual = actual.getSiguiente();
            if (actual != null) {
                System.out.print(separador);
            }
        }
        System.out.println();
    }

    public boolean contiene(T valor) {
        Nodo<T> actual = primero;
        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}

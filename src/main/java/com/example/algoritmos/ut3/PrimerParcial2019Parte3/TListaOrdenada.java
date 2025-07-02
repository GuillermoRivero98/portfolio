package porfolio.ut3.PrimerParcial2019Parte3;

public class TListaOrdenada<T extends Comparable<T>> {
    private Nodo<T> inicio;
    private int longitud;

    public TListaOrdenada() {
        this.inicio = null;
        this.longitud = 0;
    }

    public void insertar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (inicio == null) {
            inicio = nuevoNodo;
        } else if (elemento.compareTo(inicio.getDato()) < 0) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        } else {
            Nodo<T> actual = inicio;
            Nodo<T> anterior = null;

            while (actual != null && elemento.compareTo(actual.getDato()) > 0) {
                anterior = actual;
                actual = actual.getSiguiente();
            }

            anterior.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(actual);
        }

        longitud++;
    }

    public T recuperar(int indice) {
        if (indice < 0 || indice >= longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
        }

        Nodo<T> actual = inicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }

        return actual.getDato();
    }

    public int longitud() {
        return longitud;
    }

    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }

    public void insertar(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }
}

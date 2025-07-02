package porfolio.ut3.PD12.src;

public class Nodo<T> implements INodo<T> {
    private final Comparable etiqueta;
    private T dato;
    private Nodo<T> siguiente = null;

    public Nodo(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }

    @Override
    public T getDato() {
        return dato;
    }

    @Override
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(Nodo<T> nodo) {
        siguiente = nodo;
    }

    @Override
    public void imprimir() {
        System.out.println(dato.toString());
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println(etiqueta);
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
}

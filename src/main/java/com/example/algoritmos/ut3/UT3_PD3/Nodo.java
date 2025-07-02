package porfolio.ut3.UT3_PD3;

public class Nodo<T> implements INodo<T>, Comparable<Comparable> {
    private Comparable etiqueta;
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
        this.siguiente = null;
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
        this.siguiente = nodo;
    }

    @Override
    public void imprimir() {
        System.out.println("Etiqueta: " + etiqueta + ", Dato: " + dato);
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println("Etiqueta: " + etiqueta);
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public int compareTo(Comparable otraEtiqueta) {
        return etiqueta.compareTo(otraEtiqueta);
    }
}

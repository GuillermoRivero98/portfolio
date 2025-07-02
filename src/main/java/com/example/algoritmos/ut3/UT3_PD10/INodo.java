package porfolio.ut3.UT3_PD10;

public interface INodo<T> {

    T getDato();

    Nodo<T> getSiguiente();

    void setSiguiente(Nodo<T> nodo);

    void imprimir();

    void imprimirEtiqueta();

    Comparable getEtiqueta();

    int compareTo(Comparable etiqueta);
}

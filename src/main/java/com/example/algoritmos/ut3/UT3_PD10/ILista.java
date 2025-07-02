package porfolio.ut3.UT3_PD10;

public interface ILista<T> {

    void insertar(Nodo<T> nodo);

    void insertar(Comparable etiqueta, T dato);

    Nodo<T> buscar(Comparable clave);

    boolean eliminar(Comparable clave);

    String imprimir();

    String imprimir(String separador);

    int cantElementos();

    boolean esVacia();

    void setPrimero(Nodo<T> unNodo);
}

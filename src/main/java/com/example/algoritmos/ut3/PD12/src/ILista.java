package porfolio.ut3.PD12.src;

public interface ILista<T> {
    void insertar(Nodo<T> nodo);
    Nodo<T> buscar(Comparable clave);
    boolean eliminar(Comparable clave);
    String imprimir();
    String imprimir(String separador);
    int cantElementos();
    boolean esVacia();
    void setPrimero(Nodo<T> unNodo);
}

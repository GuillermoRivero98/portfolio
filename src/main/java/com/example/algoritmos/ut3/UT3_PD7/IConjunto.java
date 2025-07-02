package porfolio.ut3.UT3_PD7;

public interface IConjunto<T> extends Iterable<T> {
    IConjunto<T> union(IConjunto<T> otroConjunto);
    IConjunto<T> interseccion(IConjunto<T> otroConjunto);
    void agregar(T elemento);
    boolean contiene(T elemento);
}

package porfolio.ut3.PD12.src;

public interface IConjunto<T> {
    Conjunto<T> union(Conjunto<T> otroConjunto);
    Conjunto<T> interseccion(Conjunto<T> otroConjunto);
}

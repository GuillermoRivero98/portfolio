package porfolio.ut3.PrimerParcial2019Parte3;

public interface iConjunto<T extends Comparable<T>> {
    Conjunto<T> Union(Conjunto<T> otroConjunto);
    Conjunto<T> Interseccion(Conjunto<T> otroConjunto);
}
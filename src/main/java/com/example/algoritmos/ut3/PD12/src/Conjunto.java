package porfolio.ut3.PD12.src;

public class Conjunto<T> extends Lista<T> implements IConjunto<T> {

    @Override
    public Conjunto<T> union(Conjunto<T> otroConjunto) {
        Conjunto<T> resultado = new Conjunto<>();
        Nodo<T> aux = this.getPrimero();

        while (aux != null) {
            resultado.insertar(new Nodo<>(aux.getEtiqueta(), aux.getDato()));
            aux = aux.getSiguiente();
        }

        aux = otroConjunto.getPrimero();
        while (aux != null) {
            if (resultado.buscar(aux.getEtiqueta()) == null) {
                resultado.insertar(new Nodo<>(aux.getEtiqueta(), aux.getDato()));
            }
            aux = aux.getSiguiente();
        }

        return resultado;
    }

    @Override
    public Conjunto<T> interseccion(Conjunto<T> otroConjunto) {
        Conjunto<T> resultado = new Conjunto<>();
        Nodo<T> aux = this.getPrimero();

        while (aux != null) {
            if (otroConjunto.buscar(aux.getEtiqueta()) != null) {
                resultado.insertar(new Nodo<>(aux.getEtiqueta(), aux.getDato()));
            }
            aux = aux.getSiguiente();
        }

        return resultado;
    }
}

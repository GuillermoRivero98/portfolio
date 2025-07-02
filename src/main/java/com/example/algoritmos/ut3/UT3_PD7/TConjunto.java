package porfolio.ut3.UT3_PD7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TConjunto<T> implements IConjunto<T> {
    private Set<T> elementos;

    public TConjunto() {
        elementos = new HashSet<>();
    }

    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }

    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto) {
        TConjunto<T> union = new TConjunto<>();
        for (T elemento : this) {
            union.agregar(elemento);
        }
        for (T elemento : otroConjunto) {
            union.agregar(elemento);
        }
        return union;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto) {
        TConjunto<T> interseccion = new TConjunto<>();
        for (T elemento : this) {
            if (otroConjunto.contiene(elemento)) {
                interseccion.agregar(elemento);
            }
        }
        return interseccion;
    }

    @Override
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public boolean contiene(T elemento) {
        return elementos.contains(elemento);
    }
}

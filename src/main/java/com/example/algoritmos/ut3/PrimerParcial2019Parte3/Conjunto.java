package porfolio.ut3.PrimerParcial2019Parte3;

public class Conjunto<T extends Comparable<T>> extends TListaOrdenada<T> implements iConjunto<T> {

    public Conjunto() {
        super();
    }

    @Override
    public Conjunto<T> Union(Conjunto<T> otroConjunto) {
        Conjunto<T> union = new Conjunto<>();

        for (int i = 0; i < this.longitud(); i++) {
            union.insertar(this.recuperar(i));
        }

        for (int i = 0; i < otroConjunto.longitud(); i++) {
            T elemento = otroConjunto.recuperar(i);
            if (!this.pertenece(elemento)) {
                union.insertar(elemento);
            }
        }

        return union;
    }

    @Override
    public Conjunto<T> Interseccion(Conjunto<T> otroConjunto) {
        Conjunto<T> interseccion = new Conjunto<>();

        for (int i = 0; i < this.longitud(); i++) {
            T elemento = this.recuperar(i);
            if (otroConjunto.pertenece(elemento)) {
                interseccion.insertar(elemento);
            }
        }

        return interseccion;
    }

    private boolean pertenece(T elemento) {
        for (int i = 0; i < this.longitud(); i++) {
            if (this.recuperar(i).equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void insertar(Alumno alumno) {
        super.insertar(alumno);
    }
}

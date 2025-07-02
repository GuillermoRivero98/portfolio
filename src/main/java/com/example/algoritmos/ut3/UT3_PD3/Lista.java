package porfolio.ut3.UT3_PD3;

public class Lista<T> implements ILista<T> {
    private Nodo<T> primero;

    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(etiqueta, dato);
        insertar(nuevoNodo);
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> actual = primero;
        while (actual != null && !actual.getEtiqueta().equals(clave)) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (primero == null) {
            return false;
        }
        if (primero.getEtiqueta().equals(clave)) {
            primero = primero.getSiguiente();
            return true;
        }
        Nodo<T> anterior = primero;
        Nodo<T> actual = primero.getSiguiente();
        while (actual != null && !actual.getEtiqueta().equals(clave)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null) {
            anterior.setSiguiente(actual.getSiguiente());
            return true;
        }
        return false;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = primero;
        while (actual != null) {
            sb.append(actual.getEtiqueta()).append(" ");
            actual = actual.getSiguiente();
        }
        return sb.toString().trim();
    }

    @Override
    public String imprimir(String separador) {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = primero;
        while (actual != null) {
            sb.append(actual.getEtiqueta()).append(separador);
            actual = actual.getSiguiente();
        }
        return sb.toString().trim();
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        Nodo<T> actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }
}


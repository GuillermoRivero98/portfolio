package porfolio.ut3.UT3_PD10;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (esVacia()) {
            primero = nodo;
        } else {
            Nodo<T> aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        insertar(new Nodo<>(etiqueta, dato));
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        if (!esVacia()) {
            Nodo<T> temp = primero;
            while (temp != null) {
                sb.append(temp.getEtiqueta()).append(" ");
                temp = temp.getSiguiente();
            }
        }
        return sb.toString();
    }

    @Override
    public String imprimir(String separador) {
        StringBuilder sb = new StringBuilder();
        if (!esVacia()) {
            Nodo<T> temp = primero;
            sb.append(temp.getEtiqueta());
            while (temp.getSiguiente() != null) {
                sb.append(separador).append(temp.getSiguiente().getEtiqueta());
                temp = temp.getSiguiente();
            }
        }
        return sb.toString();
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            return 0;
        } else {
            Nodo<T> aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }
}

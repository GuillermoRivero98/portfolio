package porfolio.ut3.PrimerParcial2019Parte3;

public class Alumno {
    private int codigo;
    private String nombre;

    public Alumno(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alumno alumno = (Alumno) obj;
        return codigo == alumno.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}

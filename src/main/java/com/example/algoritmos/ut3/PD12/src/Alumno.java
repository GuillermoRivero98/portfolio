package porfolio.ut3.PD12.src;

public class Alumno {
    private final int codigo;
    private final String nombre;

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
}

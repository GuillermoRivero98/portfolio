package porfolio.ut3.UT3_PD7;

public class TAlumno {
    private String cedula;
    private String nombre;
    private String apellido;

    public TAlumno(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TAlumno alumno = (TAlumno) obj;
        return cedula.equals(alumno.cedula);
    }

    @Override
    public int hashCode() {
        return cedula.hashCode();
    }

    @Override
    public String toString() {
        return "TAlumno{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

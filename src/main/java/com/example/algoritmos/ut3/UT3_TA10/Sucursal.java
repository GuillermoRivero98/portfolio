package porfolio.ut3.UT3_TA10;

public class Sucursal {
    private String ciudad;

    public Sucursal(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return ciudad;
    }
}


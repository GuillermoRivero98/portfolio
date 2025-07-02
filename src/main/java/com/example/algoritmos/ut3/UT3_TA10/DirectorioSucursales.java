package porfolio.ut3.UT3_TA10;

import java.util.LinkedList;

public class DirectorioSucursales {
    private LinkedList<Sucursal> sucursales;

    public DirectorioSucursales() {
        this.sucursales = new LinkedList<>();
    }

    public void agregarSucursal(String ciudad) {
        Sucursal nuevaSucursal = new Sucursal(ciudad);
        sucursales.add(nuevaSucursal);
    }

    public boolean quitarSucursal(String ciudad) {
        // Iterar sobre una copia para evitar ConcurrentModificationException
        LinkedList<Sucursal> copiaSucursales = new LinkedList<>(sucursales);
        for (Sucursal sucursal : copiaSucursales) {
            if (sucursal.getCiudad().equalsIgnoreCase(ciudad)) {
                sucursales.remove(sucursal);
                return true;
            }
        }
        return false;
    }

    public Sucursal buscarSucursal(String ciudad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getCiudad().equalsIgnoreCase(ciudad)) {
                return sucursal;
            }
        }
        return null;
    }

    public void listarSucursales() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal);
        }
    }

    public int cantidadSucursales() {
        return sucursales.size();
    }

    public boolean estaVacio() {
        return sucursales.isEmpty();
    }

    public Sucursal[] getSucursales() {
        return sucursales.toArray(new Sucursal[0]);
    }
}

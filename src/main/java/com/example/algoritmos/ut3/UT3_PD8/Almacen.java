package porfolio.ut3.UT3_PD8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<String> sucursales;

    public Almacen() {
        sucursales = new ArrayList<>();
        cargarSucursales("suc1.txt");
        cargarSucursales("suc2.txt");
        cargarSucursales("suc3.txt");
        cargarSucursales("sucursales.txt");
    }

    private void cargarSucursales(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sucursales.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar las sucursales desde el archivo: " + archivo);
            e.printStackTrace();
        }
    }

    public void agregarSucursal(String sucursal) {
        sucursales.add(sucursal);
    }

    public boolean eliminarSucursal(String sucursal) {
        return sucursales.remove(sucursal);
    }

    public boolean buscarSucursal(String ciudad) {
        return sucursales.contains(ciudad);
    }

    public void listarSucursales() {
        for (String ciudad : sucursales) {
            System.out.println(ciudad);
        }
    }

    public int cantidadSucursales() {
        return sucursales.size();
    }

    public boolean estaVacio() {
        return sucursales.isEmpty();
    }

    public String obtenerSucursal(int indice) {
        if (indice >= 0 && indice < sucursales.size()) {
            return sucursales.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }
}

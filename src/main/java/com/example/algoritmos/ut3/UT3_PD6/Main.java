package porfolio.ut3.UT3_PD6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada<String> sucursales = new ListaEnlazada<>();
        
        cargarSucursalesDesdeArchivo(sucursales, "sucursales.txt");

        System.out.println("Cantidad de sucursales: " + sucursales.getSize());
        System.out.println("Lista de ciudades:");
        sucursales.listar();

        sucursales.quitar("Chicago");
        System.out.println("\nLista de ciudades después de eliminar Chicago:");
        sucursales.listar();

        cargarSucursalesDesdeArchivo(sucursales, "suc2.txt");
        sucursales.quitar("Shenzen");
        sucursales.quitar("Tokio");
        System.out.println("\nLista de ciudades después de eliminar Shenzen y Tokio:");
        sucursales.listar();

        cargarSucursalesDesdeArchivo(sucursales, "suc3.txt");
        System.out.println("\nLista de ciudades con separador \";_\":");
        sucursales.imprimir(";_");
        System.out.println("\n¿El directorio de sucursales está vacío? " + sucursales.estaVacia());
    }

    private static void cargarSucursalesDesdeArchivo(ListaEnlazada<String> sucursales, String archivo) {
        try (Scanner scanner = new Scanner(Main.class.getResourceAsStream(archivo))) {
            while (scanner.hasNextLine()) {
                String ciudad = scanner.nextLine().trim();
                sucursales.agregar(ciudad);
            }
        } catch (Exception e) {
            System.err.println("Error al cargar las sucursales desde el archivo " + archivo + ": " + e.getMessage());
        }
    }
}

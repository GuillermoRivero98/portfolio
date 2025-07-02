package porfolio.ut3.UT3_TA10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaDirectorio {
    public static void main(String[] args) {
        DirectorioSucursales directorio = new DirectorioSucursales();
        cargarSucursales(directorio, "sucursales.txt");

        System.out.println("Cantidad de sucursales: " + directorio.cantidadSucursales());
        System.out.println("Listado de sucursales:");
        directorio.listarSucursales();

        directorio.quitarSucursal("Chicago");
        System.out.println("\nDespués de eliminar Chicago:");
        directorio.listarSucursales();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ciudad a buscar:");
        String ciudadBuscada = scanner.nextLine();
        Sucursal encontrada = directorio.buscarSucursal(ciudadBuscada);
        if (encontrada != null) {
            System.out.println("Sucursal encontrada: " + encontrada);
        } else {
            System.out.println("La sucursal no existe en el directorio.");
        }

        System.out.println("\nCaso 2: Eliminar las ciudades \"Shenzen\" y \"Tokio\" de un segundo archivo:");
        directorio = new DirectorioSucursales();
        cargarSucursales(directorio, "suc2.txt");
        directorio.quitarSucursal("Shenzen");
        directorio.quitarSucursal("Tokio");
        System.out.println("Listado de sucursales después de eliminar Shenzen y Tokio:");
        directorio.listarSucursales();

        System.out.println("\nCaso 3: Invocar al método \"Imprimir(\",_\")\" con un tercer archivo:");
        directorio = new DirectorioSucursales();
        cargarSucursales(directorio, "suc3.txt");
        imprimirSeparadoPorPuntoYComa(directorio);
    }

    public static void cargarSucursales(DirectorioSucursales directorio, String archivo) {
        File file = new File(archivo);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String ciudad = scanner.nextLine();
                directorio.agregarSucursal(ciudad);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado - " + archivo);
            e.printStackTrace();
        }
    }

    public static void imprimirSeparadoPorPuntoYComa(DirectorioSucursales directorio) {
        StringBuilder sb = new StringBuilder();
        for (Sucursal sucursal : directorio.getSucursales()) {
            sb.append(sucursal.getCiudad()).append("; ");
        }
        System.out.println("Resultado de Imprimir(\",_\"): " + sb.toString());
    }
}

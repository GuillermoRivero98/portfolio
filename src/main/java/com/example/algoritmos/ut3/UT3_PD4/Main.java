package porfolio.ut3.UT3_PD4;

public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.procesarAltas("altas.txt");

        almacen.procesarVentas("ventas.txt");

        System.out.println("Listado de Productos:");
        almacen.listarProductos();

        System.out.println("\nValor total del stock: $" + almacen.valorTotalStock());
    }
}

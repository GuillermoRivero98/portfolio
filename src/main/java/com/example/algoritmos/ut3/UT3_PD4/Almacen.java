package porfolio.ut3.UT3_PD4;

import java.util.*;

public class Almacen {

    private Map<String, Producto> inventario;

    public Almacen() {
        inventario = new HashMap<>();
    }

    public void incorporarProducto(String codigo, String nombre, double precioUnitario, int cantidad) {
        Producto producto = new Producto(codigo, nombre, precioUnitario, cantidad);
        inventario.put(codigo, producto);
    }

    public void agregarStock(String codigo, int cantidad) {
        Producto producto = inventario.get(codigo);
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + cantidad);
        } else {
            System.out.println("El producto con código " + codigo + " no existe en el almacén.");
        }
    }

    public void venderProductos(String codigo, int cantidad) {
        Producto producto = inventario.get(codigo);
        if (producto != null) {
            int stockDisponible = producto.getCantidad();
            if (stockDisponible >= cantidad) {
                producto.setCantidad(stockDisponible - cantidad);
            } else {
                System.out.println("No hay suficiente stock del producto con código " + codigo + " para realizar la venta.");
            }
        } else {
            System.out.println("El producto con código " + codigo + " no existe en el almacén.");
        }
    }

    public void eliminarProducto(String codigo) {
        inventario.remove(codigo);
    }

    public int obtenerExistencias(String codigo) {
        Producto producto = inventario.get(codigo);
        return producto != null ? producto.getCantidad() : 0;
    }

    public void listarProductos() {
        List<Producto> productosOrdenados = new ArrayList<>(inventario.values());
        productosOrdenados.sort(Comparator.comparing(Producto::getNombre));
        for (Producto producto : productosOrdenados) {
            System.out.println(producto.getNombre() + " - Código: " + producto.getCodigo() + ", Stock: " + producto.getCantidad());
        }
    }

    public double valorTotalStock() {
        double valorTotal = 0;
        for (Producto producto : inventario.values()) {
            valorTotal += producto.getPrecioUnitario() * producto.getCantidad();
        }
        return valorTotal;
    }

    public void procesarAltas(String archivo) {
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream(archivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(",");
                if (campos.length == 4) {
                    String codigo = campos[0].trim();
                    String nombre = campos[1].trim();
                    double precioUnitario = Double.parseDouble(campos[2].trim());
                    int cantidad = Integer.parseInt(campos[3].trim());
                    incorporarProducto(codigo, nombre, precioUnitario, cantidad);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al procesar el archivo de altas: " + e.getMessage());
        }
    }

    public void procesarVentas(String archivo) {
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream(archivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(",");
                if (campos.length == 2) {
                    String codigo = campos[0].trim();
                    int cantidad = Integer.parseInt(campos[1].trim());
                    venderProductos(codigo, cantidad);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al procesar el archivo de ventas: " + e.getMessage());
        }
    }
}

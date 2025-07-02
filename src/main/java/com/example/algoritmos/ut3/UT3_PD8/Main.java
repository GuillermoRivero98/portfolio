package porfolio.ut3.UT3_PD8;

public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        System.out.println("Listado de sucursales:");
        almacen.listarSucursales();

        System.out.println("Cantidad de sucursales: " + almacen.cantidadSucursales());
        System.out.println("¿Está vacío? " + almacen.estaVacio());

        String sucursalBuscada = "Buenos Aires";
        System.out.println("Buscar sucursal '" + sucursalBuscada + "': " + almacen.buscarSucursal(sucursalBuscada));

        String sucursalEliminar = "Buenos Aires";
        System.out.println("Quitar sucursal '" + sucursalEliminar + "': " + almacen.eliminarSucursal(sucursalEliminar));
        System.out.println("Buscar sucursal '" + sucursalEliminar + "' después de quitarla: " + almacen.buscarSucursal(sucursalEliminar));

        String sucursalEliminarAgregar = "Cordoba";
        System.out.println("Eliminar sucursal '" + sucursalEliminarAgregar + "': ");
        almacen.eliminarSucursal(sucursalEliminarAgregar);
        almacen.listarSucursales();

        System.out.println("Agregar sucursal '" + sucursalEliminarAgregar + "': ");
        almacen.agregarSucursal(sucursalEliminarAgregar);
        almacen.listarSucursales();
    }
}

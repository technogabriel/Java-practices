import sistema.ventas.ordenes.Orden;
import sistema.ventas.productos.Producto;

public class SistemaDeVenta {

    public static void main(String[] args) {

        System.out.println("**** Sistema de Venta ****");
        var camisa1 = new Producto("Camisa", 50.00);
        var pantalon1 = new Producto("Pantalon", 100.00);

        var orden1 = new Orden();
        orden1.agregarProducto(camisa1);
        orden1.agregarProducto(pantalon1);
        orden1.mostrarOrden();
        //orden 2
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("medias", 20.00));
        orden2.agregarProducto(new Producto("zapatos", 200.00));
        orden2.mostrarOrden();
    }
}

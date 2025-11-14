import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        //Creando Productos
        Televisor tv1 = new Televisor("Samsung Smart TV", 799.99, 3, 55.0f, "4K");
        Televisor tv2 = new Televisor("LG OLED", 1200.00, 2, 65.0f, "8K");

        ComputadoraPortatil lapto1 = new ComputadoraPortatil("Asus Vivobook", 900.50, 5, 16, 12345);
        ComputadoraPortatil lapto2 = new ComputadoraPortatil("HP Pavilion", 750.99, 1, 8, 67890);

        //Agregar al inventario
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(lapto1);
        tienda.agregarProducto(lapto2);

        //Ver todos los productos
        System.out.println("=== INVENTARIO INICIAL ===");
        tienda.mostrarInformacion();

        // Realizar ventas
        tienda.realizarVenta("Samsung Smart TV");
        tienda.realizarVenta("HP Pavilion");
        tienda.realizarVenta("HP Pavilion"); // Intentar vender de nuevo (agotado)

        // Mostrar inventario actualizado
        System.out.println("\n=== INVENTARIO ACTUALIZADO ===");
        tienda.mostrarInformacion();
    }
}

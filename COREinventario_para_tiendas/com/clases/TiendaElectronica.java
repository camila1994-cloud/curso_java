package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {

    // Creacion de lista
    private ArrayList<ProductoElectrodomestico> ListaDeProductos;

    public TiendaElectronica() {
        ListaDeProductos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(ProductoElectrodomestico producto) {
        ListaDeProductos.add(producto);
    }

    // Mostrar informacion
    public void mostrarInformacion() {
        if (ListaDeProductos.isEmpty()) {
            System.out.println("No hay productos en inventario.");
            return;
        }
        for (ProductoElectrodomestico p : ListaDeProductos) {
            p.mostrarInformacion();
            System.out.println("----------");
        }
    }

    //Buscar producto
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : ListaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    //Venta de productos 
    public void realizarVenta(String nombre) {
        ProductoElectrodomestico producto = buscarProducto(nombre);

        if (producto != null) {
            if (producto.getCantidadDisponible() > 0) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
                System.out.println("Venta realizada de: " + producto.getNombre());
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

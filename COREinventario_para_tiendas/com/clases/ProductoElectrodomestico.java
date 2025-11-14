package com.clases;

public class ProductoElectrodomestico {

    //Atributos
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    //Constructor
    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    //Instancia de mostrar informacion 
    public void mostrarInformacion(){
        System.out.println("Nombre producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible); 
    }
}
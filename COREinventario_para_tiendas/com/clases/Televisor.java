package com.clases;

public class Televisor extends ProductoElectrodomestico {
    
    //Atributos
    private float tamanoPantalla;
    private String resolucion;

    //Constructor
    public Televisor(String nombre, double precio, int cantidadDisponible, float tamanoPantalla, String resolucion){
        super(nombre, precio, cantidadDisponible);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

    //Getters y Setters
    public float getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(float tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    //Instancia de mostrar informacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño de pantalla: " + tamanoPantalla + " pulgadas");
        System.out.println("Resolución: " + resolucion);
    }

    
}

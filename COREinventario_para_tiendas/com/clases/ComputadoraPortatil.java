package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    
    //Atributos
    private int memoriaRam;
    private int numeroSerie;

    //Constructor
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, int memoriaRAM, int numeroSerie){
        super(nombre, precio, cantidadDisponible);
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

    //Getters y Setters

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    //Instancia de mostrar informacion
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Memoria RAM: " + memoriaRam);
        System.out.println("Numero de serie: " + numeroSerie);
    }

    

}

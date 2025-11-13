package clases; 
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    //Atributos
    private double saldo;
    private Persona titular;
    private int numeroCuenta;

    //Lista estatica donde se guardan las instancias de la cuentas bancarias
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    //Constructor
    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta();
        listaDeCuentasBancarias.add(this);
    }

    //Getters y setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
     //Generar numero de cuenta de 6 digitos
    private int generarNumeroCuenta(){
        Random random = new Random();
        int numeroCuenta = 100000 + random.nextInt(900000);
        return numeroCuenta;
    }

    // Metodos de deposito, retiro y desplegar informacion
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Deposito realizado de forma exitosa, por el monto de $" + monto);
        } else{
            System.out.println("Monto no valido para depositar");
        }
    }
    
    public void retirar(double monto){
        if ( monto >0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado de forma exitosa, por el monto de$" + monto);
        } else if (monto > saldo) {
            System.out.println("Fondos insuficiente"); 
        } else{
            System.out.println("El monto no es valido para el retiro");
        }
    }

    //Metodo para ver informacion de la cuenta 
    public void despliegaInformacion(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular de la cuenta: "+titular.getNombre() + " edad " + titular.getEdad());
        System.out.println("Saldo de la cuenta: "+ saldo );
        System.out.println("\n");
    }

    //Meto para ver informacion de todas la cuentas bancarias
    public static void imprimeInformacionDeTodasLasCuentas(){
        for(CuentaBancaria cuenta : listaDeCuentasBancarias){
            cuenta.despliegaInformacion();
        }
        System.out.println("---------------");
    }

}


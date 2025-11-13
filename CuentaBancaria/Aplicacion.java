import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {

        // Intancias de la clase persona
        Persona persona1 = new Persona("Pascale", 18);
        Persona persona2 = new Persona("Constanza", 20);
        Persona persona3 = new Persona("Vicente", 27);

        // Intancias de cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria(1000.00, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(15000.00, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(200.00, persona3);

        // Operaciones y saldo de cuentas
        System.out.println("Pascale\n");
        cuenta1.depositar(500.00);
        System.out.println(cuenta1.getSaldo());
        cuenta1.retirar(100.00);
        System.out.println(cuenta1.getSaldo());
        System.out.println("----------------------");

        System.out.println("Constanza\n");
        cuenta2.depositar(250.00);
        System.out.println(cuenta2.getSaldo());
        cuenta2.retirar(300.00);
        System.out.println(cuenta2.getSaldo());
        System.out.println("----------------------");

        System.out.println("Vicente\n");
        cuenta3.depositar(1000.00);
        System.out.println(cuenta3.getSaldo());
        cuenta3.retirar(5000.00); // Debe decir fondos insuficientes
        System.out.println(cuenta3.getSaldo());
        System.out.println("----------------------");

        // Imprimir todas las cuentas bancarias
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();

    }
}
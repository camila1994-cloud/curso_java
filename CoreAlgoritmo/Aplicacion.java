import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("\nPROBAR METODO ES PAR");
        System.out.println("¿4 es par?: " + Algoritmos.esPar(4));
        System.out.println("¿7 es par?: " + Algoritmos.esPar(7));

        System.out.println("\nPROBAR METODO ES PRIMO");
        System.out.println("¿5 es primo?: " + Algoritmos.esPrimo(5));
        System.out.println("¿9 es primo?: " + Algoritmos.esPrimo(9));

        System.out.println("\nPROBAR METODO STRING EN REVERSA");
        String texto = "Java";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto en reversa: " + Algoritmos.stringEnReversa(texto));

        System.out.println("\nPROBAR METODO ES PALINDROMO");
        String palabra = "Reconocer";
        System.out.println("¿'Reconocer' es palíndromo?: " + Algoritmos.esPalindromo(palabra));

        System.out.println("\nPROBAR METODO SECUENCIA FIZZBUZZ");
        System.out.println("Secuencia FizzBuzz hasta 15:");
        Algoritmos.secuenciaFizzBuzz(15);
        System.out.println("\n");
        
    }
}

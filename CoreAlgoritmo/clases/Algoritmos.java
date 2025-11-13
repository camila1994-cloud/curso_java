package clases; 

public class Algoritmos {
    // Metodo estático que verifica si un numero es par
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo estatico para verificar si un numero es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        // Probar si tiene algun divisor aparte de 1 y el mismo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                // Tiene un divisor -> no es primo
                return false;
            }
        }
        // Si no se encontro ningun divisor -> es primo
        return true;
    }

    // Metodo para invertir un String
    public static String stringEnReversa(String texto) {
        String reverso = "";

        // Recorre el texto 
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverso += texto.charAt(i);
        }
        return reverso;
    }

    //Metodo que verifica si un String es palíndromo
    public static boolean esPalindromo(String texto) {
        //Convertimos el texto a minusculas y eliminamos espacios
        texto = texto.toLowerCase().replace(" ", "");
        //Obtenemos el texto al revés usando el método anterior
        String reverso = stringEnReversa(texto);

        //Comparamos original y reverso
        return texto.equals(reverso);
    }

    //Metodo que imprime la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

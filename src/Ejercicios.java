import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicios {
    public void reto1(){
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println("fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public boolean reto2(String palabra1, String palabra2) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] palabra1CharArray = palabra1.toCharArray();
        char[] palabra2CharArray = palabra2.toCharArray();

        // Ordenamos los arrays de caracteres
        Arrays.sort(palabra1CharArray);
        Arrays.sort(palabra2CharArray);

        // Iteramos sobre los arrays ordenados y comparamos las letras
        for (int i = 0; i < palabra1CharArray.length; i++) {
            // Si alguna letra no coincide en la misma posición, retornamos false
            if (palabra1CharArray[i] != palabra2CharArray[i]) {
                return false;
            }
        }

        // Si todas las letras coinciden en las mismas posiciones, retornamos true
        return true;
    }




    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */





}

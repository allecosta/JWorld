package codewars.fundamentals.arrays;

/**
 * Descrição:
 * 
 * Método para dividir uma string e convertê-la em uma matriz de palavras.
 */

public class SolutionStringToArray {

    public static String[] stringToArray(String s) {
        
        String delimiter = " ";
        String[] str = s.split(delimiter);

        return str; 

      }

      public static void main(String[] args) {
        
        System.out.println(stringToArray("vanessa lorena"));
      }
}

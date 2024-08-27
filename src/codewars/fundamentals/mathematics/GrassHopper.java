package codewars.fundamentals.mathematics;

/**
 * Programa que encontra o somátorio de todos os números de 1 ao número recebido como parâmetro do método summation().
 * 
 * O número sempre será um inteiro positivo maior que 0. E o método deverá devolver o resultado. 
 * 
 */

public class GrassHopper {

    public static int summation(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i; 
        }
        
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(summation(8)); // 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
    }
}

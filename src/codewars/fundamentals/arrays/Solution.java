package codewars.fundamentals.arrays;

/**
 * Dada uma matriz "a" e um valor "x", verifique se a matriz contém o valor de "x".
 * A matriz pode conter números ou strings e, "x" pode ser qualquer um dos valores.
 * Devolva verdadeiro se houver o  de "x" na matrix, ou falso se não houver. 
 * 
 */

public class Solution {

    public static boolean check(Object[] a, Object x) {

        for (Object i : a) {
            if (i == x) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        System.out.println(check(new Object[]{100, 80, 99, 10}, 80)); // true
        System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "green")); // false
    }
}

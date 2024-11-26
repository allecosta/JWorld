package codewars.fundamentals.strings;

/**
 * Implementa uma função que converte o valor booleano fornecido em sua representação de string.
 */
public class BooleanToString {

    public static String convert(boolean b) {
        if (b == true) {
            return "true";
        }
        return "false";
    }
}
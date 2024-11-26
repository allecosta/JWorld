package codewars.fundamentals.logic;

/**
 * Função que recebe dois parâmetros. O primeiro parâmetro é verdadeiro sempre que você está empregado e o
 * segundo parâmetro, é verdadeiro sempre que você está de férias.
 *
 * A função deve retornar true se você estiver empregado e não estiver de férias
 * (porque essas são as circunstâncias em que você precisa definir um alarme).
 * Caso contrário, ele deve retornar false. Exemplos:
 *
 * employed | vacation
 * true     | true     => false
 * true     | false    => true
 * false    | true     => false
 * false    | false    => false
 *
 */
public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == false) {
            return true;
        }
        return false;
    }
}
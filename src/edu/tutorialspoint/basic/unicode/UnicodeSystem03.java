package edu.tutorialspoint.basic.unicode;

public class UnicodeSystem03 {
    public static void main(String[] args) {
        char letterA = '\u0041';
        char letterSmallA = '\u0061';
        char letterB = 'B';
        int difference = letterA - letterSmallA;
        char letterC = (char) (letterB + difference);
        char letterSmallC = (char) (letterC + 32);

        System.out.println("*** Manipulando Caracteres Unicode ***"); 
        System.out.println("Diferença entre A e a: " + difference); // -32
        System.out.println("Letra C: " + letterC); // "
        System.out.println("Letra c: " + letterSmallC); // B
    }
}

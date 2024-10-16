package edu.tutorialspoint.basic.casting;

public class CastingTypes02 {
    public static void main(String[] args) {
        int intNum = 2004;
        double doubleNum = (double) intNum;

        System.out.println("O valor " + intNum + " após ser convertido para double é " + doubleNum); // O valor 2004 após ser convertido para double é 2004.0

        int convertedInt = (int) doubleNum;

        System.out.println("O valor " + doubleNum + " após ser convertido para int é " + convertedInt); // O valor 2004.0 após ser convertido para int é 2004
    }
}

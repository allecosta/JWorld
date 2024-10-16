package edu.tutorialspoint.basic.data;

public class DataTypes {
    public static void main(String[] args) {
        byte byteValue01 = 2;
        byte byteValue02 = 4;
        byte byteResult = (byte) (byteValue01 + byteValue02);

        System.out.println("Byte: " + byteResult );

        short shortValue01 = 6;
        short shortValue02 = 8;
        short shortResult = (short) (shortValue01 + shortValue02);

        System.out.println("Short: " + shortResult);

        int intValue01 = 10;
        int intValue02 = 12;
        int intResult = intValue01 + intValue02;

        System.out.println("Int: " + intResult);

        long longValue01 = 14L; 
        long longValue02 = 16L;
        long longResult = longValue01 + longValue02;

        System.out.println("Long: " + longResult);

        float floatValue01 = 18.2f;
        float floatValue02 = 20.4f;
        float floatResult = floatValue01 + floatValue02;

        System.out.println("Float: " + floatResult);

        double doubleValue01 = 22.5;
        double doubleValue02 = 24.5;
        double doubleResult = doubleValue01 + doubleValue02;

        System.out.println("Double: " + doubleResult);

        boolean booleanValue = true;

        System.out.println("Boolean: " + booleanValue);

        char charValue = 'A';

        System.out.println("Char: " + charValue);
    }
}

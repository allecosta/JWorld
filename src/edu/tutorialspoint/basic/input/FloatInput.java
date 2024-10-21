package edu.tutorialspoint.basic.input;

import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o 1º valor do tipo float: ");
        float num01 = scan.nextFloat();
        System.out.print("Informe o 2º valor do tipo float: ");
        float num02 = scan.nextFloat();

        System.out.println("Os dois valores do tipo float foram " + num01 + " e " + num02);

        scan.close();
    }
}

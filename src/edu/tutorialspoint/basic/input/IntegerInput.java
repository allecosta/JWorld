package edu.tutorialspoint.basic.input;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        int num01 = scan.nextInt();
        System.out.print("Informe o 2º número: ");
        int num02 = scan.nextInt();

        int sum = num01 + num02;

        System.out.println(num01 + " + " + num02 + " = " + sum);

        scan.close();
    }
}

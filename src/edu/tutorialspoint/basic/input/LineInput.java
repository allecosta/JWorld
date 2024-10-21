package edu.tutorialspoint.basic.input;

import java.util.Scanner;

public class LineInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String name = scan.nextLine();

        System.out.println("Nome: " + name);

        scan.close();
    }
}

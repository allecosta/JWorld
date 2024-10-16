package edu.tutorialspoint.basic.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        
        int b = (a == 1) ? 20 : 30;

        System.out.println("Valor de b: " + b); // 30

        b = (a == 10) ? 20 : 30;

        System.out.println("Valor de b: " + b); // 20
    }
}

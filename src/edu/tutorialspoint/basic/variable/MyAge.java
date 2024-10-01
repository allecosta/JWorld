package edu.tutorialspoint.basic.variable;

/**
 * Examplo 3: Variável de scopo local 
 * Idade é uma variável local, inicializada dentro do método myAge() ou recebendo o valor por parametro
 * Este scopo é limitado somente dentro método
 * 
 */

public class MyAge {
    public void myAge(int age) {
        //int age = 0;
        //age = age + 83;

        System.out.println("Minha idade é: " + age + " anos.");
    }

    public static void main(String[] args) {
        MyAge test = new MyAge();
        test.myAge(83);
    }
}

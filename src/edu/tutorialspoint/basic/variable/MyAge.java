package edu.tutorialspoint.basic.variable;

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

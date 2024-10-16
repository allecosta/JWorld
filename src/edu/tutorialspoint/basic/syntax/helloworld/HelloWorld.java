package edu.tutorialspoint.basic.syntax.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorldEnum hello = new HelloWorldEnum();
        hello.size = HelloWorldEnum.HelloWorldSize.TEN;

        System.out.println("Tamanho da palavra Hello World: " + hello.size + " tem caracteres.");
    }
}

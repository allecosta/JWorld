package edu.tutorialspoint.advanced.lambda;

public class Lambda01 {
    public static void main(String[] args) {
        Lambda01 l01 = new Lambda01();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {return a * b;};
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(l01.operate(20, 10, addition)); // 30
        System.out.println(l01.operate(15, 7, subtraction)); // 8
        System.out.println(l01.operate(8, 9, multiplication)); // 72
        System.out.println(l01.operate(10, 5, division)); // 2

        GreetingService gs01 = message -> System.out.println("Olá " + message);
        GreetingService gs02 = (message) -> System.out.println("Tudo bem? " + message);

        gs01.sayMessage("José Maria");
        gs02.sayMessage("Sim, tudo bem comigo!");
    }
 
    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

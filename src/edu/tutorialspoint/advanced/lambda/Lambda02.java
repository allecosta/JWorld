package edu.tutorialspoint.advanced.lambda;

public class Lambda02 {
    final static String salutation = "Olá! ";
    
    public static void main(String[] args) {
        GreetingService gs = message -> System.out.println(salutation + message);
        gs.sayMessage("José Maria");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}

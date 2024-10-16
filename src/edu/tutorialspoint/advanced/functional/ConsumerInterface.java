package edu.tutorialspoint.advanced.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        Consumer<Integer> con01 = (value) -> System.out.println(value);
        Consumer<Integer> con02 = System.out::println;

        System.out.println("Visualizando uma Interface Funcional Consumer com Expressão Lambda.");
        numbers.forEach(con01);

        System.out.println("Visualizando uma Interface Funcional Consumer com Método de Referência");
        numbers.forEach(con02);

    }
}

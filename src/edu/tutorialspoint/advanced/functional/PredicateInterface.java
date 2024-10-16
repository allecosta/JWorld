package edu.tutorialspoint.advanced.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
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

        Predicate<Integer> isEvenNumber = n -> n % 2 == 0;
        numbers = numbers.stream().filter(isEvenNumber).toList();

        System.out.println(numbers); // [8, 6, 4, 2]
    }
}

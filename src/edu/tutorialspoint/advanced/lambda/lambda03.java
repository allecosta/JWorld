package edu.tutorialspoint.advanced.lambda;

import java.util.ArrayList;
import java.util.List;

public class lambda03 {
    public static void main(String[] args) {
        List<String> lang = new ArrayList<>();
        lang.add("Java <3");
        lang.add("HTML5");
        lang.add("CSS3");
        lang.add("PHP");

        lang.forEach(i -> System.out.println(i));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.print(numbers + " "); // [8, 7, 6, 5, 4, 3, 2, 1]

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println(numbers); // [7, 5, 3, 1]

    }
}

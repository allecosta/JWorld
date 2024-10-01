package edu.tutorialspoint.miscellaneous.streams.streamapi;

import java.util.stream.Stream;

public class StreamAPI02 {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "", "e", "f")
            .dropWhile(s -> !s.isEmpty())
            .forEach(System.out::print);

        System.out.println();

        Stream.of("a", "b", "c", "", "e", " ", "f")
            .dropWhile(s -> !s.isEmpty())
            .forEach(System.out::print);
    }
}

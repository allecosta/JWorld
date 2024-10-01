package edu.tutorialspoint.miscellaneous.streams.streamapi;

import java.util.stream.Stream;

public class StreamAPI01 {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "", "e", "f")
            .takeWhile(s -> !s.isEmpty())
            .forEach(System.out::print);
    }
}

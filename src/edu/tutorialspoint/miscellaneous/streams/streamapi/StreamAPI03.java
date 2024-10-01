package edu.tutorialspoint.miscellaneous.streams.streamapi;

import java.util.stream.IntStream;

public class StreamAPI03 {
    public static void main(String[] args) {
        IntStream.iterate(3, x -> x < 10, x -> x + 3)
            .forEach(System.out::println);
    }
}

package edu.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

public class DynamicTestCreationTest {

    @TestFactory
    Stream<DynamicTest> testDifferentMultiplyOperations() {
        DynamicTestCreation tester = new DynamicTestCreation();
        int[][] data = new int[][] { {1, 2, 2}, {5, 3, 15}, {121, 4, 484} };

        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];

            return dynamicTest(m1 + " x " + m2 + " = " + expected, () -> {
                assertEquals(expected, tester.multiply(m1, m2));
            });
        });
    }
}

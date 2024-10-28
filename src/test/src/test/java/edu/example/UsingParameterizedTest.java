package edu.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UsingParameterizedTest {

    public static int[][] data() {
        return new int[][] { {3, 2, 5}, {10, 13, 23}, {500, 600, 1100} };
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    void testWithStringParameter(int[] data) {
        UsingParameterized tester = new UsingParameterized();
        int a1 = data[0];
        int a2 = data[1];
        int expected = data[2];

        assertEquals(expected, tester.addition(a1, a2));
    }
}

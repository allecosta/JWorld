package edu.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

//import edu.example.Calculator;

public class CalculatorTest {
    
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Esperando que funcione...")
    void testMultiply() {
        assertEquals(72, calculator.multiply(8, 9), "Pronto para funcionar!");
    }

    @RepeatedTest(2)
    @DisplayName("Garantindo o tratamento correto com zero...")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiplicando com zero, espero que funcione :-)");
        assertEquals(0, calculator.multiply(7, 0), "Multiplicando com zero, espero que funcione :-)");
    }
}

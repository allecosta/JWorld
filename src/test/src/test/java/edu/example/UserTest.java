package edu.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user = new User();

    /* 
    @BeforeEach
    void setUp() {
        user = new User();
    }*/

    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> user.setAge("A"));
        assertEquals("A idade deve ser um número inteiro!", exception.getMessage());
    }
}

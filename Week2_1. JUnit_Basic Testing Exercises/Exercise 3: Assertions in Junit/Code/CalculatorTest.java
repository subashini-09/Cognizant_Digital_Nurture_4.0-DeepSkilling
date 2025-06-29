package com.example.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(9, calculator.add(5, 4));
    }

    @Test
    void testSubtract() {
        assertNotEquals(3, calculator.subtract(7, 2));
    }

    @Test
    void testEvenCheck() {
        assertTrue(calculator.isEven(10));
        assertFalse(calculator.isEven(9));
    }

    @Test
    void testWelcomeMessage() {
        assertNotNull(calculator.getWelcomeMessage());
    }

    @Test
    void testNullValue() {
        assertNull(calculator.getNullValue());
    }
}

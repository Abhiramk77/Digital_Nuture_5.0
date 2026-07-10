package com.digitalnurture.tdd.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Test basic addition")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    @DisplayName("Test division validation")
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), "5 / 2 should equal 2.5");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 12, 38, 100})
    @DisplayName("Parameterized test for even numbers")
    void testIsEven(int number) {
        assertTrue(calculator.isEven(number), number + " should be even");
    }
}

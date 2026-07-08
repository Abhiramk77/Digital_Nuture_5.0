package com.digitalnurture.tdd.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class to run and verify OrderProcessor logging operations.
 */
class OrderProcessorTest {

    private OrderProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new OrderProcessor();
    }

    @Test
    @DisplayName("Verify successful order processing logs")
    void testProcessOrder_Success() {
        assertDoesNotThrow(() -> {
            processor.processOrder("ORD-12345", 250.75);
        });
    }

    @Test
    @DisplayName("Verify negative price warning logs")
    void testProcessOrder_Warning() {
        assertDoesNotThrow(() -> {
            processor.processOrder("ORD-WARN", -50.00);
        });
    }

    @Test
    @DisplayName("Verify invalid order ID error logs")
    void testProcessOrder_Error() {
        assertThrows(IllegalArgumentException.class, () -> {
            processor.processOrder("   ", 10.00);
        });
    }
}

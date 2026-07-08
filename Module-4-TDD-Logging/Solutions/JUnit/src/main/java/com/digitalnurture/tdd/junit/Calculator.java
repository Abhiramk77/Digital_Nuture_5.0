package com.digitalnurture.tdd.junit;

/**
 * Basic Calculator class to demonstrate JUnit 5 testing.
 */
public class Calculator {

    /**
     * Adds two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Divides two integers. Throws IllegalArgumentException on division by zero.
     */
    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    /**
     * Checks if a number is even.
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

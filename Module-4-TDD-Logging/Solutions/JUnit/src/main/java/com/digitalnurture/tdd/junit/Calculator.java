package com.digitalnurture.tdd.junit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

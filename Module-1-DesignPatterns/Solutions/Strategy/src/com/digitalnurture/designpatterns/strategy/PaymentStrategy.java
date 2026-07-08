package com.digitalnurture.designpatterns.strategy;

/**
 * Strategy interface defining payment execution contracts.
 */
public interface PaymentStrategy {
    void pay(double amount);
}

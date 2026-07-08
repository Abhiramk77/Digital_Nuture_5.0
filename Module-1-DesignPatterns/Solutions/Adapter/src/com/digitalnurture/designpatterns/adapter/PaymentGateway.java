package com.digitalnurture.designpatterns.adapter;

/**
 * Target Interface that client uses.
 */
public interface PaymentGateway {
    void processPayment(double amount);
}

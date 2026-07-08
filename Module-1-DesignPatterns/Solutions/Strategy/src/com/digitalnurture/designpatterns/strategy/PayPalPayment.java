package com.digitalnurture.designpatterns.strategy;

/**
 * Concrete Strategy implementing PayPal payment logic.
 */
public class PayPalPayment implements PaymentStrategy {
    private final String emailId;
    private final String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing transaction of $" + amount + " using PayPal Account: " + emailId);
    }
}

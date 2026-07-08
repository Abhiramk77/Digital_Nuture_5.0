package com.digitalnurture.designpatterns.adapter;

/**
 * Test runner for Adapter Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Adapter Pattern ===");

        // Incompatible third-party gateway
        StripeGateway stripeGateway = new StripeGateway();

        // Wrap the adaptee using the adapter
        PaymentGateway paymentGateway = new StripeAdapter(stripeGateway);

        // The client code interacts using the standard PaymentGateway interface in dollars
        double paymentAmount = 149.99;
        System.out.println("Client initiating payment of $" + paymentAmount + "...");
        paymentGateway.processPayment(paymentAmount);
    }
}

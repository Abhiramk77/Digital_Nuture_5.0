package com.digitalnurture.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Adapter Pattern ===");

        StripeGateway stripeGateway = new StripeGateway();

        PaymentGateway paymentGateway = new StripeAdapter(stripeGateway);

        double paymentAmount = 149.99;
        System.out.println("Client initiating payment of $" + paymentAmount + "...");
        paymentGateway.processPayment(paymentAmount);
    }
}

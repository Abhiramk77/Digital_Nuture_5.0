package com.digitalnurture.designpatterns.adapter;

/**
 * Adaptee class.
 * Has incompatible interface compared to target interface.
 */
public class StripeGateway {
    // Stripe expects amount in cents (integer)
    public void makeStripePayment(int amountInCents) {
        double amountInDollars = amountInCents / 100.0;
        System.out.println("Processing transaction via Stripe API: $" + amountInDollars + " (Cents: " + amountInCents + ")");
    }
}

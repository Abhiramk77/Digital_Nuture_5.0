package com.digitalnurture.designpatterns.adapter;

public class StripeGateway {
    public void makeStripePayment(int amountInCents) {
        double amountInDollars = amountInCents / 100.0;
        System.out.println("Processing transaction via Stripe API: $" + amountInDollars + " (Cents: " + amountInCents + ")");
    }
}

package com.digitalnurture.designpatterns.adapter;

public class StripeAdapter implements PaymentGateway {
    private final StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        int amountInCents = (int) (amount * 100);
        stripeGateway.makeStripePayment(amountInCents);
    }
}

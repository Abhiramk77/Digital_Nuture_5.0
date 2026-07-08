package com.digitalnurture.designpatterns.adapter;

/**
 * Adapter class.
 * Implements target interface (PaymentGateway) and routes requests to the adaptee (StripeGateway).
 */
public class StripeAdapter implements PaymentGateway {
    private final StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Convert dollar amount to cents for Stripe compatibility
        int amountInCents = (int) (amount * 100);
        stripeGateway.makeStripePayment(amountInCents);
    }
}

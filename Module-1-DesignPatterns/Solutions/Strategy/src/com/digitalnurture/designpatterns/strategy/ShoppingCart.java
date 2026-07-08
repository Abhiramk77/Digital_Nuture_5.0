package com.digitalnurture.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Context class.
 * Configured with a Concrete Strategy object and maintains a reference to it.
 */
public class ShoppingCart {
    private final List<Double> items = new ArrayList<>();

    public void addItem(double price) {
        items.add(price);
    }

    public double calculateTotal() {
        double sum = 0;
        for (double price : items) {
            sum += price;
        }
        return sum;
    }

    /**
     * Executes the payment using the injected strategy.
     */
    public void checkout(PaymentStrategy paymentMethod) {
        double totalAmount = calculateTotal();
        paymentMethod.pay(totalAmount);
    }
}

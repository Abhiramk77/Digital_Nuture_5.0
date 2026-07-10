package com.digitalnurture.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

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

    public void checkout(PaymentStrategy paymentMethod) {
        double totalAmount = calculateTotal();
        paymentMethod.pay(totalAmount);
    }
}

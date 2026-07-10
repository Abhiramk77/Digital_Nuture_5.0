package com.digitalnurture.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Strategy Pattern ===");

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(24.50);
        cart.addItem(125.00);
        cart.addItem(9.99);

        System.out.println("--- Scenario 1: Paying with Credit Card ---");
        PaymentStrategy ccStrategy = new CreditCardPayment(
                                        "Abhi Ram",
                                        "1234567890123456",
                                        "123",
                                        "12/28"
                                     );
        cart.checkout(ccStrategy);
        System.out.println();

        System.out.println("--- Scenario 2: Paying with PayPal ---");
        PaymentStrategy paypalStrategy = new PayPalPayment(
                                            "abhiram@example.com",
                                            "secured_pass_123"
                                         );
        cart.checkout(paypalStrategy);
    }
}

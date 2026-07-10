package com.digitalnurture.designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPayment(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        String maskedCard = "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing transaction of $" + amount + " using Credit Card (" + maskedCard + ") for cardholder: " + name);
    }
}

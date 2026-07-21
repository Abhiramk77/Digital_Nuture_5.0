package com.digitalnurture.designpatterns.observer;

public class MobileAppObserver implements Observer {
    private final String clientName;

    public MobileAppObserver(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[Mobile Push Alert for " + clientName + "]: " + stockSymbol + " changed to $" + price);
    }
}

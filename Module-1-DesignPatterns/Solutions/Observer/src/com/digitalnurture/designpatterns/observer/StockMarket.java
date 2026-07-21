package com.digitalnurture.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double price;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, price);
        }
    }

    public void setStockData(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        System.out.println("[StockMarket Update]: " + stockSymbol + " is now $" + price);
        notifyObservers();
    }
}

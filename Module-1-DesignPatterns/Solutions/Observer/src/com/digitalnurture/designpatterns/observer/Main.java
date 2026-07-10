package com.digitalnurture.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Observer Pattern ===");

        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver1 = new MobileAppObserver("Abhi");
        Observer mobileObserver2 = new MobileAppObserver("Ram");
        Observer webObserver = new WebAppObserver("Financial-Board-01");

        System.out.println("Registering observers...");
        stockMarket.registerObserver(mobileObserver1);
        stockMarket.registerObserver(mobileObserver2);
        stockMarket.registerObserver(webObserver);
        System.out.println();

        stockMarket.setStockData("GOOGL", 175.50);
        System.out.println();

        System.out.println("Deregistering Ram's mobile observer...");
        stockMarket.removeObserver(mobileObserver2);
        System.out.println();

        stockMarket.setStockData("GOOGL", 178.25);
    }
}

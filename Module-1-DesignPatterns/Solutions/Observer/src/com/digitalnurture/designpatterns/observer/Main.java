package com.digitalnurture.designpatterns.observer;

/**
 * Test runner for Observer Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Observer Pattern ===");

        // Initialize concrete Subject
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        Observer mobileObserver1 = new MobileAppObserver("Abhi");
        Observer mobileObserver2 = new MobileAppObserver("Ram");
        Observer webObserver = new WebAppObserver("Financial-Board-01");

        // Register Observers
        System.out.println("Registering observers...");
        stockMarket.registerObserver(mobileObserver1);
        stockMarket.registerObserver(mobileObserver2);
        stockMarket.registerObserver(webObserver);
        System.out.println();

        // Simulate stock price updates
        stockMarket.setStockData("GOOGL", 175.50);
        System.out.println();

        // Remove one observer
        System.out.println("Deregistering Ram's mobile observer...");
        stockMarket.removeObserver(mobileObserver2);
        System.out.println();

        // Update price again
        stockMarket.setStockData("GOOGL", 178.25);
    }
}

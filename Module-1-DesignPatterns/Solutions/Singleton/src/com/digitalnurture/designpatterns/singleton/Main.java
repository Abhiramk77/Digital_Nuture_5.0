package com.digitalnurture.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern ===");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("Failure: Separate instances were created.");
        }

        logger1.log("User logged in successfully.");
        logger2.log("Transaction processed with ID: TXN100234.");
    }
}

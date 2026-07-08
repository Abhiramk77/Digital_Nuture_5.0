package com.digitalnurture.designpatterns.singleton;

/**
 * Test runner for Singleton Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern ===");

        // Retrieve Logger instances in separate threads or main thread
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both references point to the exact same memory instance
        if (logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("Failure: Separate instances were created.");
        }

        // Event logging
        logger1.log("User logged in successfully.");
        logger2.log("Transaction processed with ID: TXN100234.");
    }
}

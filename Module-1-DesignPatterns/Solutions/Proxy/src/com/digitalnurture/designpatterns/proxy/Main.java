package com.digitalnurture.designpatterns.proxy;

/**
 * Test runner for Proxy Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Proxy Pattern ===");

        // Create a ProxyImage (does not load image from disk immediately)
        Image image = new ProxyImage("annual_report_2026.png");

        System.out.println("--- First Call to display() ---");
        // Trigger lazy loading of the image
        image.display();
        System.out.println();

        System.out.println("--- Second Call to display() ---");
        // Uses the cached image instance
        image.display();
    }
}

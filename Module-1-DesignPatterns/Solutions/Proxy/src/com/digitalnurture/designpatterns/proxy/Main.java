package com.digitalnurture.designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Proxy Pattern ===");

        Image image = new ProxyImage("annual_report_2026.png");

        System.out.println("--- First Call to display() ---");

        image.display();
        System.out.println();

        System.out.println("--- Second Call to display() ---");

        image.display();
    }
}

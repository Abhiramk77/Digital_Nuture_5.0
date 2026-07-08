package com.digitalnurture.designpatterns.builder;

/**
 * Test runner for Builder Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Builder Pattern ===");

        // Construct computer with only required parameters
        Computer officePC = new Computer.Builder("500 GB HDD", "8 GB RAM")
                                        .build();
        System.out.println("Office PC Configuration:");
        System.out.println(officePC);
        System.out.println();

        // Construct computer with all parameters (chained builders)
        Computer gamingPC = new Computer.Builder("1 TB SSD", "32 GB DDR5 RAM")
                                        .setGraphicsCardEnabled(true)
                                        .setBluetoothEnabled(true)
                                        .build();
        System.out.println("Gaming PC Configuration:");
        System.out.println(gamingPC);
    }
}

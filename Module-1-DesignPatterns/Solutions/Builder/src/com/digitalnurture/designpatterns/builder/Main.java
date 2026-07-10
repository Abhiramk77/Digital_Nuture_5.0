package com.digitalnurture.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Builder Pattern ===");

        Computer officePC = new Computer.Builder("500 GB HDD", "8 GB RAM")
                                        .build();
        System.out.println("Office PC Configuration:");
        System.out.println(officePC);
        System.out.println();

        Computer gamingPC = new Computer.Builder("1 TB SSD", "32 GB DDR5 RAM")
                                        .setGraphicsCardEnabled(true)
                                        .setBluetoothEnabled(true)
                                        .build();
        System.out.println("Gaming PC Configuration:");
        System.out.println(gamingPC);
    }
}

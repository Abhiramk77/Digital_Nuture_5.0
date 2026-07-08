package com.digitalnurture.designpatterns.builder;

/**
 * Product class representing a Computer.
 * Explains: Creational Design Pattern that lets you construct complex objects step-by-step.
 */
public class Computer {
    // Required parameters
    private final String HDD;
    private final String RAM;

    // Optional parameters
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    // Private constructor so that it can only be instantiated through the Builder
    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters
    public String getHDD() { return HDD; }
    public String getRAM() { return RAM; }
    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "- HDD: " + HDD + "\n" +
               "- RAM: " + RAM + "\n" +
               "- Graphics Card: " + (isGraphicsCardEnabled ? "Enabled" : "Disabled") + "\n" +
               "- Bluetooth: " + (isBluetoothEnabled ? "Enabled" : "Disabled");
    }

    /**
     * Static nested Builder class.
     */
    public static class Builder {
        // Required parameters
        private final String HDD;
        private final String RAM;

        // Optional parameters (initialized with defaults)
        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;

        // Builder constructor enforcing required fields
        public Builder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        // Setter-like methods returning the Builder instance for chaining
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Build method to return final Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}

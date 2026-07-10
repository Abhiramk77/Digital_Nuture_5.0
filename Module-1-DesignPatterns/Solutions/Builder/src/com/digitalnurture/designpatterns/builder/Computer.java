package com.digitalnurture.designpatterns.builder;

public class Computer {
    private final String HDD;
    private final String RAM;

    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

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

    public static class Builder {
        private final String HDD;
        private final String RAM;

        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;

        public Builder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

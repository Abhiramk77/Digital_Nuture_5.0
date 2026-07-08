package com.digitalnurture.designpatterns.proxy;

/**
 * Concrete Subject implementing Image interface.
 * Simulates heavy operations like loading files from disk.
 */
public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename + " (heavy operation)...");
        try {
            Thread.sleep(1000); // Simulate network/disk latency
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying Image: " + filename);
    }
}

package com.digitalnurture.designpatterns.proxy;

/**
 * Proxy class.
 * Delays the creation of the RealImage until it is actually requested (lazy loading).
 * Caches the RealImage after first load to prevent repeating the heavy operation.
 */
public class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Lazy load the image on first call
            realImage = new RealImage(filename);
        } else {
            System.out.println("Image retrieved from memory cache: " + filename);
        }
        realImage.display();
    }
}

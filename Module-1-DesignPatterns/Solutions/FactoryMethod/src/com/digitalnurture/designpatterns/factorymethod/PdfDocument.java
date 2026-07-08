package com.digitalnurture.designpatterns.factorymethod;

/**
 * Concrete Product implementing Document interface.
 */
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Adobe PDF Document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Adobe PDF Document...");
    }
}

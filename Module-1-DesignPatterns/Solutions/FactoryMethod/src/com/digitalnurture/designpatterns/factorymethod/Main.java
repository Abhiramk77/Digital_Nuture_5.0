package com.digitalnurture.designpatterns.factorymethod;

/**
 * Test runner for Factory Method Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Factory Method Pattern ===");

        // Process Word Document using Word Factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        System.out.println("Using Word Document Factory:");
        wordFactory.processDocument();

        System.out.println();

        // Process PDF Document using PDF Factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        System.out.println("Using PDF Document Factory:");
        pdfFactory.processDocument();
    }
}

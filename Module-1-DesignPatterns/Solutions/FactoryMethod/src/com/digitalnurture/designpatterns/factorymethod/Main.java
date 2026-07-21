package com.digitalnurture.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Factory Method Pattern ===");

        DocumentFactory wordFactory = new WordDocumentFactory();
        System.out.println("Using Word Document Factory:");
        wordFactory.processDocument();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        System.out.println("Using PDF Document Factory:");
        pdfFactory.processDocument();
    }
}

package com.digitalnurture.designpatterns.factorymethod;

/**
 * Concrete Creator overriding the factory method for PDF documents.
 */
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

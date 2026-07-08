package com.digitalnurture.designpatterns.factorymethod;

/**
 * Concrete Creator overriding the factory method for Word documents.
 */
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

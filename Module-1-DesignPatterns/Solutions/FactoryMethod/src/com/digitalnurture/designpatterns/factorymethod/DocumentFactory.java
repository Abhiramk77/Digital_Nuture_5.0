package com.digitalnurture.designpatterns.factorymethod;

/**
 * Creator abstract class declaring the factory method.
 */
public abstract class DocumentFactory {
    // The Factory Method
    public abstract Document createDocument();

    // An operation that uses the factory method
    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        // perform tasks...
        doc.close();
    }
}

package com.digitalnurture.designpatterns.factorymethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Microsoft Word Document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Microsoft Word Document...");
    }
}

package com.digitalnurture.designpatterns.observer;

/**
 * Observer interface defining the update contract.
 */
public interface Observer {
    void update(String stockSymbol, double price);
}

package com.digitalnurture.designpatterns.observer;

/**
 * Subject interface declaring observer registration, deregistration, and notification.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

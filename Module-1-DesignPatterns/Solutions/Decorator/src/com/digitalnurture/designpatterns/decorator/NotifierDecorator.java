package com.digitalnurture.designpatterns.decorator;

/**
 * Base Decorator class.
 * Implements the component interface and delegates execution to the wrapped notifier.
 */
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}

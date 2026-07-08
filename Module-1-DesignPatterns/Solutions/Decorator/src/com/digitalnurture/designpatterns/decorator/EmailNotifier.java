package com.digitalnurture.designpatterns.decorator;

/**
 * Concrete Component implementing basic Notifier.
 */
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL Notification: " + message);
    }
}

package com.digitalnurture.designpatterns.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL Notification: " + message);
    }
}

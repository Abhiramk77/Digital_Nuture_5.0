package com.digitalnurture.designpatterns.decorator;

/**
 * Concrete Decorator extending NotifierDecorator to add SMS capability.
 */
public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Deliver base notification (e.g. Email)
        sendSMS(message);    // Add SMS behavior
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}

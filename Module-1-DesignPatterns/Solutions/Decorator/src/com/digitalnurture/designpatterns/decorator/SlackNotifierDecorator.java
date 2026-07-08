package com.digitalnurture.designpatterns.decorator;

/**
 * Concrete Decorator extending NotifierDecorator to add Slack capability.
 */
public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Deliver base notification
        sendSlackMessage(message); // Add Slack behavior
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending SLACK Channel Notification: " + message);
    }
}

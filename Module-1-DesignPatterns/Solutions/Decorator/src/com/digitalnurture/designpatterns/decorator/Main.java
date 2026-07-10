package com.digitalnurture.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Decorator Pattern ===");

        System.out.println("--- Scenario 1: Base Email Notifier ---");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("System Update: Database backup started.");
        System.out.println();

        System.out.println("--- Scenario 2: Email + SMS Notifier ---");
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsAndEmailNotifier.send("Security Alert: Login attempt detected.");
        System.out.println();

        System.out.println("--- Scenario 3: Email + SMS + Slack Notifier ---");
        Notifier fullyStackedNotifier = new SlackNotifierDecorator(
                                            new SMSNotifierDecorator(
                                                new EmailNotifier()
                                            )
                                         );
        fullyStackedNotifier.send("Critical Error: Core application service crashed!");
    }
}

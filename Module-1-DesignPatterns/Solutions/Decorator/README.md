# Decorator Design Pattern

## Pattern Explanation
The Decorator Pattern is a **Structural Design Pattern** that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

It solves problems such as:
1. **Inheritance Explosion**: Avoids subclassing a class for every combination of optional features.
2. **Runtime Flexibility**: Dynamically adds or removes responsibilities from an object at runtime.

---

## Class Details
- **`Notifier.java`**: Component interface defining notification operations.
- **`EmailNotifier.java`**: Concrete component delivering standard Email notifications.
- **`NotifierDecorator.java`**: Base decorator class that maintains a reference to a wrapped `Notifier`.
- **`SMSNotifierDecorator.java`**: Concrete decorator that appends SMS capabilities.
- **`SlackNotifierDecorator.java`**: Concrete decorator that appends Slack channel posting.
- **`Main.java`**: Client driver highlighting dynamic stacking of decorators.

---

## How to Compile & Run
Navigate to the root of the Decorator package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/decorator/*.java
java com.digitalnurture.designpatterns.decorator.Main
```

## Example Output
```text
=== Testing Decorator Pattern ===
--- Scenario 1: Base Email Notifier ---
Sending EMAIL Notification: System Update: Database backup started.

--- Scenario 2: Email + SMS Notifier ---
Sending EMAIL Notification: Security Alert: Login attempt detected.
Sending SMS Notification: Security Alert: Login attempt detected.

--- Scenario 3: Email + SMS + Slack Notifier ---
Sending EMAIL Notification: Critical Error: Core application service crashed!
Sending SMS Notification: Critical Error: Core application service crashed!
Sending SLACK Channel Notification: Critical Error: Core application service crashed!
```

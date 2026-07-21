# Observer Design Pattern

## Pattern Explanation
The Observer Pattern is a **Behavioral Design Pattern** that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

It is particularly useful for:
1. **Event Handling Systems**: Decoupling publishers and subscribers.
2. **State Propagation**: Broadcasting real-time state updates (e.g. stock feeds, weather updates, notifications).

---

## Class Details
- **`Observer.java`**: The subscriber interface defining the `update` callback.
- **`Subject.java`**: The publisher interface defining registration contracts.
- **`StockMarket.java`**: Concrete subject managing subscribers and state notifications.
- **`MobileAppObserver.java`**: Concrete observer simulating a mobile app receiver.
- **`WebAppObserver.java`**: Concrete observer simulating a web dashboard receiver.
- **`Main.java`**: Client driver validating subscription events and state updates.

---

## How to Compile & Run
Navigate to the root of the Observer package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/observer/*.java
java com.digitalnurture.designpatterns.observer.Main
```

## Example Output
```text
=== Testing Observer Pattern ===
Registering observers...

[StockMarket Update]: GOOGL is now $175.5
[Mobile Push Alert for Abhi]: GOOGL changed to $175.5
[Mobile Push Alert for Ram]: GOOGL changed to $175.5
[Web Dashboard Financial-Board-01]: Render stock GOOGL at new price: $175.5

Deregistering Ram's mobile observer...

[StockMarket Update]: GOOGL is now $178.25
[Mobile Push Alert for Abhi]: GOOGL changed to $178.25
[Web Dashboard Financial-Board-01]: Render stock GOOGL at new price: $178.25
```

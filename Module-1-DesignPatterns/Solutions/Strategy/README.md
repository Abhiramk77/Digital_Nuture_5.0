# Strategy Design Pattern

## Pattern Explanation
The Strategy Pattern is a **Behavioral Design Pattern** that defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

It solves problems such as:
1. **Conditional Overload**: Replaces complex conditional switches (e.g. `if-else` blocks for payment methods) with clean, polymorphic execution.
2. **Open-Closed Principle**: Allows adding new algorithms (strategies) without modifying the context class.

---

## Class Details
- **`PaymentStrategy.java`**: Strategy interface declaring the signature of payment algorithms.
- **`CreditCardPayment.java`**: Concrete strategy implementing Credit Card transaction execution.
- **`PayPalPayment.java`**: Concrete strategy implementing PayPal transaction execution.
- **`ShoppingCart.java`**: Context class containing items and delegating checks to the active strategy.
- **`Main.java`**: Client application running test cases.

---

## How to Compile & Run
Navigate to the root of the Strategy package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/strategy/*.java
java com.digitalnurture.designpatterns.strategy.Main
```

## Example Output
```text
=== Testing Strategy Pattern ===
--- Scenario 1: Paying with Credit Card ---
Processing transaction of $159.49 using Credit Card (****-****-****-3456) for cardholder: Abhi Ram

--- Scenario 2: Paying with PayPal ---
Processing transaction of $159.49 using PayPal Account: abhiram@example.com
```

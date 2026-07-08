# Adapter Design Pattern

## Pattern Explanation
The Adapter Pattern is a **Structural Design Pattern** that allows objects with incompatible interfaces to collaborate. It acts as a wrapper that translates client requests into a format that the service object understands.

It solves problems such as:
1. **Incompatible APIs**: Working with third-party libraries or legacy systems that have different interface structures.
2. **Open-Closed Principle**: Introduces new adapter classes without breaking existing client code.

---

## Class Details
- **`PaymentGateway.java`**: The target interface (in dollars) expected by client systems.
- **`StripeGateway.java`**: The incompatible third-party system (expects cents).
- **`StripeAdapter.java`**: The adapter that converts dollar calls to cents and routes them to Stripe.
- **`Main.java`**: The test client showing seamless translation.

---

## How to Compile & Run
Navigate to the root of the Adapter package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/adapter/*.java
java com.digitalnurture.designpatterns.adapter.Main
```

## Example Output
```text
=== Testing Adapter Pattern ===
Client initiating payment of $149.99...
Processing transaction via Stripe API: $149.99 (Cents: 14999)
```

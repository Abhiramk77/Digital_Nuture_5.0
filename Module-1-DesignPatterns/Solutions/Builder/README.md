# Builder Design Pattern

## Pattern Explanation
The Builder Pattern is a **Creational Design Pattern** that allows for the step-by-step construction of complex objects. Unlike other creational patterns, Builder does not require products to have a common interface. This makes it possible to produce different representations of the product using the same construction process.

It solves problems such as:
1. **Telescoping Constructor Anti-pattern**: Too many constructors with different combinations of optional parameters.
2. **Inconsistent Object State**: Avoids exposing setters that make objects mutable and prone to concurrency issues.

---

## Class Details
- **`Computer.java`**: The target product containing a static nested `Builder` class.
- **`Main.java`**: Drive execution to build both standard and high-end configurations.

---

## How to Compile & Run
Navigate to the root of the Builder package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/builder/*.java
java com.digitalnurture.designpatterns.builder.Main
```

## Example Output
```text
=== Testing Builder Pattern ===
Office PC Configuration:
Computer Configuration:
- HDD: 500 GB HDD
- RAM: 8 GB RAM
- Graphics Card: Disabled
- Bluetooth: Disabled

Gaming PC Configuration:
Computer Configuration:
- HDD: 1 TB SSD
- RAM: 32 GB DDR5 RAM
- Graphics Card: Enabled
- Bluetooth: Enabled
```

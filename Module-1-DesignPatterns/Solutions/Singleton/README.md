# Singleton Design Pattern

## Pattern Explanation
The Singleton Pattern is a **Creational Design Pattern** that ensures a class has only one instance while providing a global access point to that instance. It is commonly used for shared resources like loggers, configuration managers, thread pools, and database connection pools.

### Key Aspects
1. **Private Constructor**: Prevents other classes from instantiating the class directly.
2. **Volatile Static Field**: Stores the single instance, ensuring thread-safe visibility of updates across threads.
3. **Double-Checked Locking**: Restricts synchronization overhead by only obtaining a lock during initial instantiation.

---

## Class Details
- **`Logger.java`**: Implements the singleton instance and business logging.
- **`Main.java`**: Instantiates and verifies that multiple logger calls reference the same instance.

---

## How to Compile & Run
Navigate to the root of the Singleton package and compile/run the java files:
```bash
cd src
javac com/digitalnurture/designpatterns/singleton/*.java
java com.digitalnurture.designpatterns.singleton.Main
```

## Example Output
```text
=== Testing Singleton Pattern ===
Logger initialized successfully.
Success: Both logger1 and logger2 point to the same instance.
[LOG]: User logged in successfully.
[LOG]: Transaction processed with ID: TXN100234.
```

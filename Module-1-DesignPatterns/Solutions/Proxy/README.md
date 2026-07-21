# Proxy Design Pattern

## Pattern Explanation
The Proxy Pattern is a **Structural Design Pattern** that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request reaches the original object.

It is particularly useful for:
1. **Lazy Initialization (Virtual Proxy)**: Delaying creation of heavy resources (images, database connections) until they are actually needed.
2. **Caching (Cache Proxy)**: Storing local copies of server/disk responses to speed up repeated queries.
3. **Access Control (Protection Proxy)**: Managing resource permissions.

---

## Class Details
- **`Image.java`**: Subject interface detailing basic operations.
- **`RealImage.java`**: Concrete Subject representing the resource-intensive loading operations.
- **`ProxyImage.java`**: Proxy class wrapping the target and providing lazy loading and caching support.
- **`Main.java`**: Driver class validating lazy execution.

---

## How to Compile & Run
Navigate to the root of the Proxy package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/proxy/*.java
java com.digitalnurture.designpatterns.proxy.Main
```

## Example Output
```text
=== Testing Proxy Pattern ===
--- First Call to display() ---
Loading image from disk: annual_report_2026.png (heavy operation)...
Displaying Image: annual_report_2026.png

--- Second Call to display() ---
Image retrieved from memory cache: annual_report_2026.png
Displaying Image: annual_report_2026.png
```

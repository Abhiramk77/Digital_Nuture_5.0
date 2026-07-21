# Command Design Pattern

## Pattern Explanation
The Command Pattern is a **Behavioral Design Pattern** that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.

It solves problems such as:
1. **Direct Coupling**: Decouples the object that invokes the command (Invoker) from the object that knows how to execute it (Receiver).
2. **Extensibility**: New command classes can be added without changing the invoker or receiver code.

---

## Class Details
- **`Command.java`**: Interface specifying the `execute` operation.
- **`Light.java`**: The Receiver containing execution logic (`turnOn`/`turnOff`).
- **`LightOnCommand.java`**: Concrete command to turn the light on.
- **`LightOffCommand.java`**: Concrete command to turn the light off.
- **`RemoteControl.java`**: The Invoker that requests the command to execute.
- **`Main.java`**: Test client simulating remote control execution.

---

## How to Compile & Run
Navigate to the root of the Command package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/command/*.java
java com.digitalnurture.designpatterns.command.Main
```

## Example Output
```text
=== Testing Command Pattern ===
Invoker: Setting 'Turn ON' command...
The Living Room light is ON.

Invoker: Setting 'Turn OFF' command...
The Living Room light is OFF.
```

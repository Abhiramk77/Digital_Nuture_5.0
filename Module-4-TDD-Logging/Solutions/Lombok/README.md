# Project Lombok

## Concept Explanation
**Lombok** is a Java library that plugs into your editor and build tools to auto-generate boilerplate bytecode (like getters, setters, constructors, builders, and toString methods) during compilation. It keeps the Java source clean, concise, and highly readable.

Annotations demonstrated:
- `@Getter`: Generates public getter methods for all fields.
- `@Setter`: Generates public setter methods for non-final fields.
- `@NoArgsConstructor`: Generates a public default constructor.
- `@AllArgsConstructor`: Generates a public parameterized constructor accepting values for all fields.
- `@ToString`: Generates a standard readable implementation of `toString()`.
- `@Builder`: Generates a fluid builder API for step-by-step object instantiation.

---

## Configuration and Dependencies
Included in the Maven `pom.xml`:
- `lombok` dependency (scope: provided, meaning it is only required at compile time for code generation, and is omitted from the runtime package).
- `maven-compiler-plugin` configuration containing `annotationProcessorPaths` referencing Lombok. This is required for modern Java compilation.

---

## Run Commands
Run Lombok tests using Maven:
```bash
mvn test
```

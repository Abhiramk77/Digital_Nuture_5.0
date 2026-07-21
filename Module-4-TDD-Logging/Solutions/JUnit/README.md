# JUnit 5 Unit Testing

## Concept Explanation
Unit testing isolates components and asserts correctness. This exercise utilizes **JUnit 5 (Jupiter)**, the industry-standard framework for writing tests in Java.

Key annotations used:
- `@Test`: Marks a method as a test method.
- `@BeforeEach`: Executes setup logic before each test.
- `@AfterEach`: Executes tear-down/cleanup after each test.
- `@DisplayName`: Sets custom readable descriptions for test cases.
- `@ParameterizedTest` / `@ValueSource`: Executes a test repeatedly with multiple parameters to avoid duplicate test declarations.
- Assertions: `assertEquals`, `assertTrue`, `assertThrows` to validate execution results.

---

## Configuration and Dependencies
Included in the Maven `pom.xml`:
- `junit-jupiter-api` (API for writing tests)
- `junit-jupiter-engine` (Runtime test engine)
- `junit-jupiter-params` (Parameterized test support)

---

## Run Commands
Run unit tests via Maven:
```bash
mvn test
```

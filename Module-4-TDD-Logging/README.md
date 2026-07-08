# Module 4: TDD & Logging Portfolio

This module contains Maven projects demonstrating modern software development testing, mocking, logging, and boilerplate reduction practices.

---

## Sub-Projects

### 1. **JUnit 5 (`Solutions/JUnit/`)**
- **Objective**: Standard unit testing.
- **Key Concepts**: `@Test`, `@BeforeEach`, `@ParameterizedTest`, assertions.

### 2. **Mockito Mocking (`Solutions/Mockito/`)**
- **Objective**: Dependency isolation.
- **Key Concepts**: `@Mock`, `@InjectMocks`, stubbing (`when().thenReturn()`), behavior verification.

### 3. **Logging (`Solutions/Logging/`)**
- **Objective**: Runtime log output.
- **Key Concepts**: SLF4J, Logback, Console/File appenders, level filtering (TRACE, DEBUG, INFO, WARN, ERROR).

### 4. **Lombok (`Solutions/Lombok/`)**
- **Objective**: Boilerplate reduction.
- **Key Concepts**: `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@Builder`, `@ToString`.

---

## Running the Projects
Navigate to any sub-project directory and run:
```bash
mvn test
```
All projects will execute their unit tests and report clean passing statuses.

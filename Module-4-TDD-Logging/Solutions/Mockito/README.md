# Mockito Mock Testing

## Concept Explanation
Mockito is a popular open-source testing framework for Java that allows developers to create mock objects for testing:
1. **Dependency Mocking**: Isolates the class under test by simulating behaviors of its dependencies (e.g. database repositories, REST APIs).
2. **Behavior Verification**: Confirms that methods on mocked dependencies were called with specific arguments a precise number of times.

Annotations used:
- `@ExtendWith(MockitoExtension.class)`: Integrates Mockito with JUnit 5 engine lifecycle.
- `@Mock`: Instantiates a mock instance of the specified interface/class.
- `@InjectMocks`: Creates an instance of the target class and automatically injects all declared mocks into it.

Stubbing methods:
- `when(mock.method()).thenReturn(value)`
- `verify(mock, times(n)).method()`

---

## Configuration and Dependencies
Included in the Maven `pom.xml`:
- `mockito-core`
- `mockito-junit-jupiter`
- `junit-jupiter-api`

---

## Run Commands
Run unit and mock tests via Maven:
```bash
mvn test
```

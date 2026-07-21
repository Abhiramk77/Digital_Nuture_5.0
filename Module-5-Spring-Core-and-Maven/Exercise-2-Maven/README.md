# Exercise 2 - Maven Dependency Management

## Objective
Understand how Maven resolves and manages external dependencies.

## Problem Statement
Use Maven to add the Apache Commons Lang library as a dependency and demonstrate that it is resolved automatically at build time.

## Approach Used
I declared `commons-lang3` as a dependency in `pom.xml`. The `App` class imports `StringUtils` from Commons Lang and uses it to capitalize and format strings. This proves that Maven correctly downloaded and resolved the dependency from the central repository.

## Project Structure
- `pom.xml`
- `App.java`
- `src/main/java/com/example/App.java`
- `src/test/java/com/example/AppTest.java`

## Execution Steps
1. Navigate to this folder.
2. Run `mvn clean test`.
3. Verify the tests pass and dependency is resolved.

## Sample Output
```
Original: maven is resolving dependencies correctly!
Capitalized via Commons-Lang3: Maven is resolving dependencies correctly!
```
- Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

## Learning Outcome
Maven's dependency management allows external libraries to be pulled automatically from Maven Central, eliminating the need to manually download and configure JAR files.

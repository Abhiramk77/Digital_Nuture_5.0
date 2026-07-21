# Exercise 1 - Spring Framework Introduction

## Objective
Configure a Spring Context using Java configuration class and demonstrate Inversion of Control (IoC).

## Problem Statement
Create a greeting service bean, configure it inside a Spring context using Java configuration, retrieve the bean from the application context, and invoke its method.

## Approach Used
I created a configuration class annotated with `@Configuration` and `@ComponentScan`. A `GreetingService` implementation is marked as a `@Service` bean. In the main class, `AnnotationConfigApplicationContext` is used to boot the container, resolve dependencies, and call the service method.

## Project Structure
- `pom.xml`
- `AppConfig.java`
- `GreetingService.java`
- `Main.java`
- `SpringFrameworkTest.java`

## Execution Steps
1. Navigate to this folder.
2. Run `mvn clean test`.
3. Verify the tests pass.

## Sample Output
- Greeting output: `Welcome to Spring Framework with Java Config! Inversion of Control is active.`
- Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

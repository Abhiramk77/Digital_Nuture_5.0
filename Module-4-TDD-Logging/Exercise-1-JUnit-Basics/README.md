# Exercise 1 - JUnit Basics

## Objective
Practice simple unit testing with JUnit 5.

## Problem Statement
Create a calculator class and test basic math operations, including negative values, zero, and division by zero.

## Approach Used
I created a small Calculator class with methods for addition, subtraction, multiplication, and division. Then I wrote unit tests for normal input and edge cases.

## Project Structure
- Calculator.java
- CalculatorTest.java

## Execution Steps
1. Go to this folder.
2. Run `mvn test`.
3. Check the results in the console.

## Sample Output
- Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

## Learning Outcome
Unit tests help confirm that code works for normal values and error cases.

## Observations
- Initially one test failed because division by zero was not handled.
- I added an exception check and the test passed.
- Re-running the tests helped me understand the value of edge cases.

## Things I Learned
- JUnit is useful for checking small pieces of code.
- It is better to test both normal and special cases.
- Exception tests are important when the method can fail.

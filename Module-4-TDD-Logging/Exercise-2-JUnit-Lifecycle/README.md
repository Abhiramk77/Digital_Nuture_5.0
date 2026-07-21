# Exercise 2 - JUnit Lifecycle

## Objective
Practice JUnit lifecycle annotations with a simple student service example.

## Problem Statement
Create tests that show how setup and cleanup methods work before and after each test run.

## Approach Used
I used @BeforeEach and @AfterEach to create fresh objects for every test. I also used @BeforeAll and @AfterAll to show the start and end of the test class.

## Project Structure
- StudentService.java
- StudentServiceTest.java

## Execution Steps
1. Go to this folder.
2. Run `mvn test`.
3. Observe the lifecycle methods in the output.

## Sample Output
- Student is added successfully
- Student count is updated
- Empty names are rejected

## Learning Outcome
Lifecycle methods help keep tests simple and repeatable.

## Observations
- I noticed that each test should start from a clean state.
- The setup method made the test code easier to read.
- The cleanup method helped avoid data from one test affecting another.

## Things I Learned
- @BeforeEach is useful for fresh objects.
- @AfterEach helps remove leftovers.
- @BeforeAll and @AfterAll are useful for shared setup and cleanup.

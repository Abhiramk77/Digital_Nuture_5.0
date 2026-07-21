# Exercise 3 - Mockito

## Objective
Use Mockito to test service logic without a real repository implementation.

## Problem Statement
Create a user service and test it using a mock repository for valid, invalid, and null input.

## Approach Used
I created a simple UserService that depends on a repository. Then I used Mockito to mock the repository and verify that the service called it in the expected way.

## Project Structure
- UserRepository.java
- UserService.java
- UserServiceTest.java

## Execution Steps
1. Go to this folder.
2. Run `mvn test`.
3. Review the test results.

## Sample Output
- New user is registered
- Existing email is rejected
- Empty input is rejected

## Learning Outcome
Mockito helps isolate business logic and verify repository interactions.

## Observations
- I learned that mocks are useful when testing without a real database.
- The verify method helped me check whether the repository was called.
- The tests stayed focused on the service logic.

## Things I Learned
- when() is helpful for setting return values on a mock.
- verify() is useful for checking interactions.
- Mocking keeps tests small and easier to understand.

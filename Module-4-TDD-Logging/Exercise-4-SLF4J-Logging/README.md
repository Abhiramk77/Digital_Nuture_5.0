# Exercise 4 - SLF4J Logging

## Objective
Use SLF4J and Logback to print log messages from a small Java program.

## Problem Statement
Create a simple logging example that shows INFO, DEBUG, WARN, and ERROR messages while handling one exception.

## Approach Used
I created a LoggingDemo class and configured Logback to print the messages to the console. I also added one exception case to show how logging can help during debugging.

## Project Structure
- LoggingDemo.java
- logback.xml

## Execution Steps
1. Go to this folder.
2. Run the main class.
3. Check the console output.

## Sample Output
- INFO message is printed
- DEBUG message is printed
- WARN message is printed
- ERROR message is printed with exception details

## Learning Outcome
Logging helps follow the flow of a program and makes debugging easier.

## Observations
- I learned that different log levels are useful for different situations.
- The Logback configuration controls the output style.
- Logging is especially helpful when an error occurs.

## Things I Learned
- INFO is good for normal flow.
- DEBUG is helpful while testing.
- ERROR is useful when something goes wrong.

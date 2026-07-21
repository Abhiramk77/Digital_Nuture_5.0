# PL/SQL Exception Handling

## Concept Explanation
An exception is a runtime error condition that interrupts normal program execution. PL/SQL provides robust exception-handling capabilities:
1. **System-defined Exceptions**: Predefined by Oracle Database (e.g. `NO_DATA_FOUND`, `TOO_MANY_ROWS`, `ZERO_DIVIDE`).
2. **User-defined Exceptions**: Declared in the `DECLARE` section by the programmer and explicitly raised using the `RAISE` statement.

This exercise shows a nested block catching a `NO_DATA_FOUND` query failure, followed by a check that throws and handles a custom `e_low_salary` exception if an employee's salary is under $\$55,000$.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Exceptions/Exceptions.sql;
```

---

## Expected Output
```text
--- Exception Handling Demo ---
System Exception Caught: Employee 999 not found.
Checking employee Sarah salary: $50000
Custom Exception Caught: salary of $50000 is below the minimum FSE threshold ($55,000).

PL/SQL procedure successfully completed.
```

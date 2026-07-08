# PL/SQL FOR Loop

## Concept Explanation
The `FOR` loop is a control structure used to execute a block of code a set number of times. PL/SQL supports two forms:
1. **Numeric FOR Loop**: Iterates through a specified range of integers.
2. **Cursor FOR Loop**: Automatically opens a cursor, fetches each row, and closes the cursor after completion.

This exercise shows both: iterating from 1 to 5, and querying records from the database using a inline query cursor loop.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/FOR_Loop/FOR_Loop.sql;
```

---

## Expected Output
```text
--- Numeric FOR Loop (1 to 5) ---
Iteration Index: 1
Iteration Index: 2
Iteration Index: 3
Iteration Index: 4
Iteration Index: 5

--- Cursor FOR Loop (Querying Engineering Department) ---
Engineer: Abhi | Salary: $85000
Engineer: Jane | Salary: $75000

PL/SQL procedure successfully completed.
```

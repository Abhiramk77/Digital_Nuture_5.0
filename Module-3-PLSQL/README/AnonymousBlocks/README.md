# PL/SQL Anonymous Blocks

## Concept Explanation
An anonymous block in PL/SQL is a block of code that is not compiled into the database schema (unlike stored procedures or functions). It has three distinct sections:
1. **DECLARE**: Variables, constants, and cursors definitions (optional).
2. **BEGIN**: Executable DML queries and procedural control logic (mandatory).
3. **EXCEPTION**: Logic to handle runtime errors (optional).

This exercise runs a simple select query to count the total rows in the `FSE_Employees` table and handles any SQL runtime errors safely.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/AnonymousBlocks/AnonymousBlocks.sql;
```

---

## Expected Output
```text
--- Anonymous Block Output ---
Successfully queried employee database.
Total Employee Count: 5

PL/SQL procedure successfully completed.
```

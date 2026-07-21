# PL/SQL Stored Procedures

## Concept Explanation
A stored procedure is a schema object that consists of a set of SQL statements and PL/SQL constructs grouped together to perform a specific task. Procedures are compiled and stored in the database server, reducing network traffic and increasing application security and performance.
Key Aspects:
1. **Parameters**: Supports `IN` (input), `OUT` (output), and `IN OUT` (both input and output) parameters.
2. **Execution**: Can be executed using `CALL procedure_name` or inside another PL/SQL block.

This exercise compiles a stored procedure `adjust_salary` that applies a specified increment to an employee's salary and prints a transaction log.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/StoredProcedures/StoredProcedures.sql;
```

---

## Expected Output
```text
Procedure ADJUST_SALARY compiled.

--- Testing Stored Procedure adjust_salary ---
Procedure Execution Log:
Employee ID   : 102
Old Salary    : $60000
Incremented By: $5000
New Salary    : $65000

PL/SQL procedure successfully completed.
```

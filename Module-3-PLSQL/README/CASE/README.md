# PL/SQL CASE Expression

## Concept Explanation
The `CASE` statement/expression in PL/SQL allows choosing a value based on multiple conditions. It is cleaner and more readable than deeply nested `IF-THEN-ELSIF` blocks.
There are two forms:
1. **Simple CASE**: Compares an expression value to a set of values.
2. **Searched CASE**: Evaluates multiple boolean conditions sequentially.

This exercise utilizes a simple `CASE` expression to map department location fields to regional administrative designations.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/CASE/CASE.sql;
```

---

## Expected Output
```text
Department : Engineering
Location   : San Francisco
Region     : West Coast Region

PL/SQL procedure successfully completed.
```

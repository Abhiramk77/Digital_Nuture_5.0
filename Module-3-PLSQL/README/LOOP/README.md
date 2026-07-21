# PL/SQL Basic LOOP

## Concept Explanation
The basic `LOOP` statement in PL/SQL creates an unconditional (infinite) loop that encloses a sequence of statements. The loop must contain an `EXIT` or `EXIT WHEN` statement to pass control out of the loop block and prevent infinite cycles.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/LOOP/LOOP.sql;
```

---

## Expected Output
```text
--- Basic LOOP Execution ---
Counter value: 1
Counter value: 2
Counter value: 3
Counter value: 4

PL/SQL procedure successfully completed.
```

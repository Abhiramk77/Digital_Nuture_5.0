# PL/SQL IF ELSE

## Concept Explanation
PL/SQL supports conditional branching via:
- `IF condition THEN ...`
- `ELSIF condition THEN ...`
- `ELSE ...`
- `END IF;`

Note that `ELSIF` is spelled without the second 'E'.

This exercise extracts an employee's salary and classifies their income status based on defined ranges ($\ge 80,000$ High, $\ge 60,000$ Medium, and Low otherwise).

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/IF_ELSE/IF_ELSE.sql;
```

---

## Expected Output
```text
Employee   : Jane
Salary     : $75000
Band Rank  : Medium Salary

PL/SQL procedure successfully completed.
```

# PL/SQL Cursors

## Concept Explanation
A cursor is a pointer to a private SQL memory area (the context area) that Oracle sets up to process an SQL statement.
PL/SQL supports:
1. **Implicit Cursors**: Automatically defined by Oracle for all SQL DML statements.
2. **Explicit Cursors**: Defined by the developer for queries returning multiple rows.
   - **`OPEN`**: Allocates memory and executes the select query.
   - **`FETCH`**: Retrieves one row at a time.
   - **`CLOSE`**: Releases the cursor memory.
   - **Attributes**: `%FOUND`, `%NOTFOUND`, `%ISOPEN`, `%ROWCOUNT`.

This exercise implements an explicit cursor iterating over employees earning above $\$70,000$, outputting their details and tracking the row count.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Cursors/Cursors.sql;
```

---

## Expected Output
```text
--- High Earners (> $70,000) ---
ID: 101 | Name: Abhi | Salary: $85000
ID: 103 | Name: Jane | Salary: $75000
ID: 104 | Name: Michael | Salary: $95000
Total Rows Processed: 3

PL/SQL procedure successfully completed.
```

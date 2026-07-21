# PL/SQL Database Triggers

## Concept Explanation
A database trigger is a compiled PL/SQL block stored in the database and executed (fired) automatically in response to a specific database event (like `INSERT`, `UPDATE`, or `DELETE` on a table).
Key Aspects:
1. **Level**:
   - **Row-level trigger**: Fires once for each row affected by the SQL statement (uses `FOR EACH ROW` and `:OLD`/`:NEW` bind variables).
   - **Statement-level trigger**: Fires once for the entire SQL statement.
2. **Timing**: `BEFORE`, `AFTER`, or `INSTEAD OF` the triggering event.

This exercise creates an audit table `FSE_Salary_Audit` and a row-level `BEFORE UPDATE` trigger `trg_salary_audit` on the `FSE_Employees` table. Whenever an employee's salary is modified, the trigger automatically captures the historic salary, new salary, change timestamp, and database user, writing them to the audit log.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Triggers/Triggers.sql;
```

---

## Expected Output
```text
Table FSE_SALARY_AUDIT created.
Trigger TRG_SALARY_AUDIT compiled.

--- Testing Trigger trg_salary_audit ---

PL/SQL procedure successfully completed.

  AUDIT_ID EMPLOYEE_ID OLD_SALARY NEW_SALARY CHANGE_DA CHANGED_BY
---------- ----------- ---------- ---------- --------- ----------
         1         101      85000      90000 08-JUL-26 SYSTEM
```

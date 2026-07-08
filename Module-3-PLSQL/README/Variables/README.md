# PL/SQL Variables

## Concept Explanation
Variables and Constants in PL/SQL are used to temporarily hold data during procedural block executions:
1. **Scalar Variables**: Hold single values of primitive types.
2. **%TYPE Attribute**: Binds the data type of a variable directly to the database table column schema, ensuring robust type safety if table columns are altered.
3. **CONSTANT Keyword**: Enforces read-only fields initialized during declaration.

This exercise selects an employee's salary, applies a 5% constant tax rate deduction, and outputs the calculated net pay.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Variables/Variables.sql;
```

---

## Expected Output
```text
Employee ID   : 101
Employee Name : Abhi
Base Salary   : $  85,000.00
Tax Rate      : 5%
Tax Deducted  : $   4,250.00
Net Pay       : $  80,750.00

PL/SQL procedure successfully completed.
```

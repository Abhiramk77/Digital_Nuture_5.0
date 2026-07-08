# PL/SQL Functions

## Concept Explanation
A PL/SQL function is a named block of code that is compiled and stored in the database schema. Unlike procedures, a function **must return a single value** to the caller.
Key Aspects:
1. **Return Type**: Declared in the function header using `RETURN data_type`.
2. **Usage**: Can be used within standard SQL queries (e.g. `SELECT get_annual_salary(emp_id) FROM ...`) or assigned directly to variables inside PL/SQL blocks.

This exercise compiles a function `get_annual_salary` that fetches the monthly salary of an employee, performs a multiplication, and returns the yearly value.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Functions/Functions.sql;
```

---

## Expected Output
```text
Function GET_ANNUAL_SALARY compiled.

--- Testing Function get_annual_salary ---
Annual salary for Employee 101: $  1,020,000.00

Querying via SQL Select Statement:

EMPLOYEE_ID FIRST_NAME           ANNUAL_SALARY
----------- -------------------- -------------
        101 Abhi                       1020000
        102 John                        780000
        103 Jane                        900000
        104 Michael                    1140000
        105 Sarah                       600000
```

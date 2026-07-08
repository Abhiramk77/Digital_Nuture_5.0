# PL/SQL Packages

## Concept Explanation
A PL/SQL package is a schema object that groups logically related PL/SQL types, variables, constants, subprograms, cursors, and exceptions. A package always has two parts:
1. **Package Specification**: The public interface declaring visible constants, variables, procedures, and functions.
2. **Package Body**: The private implementation containing actual subprogram queries and internal helper procedures/functions.

This exercise defines a package `emp_pkg` that encapsulates commission calculation logic and exports a formatted employee detail reporting function.

---

## SQL Execution
Run the following script using SQL*Plus or Oracle SQL Developer:
```sql
@Scripts/Packages/Packages.sql;
```

---

## Expected Output
```text
Package EMP_PKG compiled.
Package Body EMP_PKG compiled.

--- Testing Package emp_pkg ---
Package Execution:
Employee ID   : 101
Full Name     : Abhi Ram
Base Salary   : $85000
Commission    : $8500

PL/SQL procedure successfully completed.
```

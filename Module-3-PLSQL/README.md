# Module 3: PL/SQL Programming Portfolio

This module contains Oracle PL/SQL programming exercises covering basic procedural language concepts, conditional blocks, exceptions, cursors, stored procedures, functions, packages, and database triggers.

---

## Folder Organization
- **`Scripts/`**: Contains the source SQL and PL/SQL code files.
  - Run `schema_setup.sql` first to initialize tables `FSE_Employees` and `FSE_Departments`.
- **`Output/`**: Displays query results and server execution outputs.
- **`README/`**: Contains specific study readmes detailing each PL/SQL construct.

---

## Exercise List

1. **Introduction**: Basic environment setup (`SET SERVEROUTPUT ON`) and greeting block.
2. **Anonymous Blocks**: DECLARE-BEGIN-EXCEPTION-END structure querying employee count.
3. **Variables**: Declaring scalars, constants, and database bindings (`%TYPE`).
4. **IF ELSE**: Grade salary brackets using `IF-ELSIF-ELSE`.
5. **CASE**: Map department locations using `CASE` expression.
6. **FOR Loop**: Numeric loops and implicit query Cursor loops.
7. **WHILE Loop**: Calculation (factorial) with condition check.
8. **LOOP**: Basic unconditional loop terminated by `EXIT WHEN`.
9. **Exceptions**: Handling `NO_DATA_FOUND` and throwing custom exceptions.
10. **Cursors**: Explicit declaration, fetch iterations, and attributes (`%NOTFOUND`, `%ROWCOUNT`).
11. **Stored Procedures**: Compiling stored updates with parameterized transaction logs.
12. **Functions**: Creating returning subprograms used in standard SQL select queries.
13. **Packages**: Modulating variables, functions, and procedures inside a specification/body wrapper.
14. **Triggers**: Implementing DML row-level audits into separate audit tables automatically.

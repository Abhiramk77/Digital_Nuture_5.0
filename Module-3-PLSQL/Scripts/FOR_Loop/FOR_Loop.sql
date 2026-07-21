SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Numeric FOR Loop (1 to 5) ---');
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Iteration Index: ' || i);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE(CHR(10) || '--- Cursor FOR Loop (Querying Engineering Department) ---');
    FOR emp_rec IN (SELECT first_name, salary FROM FSE_Employees WHERE department_id = 20) LOOP
        DBMS_OUTPUT.PUT_LINE('Engineer: ' || emp_rec.first_name || ' | Salary: $' || emp_rec.salary);
    END LOOP;
END;
/

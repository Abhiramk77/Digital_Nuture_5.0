SET SERVEROUTPUT ON;

CREATE TABLE employees (
    employee_id NUMBER,
    employee_name VARCHAR2(50)
);

INSERT INTO employees VALUES (101, 'Rahul');
INSERT INTO employees VALUES (102, 'Priya');
INSERT INTO employees VALUES (103, 'Kiran');

COMMIT;

DECLARE
    CURSOR emp_cursor IS
        SELECT employee_id, employee_name
        FROM employees;

    v_id employees.employee_id%TYPE;
    v_name employees.employee_name%TYPE;
BEGIN
    OPEN emp_cursor;

    LOOP
        FETCH emp_cursor INTO v_id, v_name;
        EXIT WHEN emp_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_id || ' - ' || v_name);
    END LOOP;

    CLOSE emp_cursor;
END;
/

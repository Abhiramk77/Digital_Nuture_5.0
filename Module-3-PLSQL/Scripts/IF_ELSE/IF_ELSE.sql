-- PL/SQL IF ELSE Conditional Exercise
-- Categories salaries into bands (High, Medium, Low) using IF-ELSIF-ELSE.

SET SERVEROUTPUT ON;

DECLARE
    v_emp_id       FSE_Employees.employee_id%TYPE := 103;
    v_first_name   FSE_Employees.first_name%TYPE;
    v_salary       FSE_Employees.salary%TYPE;
    v_salary_band  VARCHAR2(20);
BEGIN
    -- Query salary
    SELECT first_name, salary
    INTO v_first_name, v_salary
    FROM FSE_Employees
    WHERE employee_id = v_emp_id;

    -- Conditional logic
    IF v_salary >= 80000 THEN
        v_salary_band := 'High Salary';
    ELSIF v_salary >= 60000 THEN
        v_salary_band := 'Medium Salary';
    ELSE
        v_salary_band := 'Low Salary';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee   : ' || v_first_name);
    DBMS_OUTPUT.PUT_LINE('Salary     : $' || v_salary);
    DBMS_OUTPUT.PUT_LINE('Band Rank  : ' || v_salary_band);
END;
/

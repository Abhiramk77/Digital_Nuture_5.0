-- PL/SQL Exception Handling Exercise
-- Demonstrates system-defined exception (NO_DATA_FOUND) and user-defined custom exception.

SET SERVEROUTPUT ON;

DECLARE
    -- Define user-defined exception
    e_low_salary   EXCEPTION;
    
    v_emp_id       FSE_Employees.employee_id%TYPE := 105; -- Sarah Davis (Salary: 50,000)
    v_first_name   FSE_Employees.first_name%TYPE;
    v_salary       FSE_Employees.salary%TYPE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Exception Handling Demo ---');

    -- Scenario 1: Select non-existent employee to trigger NO_DATA_FOUND
    BEGIN
        SELECT first_name, salary INTO v_first_name, v_salary
        FROM FSE_Employees
        WHERE employee_id = 999; -- Does not exist
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('System Exception Caught: Employee 999 not found.');
    END;

    -- Scenario 2: Evaluate salary and raise custom exception if below threshold
    SELECT first_name, salary INTO v_first_name, v_salary
    FROM FSE_Employees
    WHERE employee_id = v_emp_id;

    DBMS_OUTPUT.PUT_LINE('Checking employee ' || v_first_name || ' salary: $' || v_salary);
    
    IF v_salary < 55000 THEN
        RAISE e_low_salary; // Raise custom exception
    END IF;

EXCEPTION
    WHEN e_low_salary THEN
        DBMS_OUTPUT.PUT_LINE('Custom Exception Caught: salary of $' || v_salary || ' is below the minimum FSE threshold ($55,000).');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('General Exception Caught: ' || SQLERRM);
END;
/

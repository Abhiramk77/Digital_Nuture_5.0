SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE adjust_salary (
    p_emp_id IN NUMBER,
    p_increment IN NUMBER
) AS
    v_old_salary NUMBER;
    v_new_salary NUMBER;
BEGIN

    SELECT salary INTO v_old_salary
    FROM FSE_Employees
    WHERE employee_id = p_emp_id;

    UPDATE FSE_Employees
    SET salary = salary + p_increment
    WHERE employee_id = p_emp_id;

    SELECT salary INTO v_new_salary
    FROM FSE_Employees
    WHERE employee_id = p_emp_id;

    DBMS_OUTPUT.PUT_LINE('Procedure Execution Log:');
    DBMS_OUTPUT.PUT_LINE('Employee ID   : ' || p_emp_id);
    DBMS_OUTPUT.PUT_LINE('Old Salary    : $' || v_old_salary);
    DBMS_OUTPUT.PUT_LINE('Incremented By: $' || p_increment);
    DBMS_OUTPUT.PUT_LINE('New Salary    : $' || v_new_salary);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee with ID ' || p_emp_id || ' does not exist.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Database error occurred: ' || SQLERRM);
END adjust_salary;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Testing Stored Procedure adjust_salary ---');
    adjust_salary(102, 5000);
    COMMIT;
END;
/

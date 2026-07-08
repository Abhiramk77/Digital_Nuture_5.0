-- PL/SQL Explicit Cursors Exercise
-- Declares, opens, fetches, and closes an explicit cursor to print high earners.

SET SERVEROUTPUT ON;

DECLARE
    -- Explicit cursor definition
    CURSOR c_high_earners IS
        SELECT employee_id, first_name, salary 
        FROM FSE_Employees 
        WHERE salary > 70000;
        
    -- Variables to hold fetched data
    v_emp_id       FSE_Employees.employee_id%TYPE;
    v_first_name   FSE_Employees.first_name%TYPE;
    v_salary       FSE_Employees.salary%TYPE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- High Earners (> $70,000) ---');
    
    -- Open cursor
    OPEN c_high_earners;
    
    LOOP
        -- Fetch record
        FETCH c_high_earners INTO v_emp_id, v_first_name, v_salary;
        
        -- Exit when no more records are found
        EXIT WHEN c_high_earners%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('ID: ' || v_emp_id || ' | Name: ' || v_first_name || ' | Salary: $' || v_salary);
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('Total Rows Processed: ' || c_high_earners%ROWCOUNT);
    
    -- Close cursor
    CLOSE c_high_earners;
END;
/

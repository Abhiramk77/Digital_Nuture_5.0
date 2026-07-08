-- PL/SQL Variables Exercise
-- Shows standard scalar variables, %TYPE mapping, and constant values.

SET SERVEROUTPUT ON;

DECLARE
    -- Constant declaration
    c_tax_rate     CONSTANT NUMBER(3,2) := 0.05;
    
    -- Using %TYPE to dynamically bind variable types to DB columns
    v_emp_id       FSE_Employees.employee_id%TYPE := 101;
    v_first_name   FSE_Employees.first_name%TYPE;
    v_salary       FSE_Employees.salary%TYPE;
    
    -- Calculated values
    v_tax_amount   NUMBER(10,2);
    v_net_salary   NUMBER(10,2);
BEGIN
    -- Query values from database
    SELECT first_name, salary 
    INTO v_first_name, v_salary
    FROM FSE_Employees
    WHERE employee_id = v_emp_id;

    -- Variable processing
    v_tax_amount := v_salary * c_tax_rate;
    v_net_salary := v_salary - v_tax_amount;

    -- Output details
    DBMS_OUTPUT.PUT_LINE('Employee ID   : ' || v_emp_id);
    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || v_first_name);
    DBMS_OUTPUT.PUT_LINE('Base Salary   : $' || TO_CHAR(v_salary, '999,999.99'));
    DBMS_OUTPUT.PUT_LINE('Tax Rate      : ' || (c_tax_rate * 100) || '%');
    DBMS_OUTPUT.PUT_LINE('Tax Deducted  : $' || TO_CHAR(v_tax_amount, '999,999.99'));
    DBMS_OUTPUT.PUT_LINE('Net Pay       : $' || TO_CHAR(v_net_salary, '999,999.99'));
END;
/

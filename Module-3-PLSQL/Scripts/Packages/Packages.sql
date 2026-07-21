SET SERVEROUTPUT ON;

CREATE OR REPLACE PACKAGE emp_pkg AS

    c_commission_pct CONSTANT NUMBER := 0.10;

    FUNCTION calculate_commission(p_salary IN NUMBER) RETURN NUMBER;

    PROCEDURE print_employee_details(p_emp_id IN NUMBER);
END emp_pkg;
/

CREATE OR REPLACE PACKAGE BODY emp_pkg AS

    FUNCTION calculate_commission(p_salary IN NUMBER) RETURN NUMBER IS
    BEGIN
        RETURN p_salary * c_commission_pct;
    END calculate_commission;

    PROCEDURE print_employee_details(p_emp_id IN NUMBER) IS
        v_first_name FSE_Employees.first_name%TYPE;
        v_last_name  FSE_Employees.last_name%TYPE;
        v_salary     FSE_Employees.salary%TYPE;
        v_comm       NUMBER;
    BEGIN
        SELECT first_name, last_name, salary
        INTO v_first_name, v_last_name, v_salary
        FROM FSE_Employees
        WHERE employee_id = p_emp_id;

        v_comm := calculate_commission(v_salary);

        DBMS_OUTPUT.PUT_LINE('Package Execution:');
        DBMS_OUTPUT.PUT_LINE('Employee ID   : ' || p_emp_id);
        DBMS_OUTPUT.PUT_LINE('Full Name     : ' || v_first_name || ' ' || v_last_name);
        DBMS_OUTPUT.PUT_LINE('Base Salary   : $' || v_salary);
        DBMS_OUTPUT.PUT_LINE('Commission    : $' || v_comm);
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Error: Employee ' || p_emp_id || ' not found.');
    END print_employee_details;

END emp_pkg;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Testing Package emp_pkg ---');
    emp_pkg.print_employee_details(101);
END;
/

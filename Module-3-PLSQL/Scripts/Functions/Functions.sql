SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION get_annual_salary (
    p_emp_id IN NUMBER
) RETURN NUMBER IS
    v_monthly_salary NUMBER;
    v_annual_salary  NUMBER;
BEGIN

    SELECT salary INTO v_monthly_salary
    FROM FSE_Employees
    WHERE employee_id = p_emp_id;

    v_annual_salary := v_monthly_salary * 12;

    RETURN v_annual_salary;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 0;
    WHEN OTHERS THEN
        RETURN -1;
END get_annual_salary;
/

DECLARE
    v_ann_sal NUMBER;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Testing Function get_annual_salary ---');
    v_ann_sal := get_annual_salary(101);
    DBMS_OUTPUT.PUT_LINE('Annual salary for Employee 101: $' || TO_CHAR(v_ann_sal, '999,999,999.00'));

    DBMS_OUTPUT.PUT_LINE(CHR(10) || 'Querying via SQL Select Statement:');
END;
/

SELECT employee_id, first_name, get_annual_salary(employee_id) AS annual_salary
FROM FSE_Employees;

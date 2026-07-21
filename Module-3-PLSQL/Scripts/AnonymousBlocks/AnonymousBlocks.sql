SET SERVEROUTPUT ON;

DECLARE
    v_emp_count NUMBER;
BEGIN

    SELECT COUNT(*) INTO v_emp_count FROM FSE_Employees;

    DBMS_OUTPUT.PUT_LINE('--- Anonymous Block Output ---');
    DBMS_OUTPUT.PUT_LINE('Successfully queried employee database.');
    DBMS_OUTPUT.PUT_LINE('Total Employee Count: ' || v_emp_count);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An unexpected database error occurred: ' || SQLERRM);
END;
/

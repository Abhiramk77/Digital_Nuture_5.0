SET SERVEROUTPUT ON;

DECLARE
    numerator NUMBER := 100;
    denominator NUMBER := 0;
    result NUMBER;
BEGIN
    result := numerator / denominator;

    DBMS_OUTPUT.PUT_LINE(result);

EXCEPTION
    WHEN ZERO_DIVIDE THEN
        DBMS_OUTPUT.PUT_LINE('Cannot divide by zero.');
END;
/

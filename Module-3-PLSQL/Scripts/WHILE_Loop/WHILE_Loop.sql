-- PL/SQL WHILE Loop Exercise
-- Uses a WHILE loop to perform a calculation (factorial of 5).

SET SERVEROUTPUT ON;

DECLARE
    v_counter NUMBER := 5;
    v_result  NUMBER := 1;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Calculating 5! using WHILE Loop...');
    
    WHILE v_counter > 0 LOOP
        v_result := v_result * v_counter;
        v_counter := v_counter - 1;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Result (5!): ' || v_result);
END;
/

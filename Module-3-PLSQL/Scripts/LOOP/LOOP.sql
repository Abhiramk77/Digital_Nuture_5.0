-- PL/SQL Basic LOOP Exercise
-- Demonstrates an open loop terminated by the EXIT WHEN statement.

SET SERVEROUTPUT ON;

DECLARE
    v_counter NUMBER := 1;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Basic LOOP Execution ---');
    LOOP
        DBMS_OUTPUT.PUT_LINE('Counter value: ' || v_counter);
        v_counter := v_counter + 1;
        
        -- Loop termination condition
        EXIT WHEN v_counter > 4;
    END LOOP;
END;
/

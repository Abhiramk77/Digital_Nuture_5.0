SET SERVEROUTPUT ON;

DECLARE
    v_counter NUMBER := 1;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Basic LOOP Execution ---');
    LOOP
        DBMS_OUTPUT.PUT_LINE('Counter value: ' || v_counter);
        v_counter := v_counter + 1;

        EXIT WHEN v_counter > 4;
    END LOOP;
END;
/

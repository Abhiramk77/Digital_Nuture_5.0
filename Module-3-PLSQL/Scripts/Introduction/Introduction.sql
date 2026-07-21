SET SERVEROUTPUT ON;

DECLARE
    v_message VARCHAR2(100) := 'Welcome to PL/SQL Programming - Digital Nurture 5.0';
BEGIN
    DBMS_OUTPUT.PUT_LINE(v_message);
END;
/

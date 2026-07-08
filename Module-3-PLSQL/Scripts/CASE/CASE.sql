-- PL/SQL CASE Expression Exercise
-- Translates location abbreviations or names to regional descriptions.

SET SERVEROUTPUT ON;

DECLARE
    v_dept_id      FSE_Departments.department_id%TYPE := 20;
    v_dept_name    FSE_Departments.department_name%TYPE;
    v_location     FSE_Departments.location%TYPE;
    v_region       VARCHAR2(50);
BEGIN
    -- Query department info
    SELECT department_name, location
    INTO v_dept_name, v_location
    FROM FSE_Departments
    WHERE department_id = v_dept_id;

    -- CASE statement
    v_region := CASE v_location
        WHEN 'New York'      THEN 'East Coast Region'
        WHEN 'San Francisco' THEN 'West Coast Region'
        WHEN 'Chicago'       THEN 'Midwest Region'
        WHEN 'Austin'        THEN 'Southern Region'
        ELSE 'Unknown Region'
    END;

    DBMS_OUTPUT.PUT_LINE('Department : ' || v_dept_name);
    DBMS_OUTPUT.PUT_LINE('Location   : ' || v_location);
    DBMS_OUTPUT.PUT_LINE('Region     : ' || v_region);
END;
/

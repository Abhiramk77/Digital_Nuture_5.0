SET SERVEROUTPUT ON;

DECLARE
    student_name VARCHAR2(50);
    student_id NUMBER;
BEGIN
    student_name := 'B Teja Reddy';
    student_id := 2027001;

    DBMS_OUTPUT.PUT_LINE('Student Name : ' || student_name);
    DBMS_OUTPUT.PUT_LINE('Student ID   : ' || student_id);
END;
/

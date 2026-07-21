CREATE OR REPLACE PACKAGE student_package AS
    PROCEDURE display_student;
END student_package;
/

CREATE OR REPLACE PACKAGE BODY student_package AS

    PROCEDURE display_student IS
    BEGIN
        DBMS_OUTPUT.PUT_LINE(
            'Student Package Executed'
        );
    END;

END student_package;
/

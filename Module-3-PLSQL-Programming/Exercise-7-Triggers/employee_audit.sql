CREATE TABLE employee_audit (
    audit_message VARCHAR2(100),
    created_on DATE
);

CREATE OR REPLACE TRIGGER employee_audit_trigger
AFTER INSERT
ON employees
FOR EACH ROW
BEGIN
    INSERT INTO employee_audit
    VALUES (
        'Employee added',
        SYSDATE
    );
END;
/

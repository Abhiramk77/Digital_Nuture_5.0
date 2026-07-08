-- PL/SQL Triggers Exercise
-- Creates an audit table and a BEFORE UPDATE row-level trigger to audit salary adjustments.

SET SERVEROUTPUT ON;

-- Create Audit Log table
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE FSE_Salary_Audit';
EXCEPTION
    WHEN OTHERS THEN NULL;
END;
/

CREATE TABLE FSE_Salary_Audit (
    audit_id      NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    employee_id   NUMBER,
    old_salary    NUMBER(10,2),
    new_salary    NUMBER(10,2),
    change_date   DATE,
    changed_by    VARCHAR2(50)
);

-- Create Trigger
CREATE OR REPLACE TRIGGER trg_salary_audit
BEFORE UPDATE OF salary ON FSE_Employees
FOR EACH ROW
BEGIN
    -- Insert old and new values into audit log table
    INSERT INTO FSE_Salary_Audit (
        employee_id, old_salary, new_salary, change_date, changed_by
    ) VALUES (
        :OLD.employee_id, :OLD.salary, :NEW.salary, SYSDATE, USER
    );
END;
/

-- Test the trigger by updating salary
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Testing Trigger trg_salary_audit ---');
    
    -- This update should fire the trigger
    UPDATE FSE_Employees
    SET salary = 90000
    WHERE employee_id = 101;
    
    COMMIT;
END;
/

-- Query the audit log table to verify the trigger worked
SELECT * FROM FSE_Salary_Audit;

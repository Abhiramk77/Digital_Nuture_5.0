-- Schema Setup Script for PL/SQL Exercises
-- Creates FSE_Departments and FSE_Employees tables with initial data.

-- Drop existing tables (if any) to reset environment
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE FSE_Employees';
EXCEPTION
    WHEN OTHERS THEN NULL;
END;
/

BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE FSE_Departments';
EXCEPTION
    WHEN OTHERS THEN NULL;
END;
/

-- Create FSE_Departments table
CREATE TABLE FSE_Departments (
    department_id   NUMBER PRIMARY KEY,
    department_name VARCHAR2(50) NOT NULL,
    location        VARCHAR2(50)
);

-- Create FSE_Employees table
CREATE TABLE FSE_Employees (
    employee_id     NUMBER PRIMARY KEY,
    first_name      VARCHAR2(50),
    last_name       VARCHAR2(50) NOT NULL,
    email           VARCHAR2(100),
    salary          NUMBER(10,2),
    hire_date       DATE,
    department_id   NUMBER,
    CONSTRAINT fk_dept FOREIGN KEY (department_id) REFERENCES FSE_Departments(department_id)
);

-- Insert sample departments
INSERT INTO FSE_Departments VALUES (10, 'Administration', 'New York');
INSERT INTO FSE_Departments VALUES (20, 'Engineering', 'San Francisco');
INSERT INTO FSE_Departments VALUES (30, 'Sales', 'Chicago');
INSERT INTO FSE_Departments VALUES (40, 'Human Resources', 'Austin');

-- Insert sample employees
INSERT INTO FSE_Employees VALUES (101, 'Abhi', 'Ram', 'abhiram@fse.com', 85000, TO_DATE('2024-01-15', 'YYYY-MM-DD'), 20);
INSERT INTO FSE_Employees VALUES (102, 'John', 'Doe', 'john.doe@fse.com', 60000, TO_DATE('2024-02-10', 'YYYY-MM-DD'), 10);
INSERT INTO FSE_Employees VALUES (103, 'Jane', 'Smith', 'jane.smith@fse.com', 75000, TO_DATE('2024-03-01', 'YYYY-MM-DD'), 20);
INSERT INTO FSE_Employees VALUES (104, 'Michael', 'Brown', 'michael.b@fse.com', 95000, TO_DATE('2023-11-20', 'YYYY-MM-DD'), 30);
INSERT INTO FSE_Employees VALUES (105, 'Sarah', 'Davis', 'sarah.d@fse.com', 50000, TO_DATE('2024-05-15', 'YYYY-MM-DD'), 40);

COMMIT;

SELECT 'Schema Setup Complete. Total departments: ' || COUNT(*) FROM FSE_Departments;
SELECT 'Total employees: ' || COUNT(*) FROM FSE_Employees;

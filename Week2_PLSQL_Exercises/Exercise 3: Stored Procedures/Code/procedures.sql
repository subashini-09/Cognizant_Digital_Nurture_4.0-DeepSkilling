-- Enable DBMS Output
SET SERVEROUTPUT ON;

-- Step 1: Drop and Create Table
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE emp_salary';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

CREATE TABLE emp_salary (
   emp_id      NUMBER PRIMARY KEY,
   emp_name    VARCHAR2(50),
   department  VARCHAR2(30),
   base_salary NUMBER,
   bonus       NUMBER DEFAULT 0
);

-- Step 2: Insert Sample Data
BEGIN
   INSERT INTO emp_salary VALUES (1, 'Alice', 'HR',      45000, 0);
   INSERT INTO emp_salary VALUES (2, 'Bob',   'Finance', 60000, 0);
   INSERT INTO emp_salary VALUES (3, 'Carol', 'IT',      75000, 0);
   INSERT INTO emp_salary VALUES (4, 'Dave',  'IT',      85000, 0);
   INSERT INTO emp_salary VALUES (5, 'Eve',   'Sales',   50000, 0);
   COMMIT;
END;
/

-- Step 3: Create Procedure to Process Bonus
CREATE OR REPLACE PROCEDURE process_bonus (
   p_emp_id IN NUMBER
)
IS
   v_name       emp_salary.emp_name%TYPE;
   v_dept       emp_salary.department%TYPE;
   v_salary     emp_salary.base_salary%TYPE;
   v_bonus      NUMBER := 0;
BEGIN
   -- Step 3.1: Fetch employee details
   SELECT emp_name, department, base_salary
   INTO v_name, v_dept, v_salary
   FROM emp_salary
   WHERE emp_id = p_emp_id;

   -- Step 3.2: Determine bonus using control structures
   IF v_salary < 50000 THEN
      v_bonus := v_salary * 0.10; -- 10% bonus
   ELSIF v_salary BETWEEN 50000 AND 80000 THEN
      v_bonus := v_salary * 0.07; -- 7% bonus
   ELSE
      v_bonus := v_salary * 0.05; -- 5% bonus
   END IF;

   -- Additional bonus based on department
   CASE v_dept
      WHEN 'IT' THEN v_bonus := v_bonus + 2000;
      WHEN 'Finance' THEN v_bonus := v_bonus + 1000;
      WHEN 'HR' THEN v_bonus := v_bonus + 500;
      ELSE NULL;
   END CASE;

   -- Step 3.3: Update the bonus in table
   UPDATE emp_salary
   SET bonus = v_bonus
   WHERE emp_id = p_emp_id;

   COMMIT;

   -- Step 3.4: Output result
   DBMS_OUTPUT.PUT_LINE('----- BONUS REPORT -----');
   DBMS_OUTPUT.PUT_LINE('Employee ID   : ' || p_emp_id);
   DBMS_OUTPUT.PUT_LINE('Name          : ' || v_name);
   DBMS_OUTPUT.PUT_LINE('Department    : ' || v_dept);
   DBMS_OUTPUT.PUT_LINE('Base Salary   : ' || v_salary);
   DBMS_OUTPUT.PUT_LINE('Calculated Bonus : ' || v_bonus);
EXCEPTION
   WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('❌ Employee ID ' || p_emp_id || ' not found.');
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('❌ Error: ' || SQLERRM);
END;
/

-- Step 4: Execute Procedure
DECLARE
   i NUMBER := 1;
BEGIN
   WHILE i <= 5 LOOP
      process_bonus(i);
      i := i + 1;
   END LOOP;
END;
/

-- Step 5: View Final Table
SELECT * FROM emp_salary;

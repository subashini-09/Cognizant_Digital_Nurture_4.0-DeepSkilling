DECLARE
   marks         NUMBER(3);
   total         NUMBER := 0;
   avg_marks     NUMBER;
   grade         CHAR(1);

   TYPE ARRAY_TYPE IS VARRAY(5) OF NUMBER(3);
   subject_marks ARRAY_TYPE := ARRAY_TYPE(85, 90, 78, 88, 92); -- <-- Hardcoded marks
BEGIN
   FOR i IN 1..5 LOOP
      marks := subject_marks(i);
      total := total + marks;
   END LOOP;

   avg_marks := total / 5;

   CASE
      WHEN avg_marks >= 90 THEN grade := 'A';
      WHEN avg_marks >= 80 THEN grade := 'B';
      WHEN avg_marks >= 70 THEN grade := 'C';
      WHEN avg_marks >= 60 THEN grade := 'D';
      ELSE grade := 'F';
   END CASE;

   DBMS_OUTPUT.PUT_LINE('--- MARKS ---');
   FOR i IN 1..5 LOOP
      DBMS_OUTPUT.PUT_LINE('Subject ' || i || ': ' || subject_marks(i));
   END LOOP;

   DBMS_OUTPUT.PUT_LINE('Total Marks: ' || total);
   DBMS_OUTPUT.PUT_LINE('Average Marks: ' || avg_marks);
   DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
END;
/

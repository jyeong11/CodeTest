-- Oracle
SELECT pt_name, pt_no, gend_cd, age, NVL(tlno, 'NONE') AS TLNO
  FROM patient
 WHERE age <= 12
 ORDER BY age desc, pt_name;
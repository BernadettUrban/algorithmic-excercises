/*
https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true
*/
SELECT MAX(MONTHS * SALARY), COUNT(EMPLOYEE_ID)
FROM EMPLOYEE
WHERE MONTHS * SALARY = (SELECT MAX(MONTHS * SALARY) FROM EMPLOYEE)
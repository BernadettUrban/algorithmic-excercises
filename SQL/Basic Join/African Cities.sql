/*
https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true
 */
SELECT CITY.name
FROM CITY
         INNER JOIN COUNTRY ON CITY.countrycode = COUNTRY.code
WHERE COUNTRY.continent = 'Africa'
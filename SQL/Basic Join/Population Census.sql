/*
https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true
 */
SELECT SUM(CITY.POPULATION)
FROM CITY
         INNER JOIN COUNTRY ON CITY.countrycode = COUNTRY.code
WHERE COUNTRY.continent = 'Asia'

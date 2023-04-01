/*
https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true
^((?!badword).)*$
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY RLIKE '.*[^AEIOUaeiou]$';

/*
https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true
^((?!badword).)*$
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY RLIKE '^(?![aeiouAEIOU]).*(?![aeiouAEIOU])$'
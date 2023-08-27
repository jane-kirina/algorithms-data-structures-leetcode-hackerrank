-- Revising Aggregations - The Count Function
SELECT COUNT(*) FROM city WHERE population > 100000;

-- Revising Aggregations - The Sum Function
SELECT SUM(population) FROM city WHERE district = "California";

-- Revising Aggregations - Averages
SELECT AVG(population) FROM city WHERE district = "California";

-- Average Population
SELECT FLOOR(AVG(population)) FROM city;

-- Japan Population
SELECT SUM(population) FROM city WHERE countrycode = "JPN";

-- Population Density Difference
SELECT MAX(population) - MIN(population) FROM city;

-- The Blunder
SELECT CEIL(AVG(salary) - AVG(REPLACE(salary, '0', ''))) FROM employees;

-- Top Earners
SELECT salary * months AS total, COUNT(*) FROM employee GROUP BY 1 ORDER BY total DESC LIMIT 1;

-- Weather Observation Station 2
SELECT ROUND(SUM(LAT_N), 2), ROUND(SUM(LONG_W), 2) FROM station;

-- Weather Observation Station 13
SELECT ROUND(SUM(LAT_N), 4) FROM station WHERE LAT_N BETWEEN 38.7880 AND 137.2345;

-- Weather Observation Station 14
SELECT ROUND(MAX(LAT_N), 4) FROM station WHERE LAT_N < 137.2345;

-- Weather Observation Station 15
SELECT ROUND(LONG_W, 4) FROM station WHERE LAT_N < 137.2345 ORDER BY LAT_N DESC LIMIT 1;

-- Weather Observation Station 16
SELECT ROUND(MIN(LAT_N), 4) FROM station WHERE LAT_N > 38.7880;

-- Weather Observation Station 17
SELECT ROUND(LONG_W, 4) FROM station WHERE LAT_N > 38.7880 ORDER BY LAT_N ASC LIMIT 1;

-- Weather Observation Station 18
SELECT ROUND(MAX(LAT_N) - MIN(LAT_N) + MAX(LONG_W) - MIN(LONG_W), 4) FROM station;

-- Weather Observation Station 19
SELECT ROUND(SQRT(
    POW(MAX(LAT_N) - MIN(LAT_N), 2)
        +
    POW(MAX(LONG_W) - MIN(LONG_W), 2)),
    4) FROM station;

-- Weather Observation Station 20
SET @rowindex := -1;

SELECT ROUND(AVG(LAT_N),4)
FROM
    (SELECT @rowindex:=@rowindex+1 AS rowindex, lat_n
     FROM station
     ORDER BY LAT_N) AS L
WHERE L.rowindex IN (FLOOR(@rowindex/2), CEIL(@rowindex/2));

















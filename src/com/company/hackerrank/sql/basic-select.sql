-- Revising the Select Query 1
SELECT * FROM city WHERE population > 100000 AND countrycode ="USA";

-- Revising the Select Query 2
SELECT name FROM city WHERE population > 120000 AND countrycode ="USA";

-- Select All
SELECT * FROM city;

-- Select By ID
SELECT * FROM city WHERE id=1661;

-- Japanese Cities' Attributes
SELECT * FROM city WHERE countrycode ="JPN";

-- Japanese Cities' Names
SELECT name FROM city WHERE countrycode ="JPN";

-- Weather Observation Station 1
SELECT city, state FROM station;

-- Weather Observation Station 3
SELECT DISTINCT(city) FROM station WHERE mod(id,2) = 0;

-- Weather Observation Station 4
SELECT COUNT(city) - COUNT(DISTINCT(city)) FROM station;

-- Weather Observation Station 5
SELECT city, length(city) FROM station ORDER BY length(city), city asc limit 1;
SELECT city, length(city) FROM station ORDER BY length(city) desc limit 1;

-- Weather Observation Station 6
SELECT DISTINCT(city) FROM station WHERE LEFT(city , 1) IN ('a','e','i','o','u');

-- Weather Observation Station 7
SELECT DISTINCT(city) FROM station WHERE RIGHT(city , 1) IN ('a','e','i','o','u');

-- Weather Observation Station 8
SELECT DISTINCT(city) FROM station WHERE RIGHT(city , 1) IN ('a','e','i','o','u') AND LEFT(city , 1) IN ('a','e','i','o','u');

-- Weather Observation Station 9
SELECT DISTINCT(city) FROM station WHERE LEFT(city , 1) NOT IN ('a','e','i','o','u');

-- Weather Observation Station 10
SELECT DISTINCT(city) FROM station WHERE RIGHT(city , 1) NOT IN ('a','e','i','o','u');

-- Weather Observation Station 11
SELECT DISTINCT(city) FROM station WHERE LEFT(city , 1) NOT IN ('a','e','i','o','u') OR RIGHT(city , 1) NOT IN ('a','e','i','o','u');

-- Weather Observation Station 12
SELECT DISTINCT(city) FROM station WHERE LEFT(city , 1) NOT IN ('a','e','i','o','u') AND RIGHT(city , 1) NOT IN ('a','e','i','o','u');

-- Higher Than 75 Marks
SELECT name FROM students WHERE marks > 75 ORDER BY RIGHT(name, 3), id;

-- Employee Names
SELECT name FROM employee ORDER BY name;

-- Employee Salaries
SELECT name FROM employee WHERE salary > 2000 AND months < 10 ORDER BY employee_id;

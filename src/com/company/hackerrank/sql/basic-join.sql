-- Population Census
SELECT SUM(c.population) FROM city AS c
LEFT JOIN country AS co ON c.countrycode = co.code
WHERE continent='Asia';

-- African Cities
SELECT c.name FROM city AS c
INNER JOIN country AS co ON c.countrycode = co.code
WHERE continent='Africa';

-- Average Population of Each Continent
SELECT  co.continent, FLOOR(AVG(c.population)) FROM city AS c
INNER JOIN country AS co ON c.countrycode = co.code
GROUP BY co.continent;

-- The Report(1 variant)
SELECT IF(g.grade > 7, s.name, NULL), g.grade,s.marks
FROM Students s
         JOIN Grades g
              ON s.MARKS BETWEEN g.MIN_MARK AND MAX_MARK
ORDER BY g.GRADE DESC, s.NAME ASC;
-- (2 variant)
SELECT
    CASE
        WHEN g.grade < 8
            THEN NULL
            ELSE s.name
    END,
    g.grade,
    s.marks
FROM Students s
         JOIN Grades g
              ON s.marks BETWEEN g.min_mark AND max_mark
ORDER BY g.grade DESC, s.name ASC;

-- Top Competitors


-- Ollivander's Inventory


-- Challenges


-- Contest Leaderboard


-- Type of Triangle
SELECT CASE
           WHEN 2 * GREATEST(A, B, C) >= (A + B + C)
               THEN "Not A Triangle"
           WHEN A = B AND A = C
               THEN "Equilateral"
           WHEN A = B OR A = C OR B = C
               THEN "Isosceles"
           ELSE "Scalene"
               ENDs
FROM TRIANGLES

-- The PADS
SELECT CONCAT(NAME, CONCAT("(", CONCAT(SUBSTR(OCCUPATION, 1, 1), ")")))
FROM OCCUPATIONS
ORDER BY NAME ASC;

SELECT "There are a total of ", COUNT(occupation), CONCAT(LOWER(occupation), "s.")
FROM OCCUPATIONS
GROUP BY OCCUPATION
ORDER BY COUNT(OCCUPATION), OCCUPATION ASC

-- Occupations
SELECT MIN(CASE
               WHEN Occupation = 'Doctor'
                   THEN Name
               ELSE NULL END),
       MIN(CASE
               WHEN Occupation = 'Professor'
                   THEN Name
               ELSE NULL END),
       MIN(CASE
               WHEN Occupation = 'Singer'
                   THEN Name
               ELSE NULL END),
       MIN(CASE
               WHEN Occupation = 'Actor'
                   THEN Name
               ELSE NULL END)

FROM (SELECT Occupation, Name, ROW_NUMBER() OVER(PARTITION BY Occupation ORDER BY Name) AS occus
      FROM OCCUPATIONS) AS T
GROUP BY occus

-- Binary Tree Nodes


-- New Companies




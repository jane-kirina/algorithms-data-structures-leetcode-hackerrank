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

SELECT "There are a total of ", COUNT(OCCUPATION), CONCAT(LOWER(occupation), "s.")
FROM OCCUPATIONS
GROUP BY OCCUPATION
ORDER BY COUNT(OCCUPATION), OCCUPATION ASC

-- Occupations


-- Binary Tree Nodes


-- New Companies




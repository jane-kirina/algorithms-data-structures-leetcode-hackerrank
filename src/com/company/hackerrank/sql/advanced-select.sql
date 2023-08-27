-- Type of Triangle
SELECT CASE
           WHEN 2 * GREATEST(A, B, C) >= (A + B + C)
               THEN "Not A Triangle"
           WHEN A = B AND A = C
               THEN "Equilateral"
           WHEN A = B OR A = C OR B = C
               THEN "Isosceles"
           ELSE "Scalene"
        END
FROM TRIANGLES

-- The PADS


-- Occupations


-- Binary Tree Nodes


-- New Companies




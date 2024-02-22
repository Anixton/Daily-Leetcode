SELECT class
FROM (
    SELECT class, COUNT(DISTINCT student) AS total
    FROM Courses
    GROUP BY class
) AS Subquery
WHERE total >= 5;
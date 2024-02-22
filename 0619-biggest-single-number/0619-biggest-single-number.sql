SELECT MAX(num) AS num
FROM (
    SELECT num, COUNT(num) AS total
    FROM MyNumbers 
    GROUP BY num
) AS subquery
WHERE total = 1;
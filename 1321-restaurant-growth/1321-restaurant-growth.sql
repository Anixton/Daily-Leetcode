WITH DaySum AS (
    SELECT
        visited_on,
        SUM(amount) AS amount
    FROM Customer
    GROUP BY visited_on
)

SELECT 
    a.visited_on, 
    ROUND(SUM(b.amount), 2) AS amount,
    ROUND(SUM(b.amount) / 7, 2) AS average_amount
FROM DaySum a, DaySum b 
WHERE DATEDIFF(a.visited_on, b.visited_on) BETWEEN 0 AND 6
GROUP BY a.visited_on
HAVING a.visited_on - (SELECT MIN(visited_on) FROM Customer) >= 6
ORDER BY a.visited_on
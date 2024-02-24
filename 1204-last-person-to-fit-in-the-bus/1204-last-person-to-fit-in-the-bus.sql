SELECT person_name
FROM (
    SELECT a.person_id, a.person_name, a.turn, SUM(b.weight) AS total
    FROM Queue a
    JOIN Queue b ON a.turn >= b.turn
    GROUP BY a.person_id, a.person_name
) AS Subquery
WHERE total <= 1000
ORDER BY total DESC
LIMIT 1;
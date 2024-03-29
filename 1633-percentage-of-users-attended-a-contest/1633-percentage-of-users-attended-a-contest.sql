SELECT 
    r.contest_id, 
    ROUND(
        (COUNT(DISTINCT r.user_id) * 100.0 / 
        (
            SELECT COUNT(*) 
            FROM Users
        )),2
    ) as percentage
FROM 
    Register r
GROUP BY 
    r.contest_id
ORDER BY
    percentage desc,
    r.contest_id asc;
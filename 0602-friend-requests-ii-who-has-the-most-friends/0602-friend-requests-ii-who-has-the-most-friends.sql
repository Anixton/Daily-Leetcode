SELECT 
    id, 
    SUM(total) as num
FROM
    (
        SELECT 
            requester_id as id, 
            COUNT(requester_id) as total
        FROM 
            RequestAccepted 
        GROUP BY 
            requester_id 

        UNION ALL 

        SELECT 
            accepter_id as id, 
            COUNT(accepter_id) as total
        FROM 
            RequestAccepted
        GROUP BY 
            accepter_id
    ) as combined_queries
GROUP by 
    id
ORDER BY 
    SUM(total) desc
LIMIT 
    1;
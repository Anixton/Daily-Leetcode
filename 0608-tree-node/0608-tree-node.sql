SELECT id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN (SELECT COUNT(*) FROM Tree WHERE p_id = t.id) = 0 THEN 'Leaf'
           ELSE 'Inner'
       END AS type
FROM Tree t;
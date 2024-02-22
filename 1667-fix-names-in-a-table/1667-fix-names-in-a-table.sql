SELECT user_id ,CONCAT(upper(LEFT(name  , 1)), lower(RIGHT(name , LENGTH(name) - 1))) AS name
FROM Users
ORDER BY user_id;

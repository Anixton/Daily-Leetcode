SELECT customer_id
FROM Customer 
GROUP BY customer_id
Having COUNT(DISTINCT product_key)=(SELECT COUNT(*) from Product)

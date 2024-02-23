SELECT product_name, SUM(unit) as unit
FROM Products p 
JOIN Orders o ON p.product_id = o.product_id
WHERE YEAR(o.order_date) = 2020 AND MONTH(o.order_date) = 2
GROUP BY product_name
HAVING SUM(unit) >= 100;
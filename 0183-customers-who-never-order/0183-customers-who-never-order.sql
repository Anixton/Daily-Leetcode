# Write your MySQL query statement below

SELECT name as Customers
FROM Customers x
Where x.id not in
(SELECT customerId
 FROM  Orders);
# Write your MySQL query statement below

SELECT name as Employee
FROM Employee x
WHERE salary > (
    SELECT salary
    FROM Employee
    WHERE id=x.managerId
);
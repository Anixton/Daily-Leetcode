SELECT D.name as Department, E.name as Employee, E.salary as Salary
FROM (
    SELECT departmentId, name, salary,
           DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM Employee
) E
JOIN Department D ON E.departmentId = D.id
WHERE E.rnk <= 3;
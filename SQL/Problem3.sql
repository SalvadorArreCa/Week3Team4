SELECT 
    d.name AS Department, 
    e.name AS Employee, 
    e.salary AS Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE ( 
    SELECT COUNT(DISTINCT salary)
    FROM Employee ec
    WHERE ec.departmentId = e.departmentId AND ec.salary >= e.salary
)  <=3
ORDER By Department, salary DESC 
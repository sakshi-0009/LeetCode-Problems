# Write an SQL query to find employees who have the highest salary in each of the departments.

# Solution :-

SELECT D.Name as Department, E.Name as Employee, Salary 
FROM Employee E 
inner join Department D on E.DepartmentId = D.Id 
WHERE (DepartmentId,Salary) in(SELECT DepartmentId, MAX(Salary) 
FROM Employee group by DepartmentId)

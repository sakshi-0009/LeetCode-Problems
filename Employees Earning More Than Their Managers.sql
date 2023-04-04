# Write an SQL query to find the employees who earn more than their managers.

# Solution :-

SELECT name AS Employee FROM Employee e1 WHERE 
salary > (SELECT salary FROM Employee WHERE id=e1.managerId)

# Write an SQL query to report the second highest salary from the Employee table. If there is no second highest salary, the query should report null.

# Solution :-

SELECT MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employee);

'''Write an SQL query to report the nth highest salary from the Employee table. If there is no nth highest salary, the query should report null.'''

# Solution :-

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
RETURN (
ifnull((select distinct Salary from Employee
order by Salary desc
limit 1 offset N),null)
);
END

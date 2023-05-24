// Write an SQL query to report the name and bonus amount of each employee with a bonus less than 1000.
// Return the result table in any order.

// Solution:-
  
SELECT e.name, b.bonus
FROM employee e
LEFT JOIN bonus b
ON e.empId = b.empId
WHERE b.bonus <1000 OR b.bonus is null

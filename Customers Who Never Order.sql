# Write an SQL query to report all customers who never order anything. Return the result table in any order.

# Solution :-

SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId is NULL;

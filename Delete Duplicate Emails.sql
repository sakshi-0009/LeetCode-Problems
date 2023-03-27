/* Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id.
Note that you are supposed to write a DELETE statement and not a SELECT one.*/

# Solution :-

DELETE P1 FROM PERSON P1, PERSON P2
WHERE P1.Email = p2.Email AND P1.Id>P2.Id ;

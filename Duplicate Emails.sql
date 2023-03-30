# Write an SQL query to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.

# Solution :-

select distinct a.Email from
(select Email,row_number() over (partition by Email) as rn
from Person) a
where a.rn > 1

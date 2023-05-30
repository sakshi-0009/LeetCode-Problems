# Write an SQL query to find all numbers that appear at least three times consecutively.

# Solution:- 

Select distinct(num) as ConsecutiveNums
from(
Select id,num,
lag(num) over(order by id) as prev_num,
lead(num) over(order by id) as next_num
from Logs
) sq
where sq.num = sq.prev_num and sq.prev_num = sq.next_num

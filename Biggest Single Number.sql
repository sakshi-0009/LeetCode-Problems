''' Query:- Write an SQL query to report the largest single number. If there is no single number, report null.'''

Solution:-

select max(num) as num
from
(select num from mynumbers group by num having count(*) = 1) a


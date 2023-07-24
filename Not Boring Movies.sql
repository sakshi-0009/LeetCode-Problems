''' Query:- Write an SQL query to report the movies with an odd-numbered ID and a description that is not "boring". '''

Solution:-

select * FROM Cinema
WHERE ((id % 2) <> 0)and (description <>"boring")
order by rating desc;


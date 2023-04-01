''' Write an SQL query to rank the scores. The ranking should be calculated according to the following rules:

1. The scores should be ranked from the highest to the lowest.
2. If there is a tie between two scores, both should have the same ranking.
3. After a tie, the next ranking number should be the next consecutive integer value. In other words, there should be no holes between ranks.

Return the result table ordered by score in descending order.'''

# Solution :-

SELECT s.Score , COUNT(t.Score) AS 'Rank' FROM
(SELECT DISTINCT Score FROM Scores) AS t , Scores AS s
WHERE s.Score <= t.Score
GROUP BY s.id,s.Score
ORDER BY s.Score DESC;

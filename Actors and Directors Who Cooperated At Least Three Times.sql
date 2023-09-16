''' Query : Write a solution to find all the pairs (actor_id, director_id) where the actor has cooperated with the director at least three times.'''

select actor_id, director_id from ActorDirector
group by actor_id, director_id
having count(timestamp)>=3 

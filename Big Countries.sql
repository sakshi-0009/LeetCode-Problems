# Write an SQL query to report the name, population, and area of the big countries.

# Solution:-

SELECT name,population,area
FROM world
WHERE area >= 3000000 OR population >= 25000000;

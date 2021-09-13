--Q1.
SELECT DISTINCT replacement_cost FROM film;
--Q2.
SELECT COUNT(DISTINCT replacement_cost) FROM film;
--Q3.
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';
--Q4.
SELECT COUNT(*) FROM country
WHERE country LIKE '_____';
--Q5.
SELECT COUNT(*) FROM city
WHERE city ILIKE '%R';
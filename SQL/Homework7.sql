--Q1.
SELECT rating, COUNT(*) FROM film
GROUP BY rating;
--Q2.
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;
--Q3.
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;
--Q4.
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
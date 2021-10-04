--Q1.
SELECT COUNT(*) FROM film
WHERE length > (SELECT AVG(length) FROM film);
--Q2.
SELECT COUNT(*) FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);
--Q3.
SELECT * FROM film
WHERE replacement_cost = (SELECT MIN(replacement_cost) FROM film)
AND rental_rate = (SELECT MIN(rental_rate) FROM film);
--Q41.
SELECT customer_id, COUNT(*) FROM payment
GROUP BY customer_id
ORDER BY COUNT(*) DESC;

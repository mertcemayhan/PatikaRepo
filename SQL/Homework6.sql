--Q1.
SELECT AVG(rental_rate) FROM film;
--Q2.
SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';
--Q3.
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;
--Q4.
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;
--Q1.
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;
--Q2.
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length
OFFSET 1
LIMIT 5;
--Q3.
SELECT * FROM customer
WHERE store_id=1
ORDER BY last_name DESC
LIMIT 4;
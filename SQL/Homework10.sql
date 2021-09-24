--Q1.
SELECT country, city FROM country
LEFT JOIN city
ON country.country_id=city.country_id;
--Q2.
SELECT payment_id, first_name, last_name FROM customer
RIGHT JOIN payment
ON customer.customer_id=payment.customer_id;
--Q3.
SELECT rental_id, first_name, last_name FROM rental
FULL JOIN customer
ON customer.customer_id=rental.customer_id;
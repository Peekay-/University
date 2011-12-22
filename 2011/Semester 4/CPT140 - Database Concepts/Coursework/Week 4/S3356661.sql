/* Question 1 */
SELECT cust_name, street, town, postcode, cr_limit
FROM Customers
WHERE cust_name = 'Di Hunter';

/* Question 2 */
SELECT town, COUNT(*)
FROM Customers
GROUP BY Town
ORDER BY Town;

/* Question 3 */
SELECT cust_name, street, town, postcode
FROM Customers
WHERE curr_balance >=(cr_limit - 50);

/* Question 4 */
SELECT prod_group, AVG(DISTINCT list_price)
FROM Products;

/* Question 5 */
SELECT prod_cod, prod_group, SUM(list_price * qty_on_hand AS Total)
FROM Products;

SELECT prod_group, Total
FROM Products
HAVING Count(*) >=2000;

/* Question 6 */
SELECT prod_cod
FROM Products
WHERE Description LIKE '%Trough%' OR LIKE '%Tank%';



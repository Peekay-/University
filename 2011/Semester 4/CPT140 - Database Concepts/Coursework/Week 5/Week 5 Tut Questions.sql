/* Question 1 */
SELECT orders.order_no, order_date, cust_no, order_details.prod_cod, order_qty,
order_price
FROM Order_Details, Orders, Products
WHERE order_details.order_no=orders.order_no
AND products.prod_cod = Order_details.prod_cod
AND products.prod_cod = 'GNOME';

/* Quesrtion 2 */
SELECT orders.order_no, order_date, customers.cust_no, customers.cust_name
FROM Orders, Customers, Order_Details
WHERE Customers.cust_no = Orders.cust_no
AND Orders.order_no = order_details.order_no
GROUP BY orders.order_no, order_date, customers.cust_no, cust_name
HAVING SUM (order_qty * order_price) >= 1000;

SELECT orders.order_no, order_date, customers.cust_no, customers.cust_name
FROM Orders, Customers
WHERE Customers.cust_no = Orders.cust_no
AND order_no in (select order_no
FROM order_details
GROUP BY order_no
HAVING SUM (order_qty * order_price) >=1000)

SELECT orders.order_no, order_date, customers.cust_no, customers.cust_name
FROM Customers, Orders
WHERE Customers.cust_no = Orders.cust_no
AND EXISTS (select order_No
FROM order_details
WHERE order_no=orders.order_no
HAVING SUM (order_qty * order_price) >= 1000)

/* Question 3 */
SELECT Prod_Group, SUM (List_Price * Qty_On_Hand) AS Value
FROM Products
GROUP BY Prod_Group
ORDER BY Value Desc

/* Question 4 - a */
SELECT prod_group, max(sum(qty_on_hand*list_price))
FROM Products
GROUP BY prod_group; 
/* In the above we need to remove the Max formula as this is doing nothing 
and causing the code to fail. */
/* b */
SELECT prod_group, SUM (QTY_On_Hand * List_Price) AS Value
FROM Products
GROUP BY prod_group
HAVING SUM (Qty_On_Hand * List_Price) = (SELECT MAX(SUM(Qty_On_Hand * List_Price))FROM Products GROUP BY Prod_Group)

/* Question 5 */
select A.cust_no, A.cr_limit
from customers A
where A.cust_no= any (select cust_no
from Orders);














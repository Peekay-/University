/*
 * Create a rocky concrete database without any integrity constraints. 
 */  

/* Remove any existing tables
 * Customers, Products, Orders, Order_details
 */
 
drop table order_details;
drop table orders;
drop table products;
drop table customers; 

/* Set date fomat */
alter session set nls_date_format = 'DD/MM/YYYY';

/*  Data Definition */
 
CREATE TABLE CUSTOMERS
        (CUST_NO        INTEGER         ,
        CUST_NAME       VARCHAR(40)     ,
        STREET          VARCHAR(40)     ,
        TOWN            VARCHAR(40)     ,
        POSTCODE        INTEGER         ,
        CR_LIMIT        INTEGER         ,
        CURR_BALANCE    INTEGER         ,
	primary key (cust_no)		);
 
CREATE TABLE PRODUCTS
        (PROD_COD       VARCHAR(10)     ,
        DESCRIPTION     VARCHAR(50)     ,
        PROD_GROUP      CHAR(1)         , 
        LIST_PRICE      INTEGER         ,
        QTY_ON_HAND     INTEGER         ,
        REMAKE_LEVEL    INTEGER         ,
        REMAKE_QTY      INTEGER         ,
	primary key (prod_cod)		);
 
CREATE TABLE ORDERS
        (ORDER_NO       INTEGER         ,
        ORDER_DATE      DATE            ,
        CUST_NO         INTEGER         ,
	primary key (order_no)		,
	foreign key (cust_no)
		references customers	);
 
CREATE TABLE ORDER_DETAILS
        (ORDER_NO       INTEGER         ,
        PROD_COD        VARCHAR(10)     ,
        ORDER_QTY       INTEGER         ,
        ORDER_PRICE     INTEGER         ,
	primary key (order_no, prod_cod),
	foreign key (order_no) 
		references orders,
	foreign key (prod_cod)
		references products 	);

/*      2.      Data Population         */
 
/*      2.1.    CUSTOMERS               */
 
INSERT INTO CUSTOMERS VALUES
        (1066, 'Nevs Nursery', 'White Hart', 'Bundoora', 3083, 500, 450);
 
INSERT INTO CUSTOMERS VALUES
        (13144, 'Preston City', 'High Street', 'Preston', 3072, 3000, 1000);
 
INSERT INTO CUSTOMERS VALUES
        (1776, 'Di Hunter', 'Thornton Farm', 'Whittlesea', 3757, 500, 500);
 
INSERT INTO CUSTOMERS VALUES
        (2001, 'Glads Gladdies', 'Childs Road', 'Mill Park', 3082, 500, 0);
 
INSERT INTO CUSTOMERS VALUES
        (2002, 'Mill Park', 'Betula Ave', 'Mill Park', 3082, 1000, 300);
 
/*      2.2.    PRODUCTS                */
 
INSERT INTO PRODUCTS VALUES
        ('MOO', 'Medium Cattle Trough', 'A', 150, 6, 3, 5);
 
INSERT INTO PRODUCTS VALUES
        ('LOO', 'Large Cattle Trough', 'A', 250, 1, 1, 3);
 
INSERT INTO PRODUCTS VALUES
        ('STANK', 'Small Septic Tank', 'D', 300, 10, 5, 15);
 
INSERT INTO PRODUCTS VALUES
        ('LTANK', 'Large Septic Tank', 'D', 450, 1, 2, 2);
 
INSERT INTO PRODUCTS VALUES
        ('LTUB', 'Laundry Tub', 'D', 100, 20, 15, 20);
 
INSERT INTO PRODUCTS VALUES
        ('GNOME', 'Garden Gnome', 'D', 10, 100, 150, 200);
 
INSERT INTO PRODUCTS VALUES
        ('STAND', 'Bicycle Stand', 'C', 50, 50, 35, 20);
 
INSERT INTO PRODUCTS VALUES
        ('GABBY', 'Football Player Statue', 'C', 500, 10, 15, 40);
 
/*      2.3.    ORDERS          */
 
INSERT INTO ORDERS VALUES
        (1, '01-07-1993', 13144);
 
INSERT INTO ORDERS VALUES
        (2, '02-07-1993', 13144);
 
INSERT INTO ORDERS VALUES
        (3, '02-07-1993', 1066);
 
/*      2.4.    ORDER_DETAILS   */
 
INSERT INTO ORDER_DETAILS VALUES
        (1, 'STAND', 10, 45);
 
INSERT INTO ORDER_DETAILS VALUES
        (1, 'GABBY', 2, 480);
 
INSERT INTO ORDER_DETAILS VALUES
        (2, 'STAND', 5, 45);
 
INSERT INTO ORDER_DETAILS VALUES
        (3, 'GNOME', 10, 10);

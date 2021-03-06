create table userlist
(
user_id int not null,
user_name varchar(200) not null,
user_email varchar(200) not null,
user_location varchar(200) not null,
primary key(user_id)
);



INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(1,'John','jhon@gmail.com','Delhi');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(2,'Sayra','sayra@gmail.com','Mumbai');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(3,'Rahul','rahul@12gmail.com','Delhi');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(4,'Teena','teena@gmail.com','Jaipur');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(5,'Sanjay','sanjay@gmail.com','Chennai');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(6,'Pooja','pooja@gmail.com','Agra');
INSERT INTO USERLIST (USER_ID,USER_NAME,USER_EMAIL,USER_LOCATION)
VALUES(7,'Arhaan','arhaan@gmail.com','Banglore');




create table purchase(
product_id integer not null, 
product_category varchar(255) not null, 
product_brand varchar(255) not null,

product_size int(30) not null,
product_price int(30) not null,

purchase_date DATE,
primary key(product_id)
);
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE,PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (1, 'Soccer Shoes', 'Nike',3000, 6,TO_DATE('2021-06-06', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (2, 'Golf Shoes', 'Puma', 2000, 5,TO_DATE('2021-01-01', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (3, 'Golf Shoes', 'Reebok',2000, 7,SYSDATE());
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (4, 'Soccer Shoes', 'Puma', 1000, 5,TO_DATE('2021-12-30', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (5, 'Running Shoes', 'Adidas',4000, 8,SYSDATE());
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (6, 'High Top Shoes', 'Reebok', 2200, 6, TO_DATE('2021-11-10', 'yyyy-MM-dd'));

INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (7, 'Hiking Boots Shoes', 'Red Tap',3000, 4 ,TO_DATE('2021-05-02', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (8, 'Running Shoes', 'Nike', 2000, 5, TO_DATE('2021-05-10', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(PRODUCT_ID, PRODUCT_CATEGORY,PRODUCT_BRAND,PRODUCT_PRICE, PRODUCT_SIZE,PURCHASE_DATE) 
VALUES (9, 'Hiking Boots Shoes', 'Adidas', 1000, 4,TO_DATE('2021-10-11', 'yyyy-MM-dd'));





show databases;
create database storeFront;
use storeFront;

create table roles (role_id int(5) primary key, 
role_desc varchar(100), 
role_name varchar(20));


create table User (user_id int(5) primary key,
user_name varchar(20) not null,
user_mobile int(10), 
user_shipping varchar(50),
user_email varchar(50),role_id int(5),
FOREIGN Key(role_id ) references roles(role_id));


create table login (login_id int(5) primary key auto_increment , 
username varchar(20), 
password varchar(25),
user_id int(5),
FOREIGN Key(user_id) references user(user_id)
);


create table category(category_id int(5) primary key, 
category_type varchar(20), 
category_name varchar(20),
category_parent int(5) default null); 

create table products (product_id int(5) primary key auto_increment,
rolesproduct_price float(5,2),
product_name varchar(20),
product_images varchar(50),
product_desc varchar(100),
product_qty int(10),
category_id int(5),
date Date,
status varchar(20),
FOREIGN Key(category_id) references category(category_id));


create table cart_list(cart_id int(5), 
user_id int(5),
product_id int(5),
shipping_address varchar(100),
product_qty int(5),
Primary key(cart_id,product_id,user_id),
Foreign Key(product_id)  references products(product_id),
Foreign key(user_id)  references user(user_id));


create table ShopperOrder(order_id int(5) auto_increment,
date Date,
cart_id int(5),
Status varchar(20),
primary key (order_id,cart_id),
Foreign key (cart_id)references cart_list(cart_id));



SET FOREIGN_KEY_CHECKS = 0;
drop table products ;


create table products (product_id int(5) primary key auto_increment,
product_price float(5,2),
product_name varchar(20),
product_images varchar(50),
product_desc varchar(100),
product_qty int(10),
category_id int(5),
date Date,
status varchar(20),
FOREIGN Key(category_id) references category(category_id));




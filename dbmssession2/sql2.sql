use storeFront;
show tables;

insert into roles values(1,"uer or shopper","shopper");
insert into roles values(2,"admin","admin");

insert into user values(1,"anmol",722456789,"abc 1234 verr","abc@123",1);
insert into user values(2,"babbar",723456789,"def 123","def@123",1);
insert into user values(3,"mahendar",1923456789,"veer","hij@123",1);
insert into user values(4,"aman",997345789,"abcdef","klm@123",1);
insert into user values(5,"abc",78432689,"1234das","nmo@123",2);
insert into user values(6,"def",78456789,"jklm","pqr@123",2);
insert into user values(7,"hijl",643456789,"defhgi","stu@123",1);
insert into user values(8,"klm",733456789,"abc 123","vwz@123",1);
insert into user values(9,"anm",983456789,"abc verr","yza@123",1);
insert into user values(10,"ole",753456789,"art err","qrt@123",1);
insert into user values(11,"ajay",923411789,"abc 1234 verr","lmn@123",2);
insert into user values(12,"singh",623459789,"abc 897 verr","rwc@123",1);
insert into user values(13,"riddhi",973450789,"abc 1 verr","klc@123",1);
insert into user values(14,"shyam",723476789,"abc kaverr","mnoc@123",1);
insert into user values(15,"ram",929056789,"abcdefhij","aqwe@123",1);

insert into login  (username, password,user_id)  values("anmol","abc123",1);
insert into login  (username, password,user_id)  values("babbar","abc123",2);
insert into login  (username, password,user_id)  values("ole","abc123",10);
insert into login  (username, password,user_id)  values("abc","abc123",5);
insert into login  (username, password,user_id)  values("klm","abc123",8);
insert into login  (username, password,user_id)  values("ajay","abc123",11);
insert into login  (username, password,user_id)  values("ram","abc123",15);
insert into login  (username, password,user_id)  values("anm","abc123",9);
insert into login  (username, password,user_id)  values("riddhi","abc123",13);
insert into login  (username, password,user_id)  values("aman","abc123",4);

insert into category values(1,"Top Category","electronics",null);
insert into category values(2,"electronics","mobiles",1);
insert into category values(3,"electronics","smart watches",1);
insert into category values(10,"electronics","laptops",1);
insert into category values(4,"electronics","machines",1);
insert into category values(5,"Top Category","cloths",null);
insert into category values(6,"cloths","men",5);
insert into category values(7,"cloths","women",5);
insert into category values(8,"cloths","children",5);
insert into category values(9,"Top Category","Accessiories",null);
insert into category values(11,"Accessiories","caps",9);
insert into category values(12,"Accessiories","belts",9);
insert into category values(13,"Accessiories","socks",9);

insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("nokia",500,"jpeg","nokia mobile",55,2,"2012-11-02","active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("mi",250,"png","mi mobile",20,2,"2019-05-01","active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("jeans",100,null,"men jeans",50,6,"2015-11-12","active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("cap",250,null,"accessiories",11,11,"2019-06-22","not active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("tops",200,"jpeg","women tops",77,7,"2019-02-01","active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("washing machine",500,"png","electronic washing machine",41,4,"2019-02-22","not active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("watches",200,"png","electronic watches",200,3,"2019-05-17","active");
insert into products(product_name,product_price,product_images,product_desc,product_qty,category_id,date,status)
values ("dress",500,null,"women dress",49,7,"2018-11-29","active");



insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (1,5,2,"1234das",3);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (1,5,7,"1234das",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (1,5,8,"1234das",4);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (2,1,2,"def 123",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (2,1,3,"def 123",3);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (3,3,3,"veer",3);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (4,12,1,"abc 897 verr",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (5,12,4,"abc 897 verr",7);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (6,9,1,"abc verr",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (7,12,6,"abc 897 verr",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (8,5,8,"1234das",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (9,1,2,"def 123",1);
insert into cart_List(cart_id,user_id,product_id,shipping_address,product_qty) 
values (10,6,3,"jklm",1);
 

insert into shopperorder(date,cart_id,status) values ("2019-02-22",1,"shipped");
insert into shopperorder(date,cart_id,status) values ("2019-08-13",2,"not shipped");
insert into shopperorder(date,cart_id,status) values ("2019-08-15",3,"shipped");
insert into shopperorder(date,cart_id,status) values ("2019-02-22",4,"shipped");
insert into shopperorder(date,cart_id,status) values ("2017-02-22",5,"not shipped");
insert into shopperorder(date,cart_id,status) values ("2019-06-22",6,"not shipped");
insert into shopperorder(date,cart_id,status) values ("2019-06-29",12,"shipped");
insert into shopperorder(date,cart_id,status) values ("2019-02-22",8,"delivered");
insert into shopperorder(date,cart_id,status) values ("2019-08-07",9,"not shipped");
insert into shopperorder(date,cart_id,status) values ("2019-08-10",10,"delivered");



-- query 1
select product_id,product_name,product_price,category_name,date from products,category
where products.category_id=category.category_id And products.status="active"
order by products.date desc ; 

-- query 2
select product_name 
from products 
where product_images is null;

-- query 3

-- query 4


-- query 5
select product_name, product_price,product_desc,category_name 
from products,category 
where products.category_id=category.category_id and category.category_name like "mobiles";

-- query 6
select product_name,product_price,product_qty
from products 
where product_qty<50;

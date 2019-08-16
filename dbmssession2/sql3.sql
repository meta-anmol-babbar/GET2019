-- query 1
select shopperorder.order_id,shopperorder.date,sum(products.product_price * cart_list.product_qty) as order_total 
from shopperorder,cart_list,products  
where shopperorder.cart_id = cart_list.cart_id and cart_list.product_id=products.product_id  
group by order_id
limit 50;

-- query 2
select shopperorder.order_id,shopperorder.date,sum(products.product_price * cart_list.product_qty) as order_total   
from shopperorder,cart_list,products  
where shopperorder.cart_id = cart_list.cart_id and cart_list.product_id=products.product_id  
group by order_id 
order By order_total desc
limit 10;

-- query 3
select order_id,date from shopperorder where status like "not shipped" and  `date`  <=  NOW() - INTERVAL 10 DAY;

-- query 4
SELECT user_name
  FROM user where user_id not in (select distinct user_id
                        from cart_list
                        left join shopperorder 
                        on cart_list.cart_id=shopperorder.cart_id
                        where shopperorder.date BETWEEN NOW() - INTERVAL 30 DAY AND NOW());

                        
-- query 5
SELECT user_name
  FROM user where user_id in (select distinct user_id
                        from cart_list
                        left join shopperorder 
                        on cart_list.cart_id=shopperorder.cart_id
                        where shopperorder.date BETWEEN NOW() - INTERVAL 15 DAY AND NOW());
                        
-- queery 6 

-- query 7

select user_id,product_name,shopperorder.date,sum(products.product_price * cart_list.product_qty) as order_total 
from (cart_list
inner join shopperorder 
on cart_list.cart_id=shopperorder.cart_id 
inner join products 
on cart_list.product_id=products.product_id) group by order_id
having order_total BETWEEN 250 and 500;

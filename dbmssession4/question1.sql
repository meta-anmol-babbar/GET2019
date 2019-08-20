SHOW DATABASES;
USE storefront;

-- 1.1 Create a function to calculate number of orders in a month. Month and year will be input parameter to function.

Delimiter $$

CREATE FUNCTION count_orders(month_num INT, year_num INT)
RETURNS INT
BEGIN
    DECLARE order_count INT;
    SELECT COUNT(*) INTO order_count FROM shopperorder 
    WHERE MONTH(date)=month_num AND YEAR(date)=year_num;
    RETURN order_count;
END $$

delimiter ;

SELECT COUNT_ORDERS(8, 2019);


drop function max_order_month;


-- 1.2 Create a function to return month in a year having maximum orders. Year will be input parameter.


delimiter $$
create function max_order_month(year_num INT)
returns varchar(20)
begin 
    Declare month_order varchar(20);
    select MONTHNAME(shopperorder.date) from shopperorder
    where year(date)='2019'
    group by month(date)
    having count(*) >= 
    (SELECT COUNT(*) FROM shopperorder
   WHERE YEAR(shopperorder.date) = '2019'
   GROUP BY MONTHNAME(shopperorder.date));
    return month_order;
end $$

delimiter ;

SELECT MONTHNAME(t.date),MAX(count1) FROM 
   (
   SELECT MONTHNAME(o.date) ,COUNT(*) as count1 FROM shopperorder as o
   WHERE YEAR(o.date) = '2019'
   GROUP BY MONTH(o.date)
   ) as t;
   
SELECT * FROM SHOPPERORDER;

select max_order_month(2019);

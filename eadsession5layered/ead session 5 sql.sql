CREATE DATABASE shopping ;
USE shopping;

CREATE TABLE products(
    p_code INT PRIMARY KEY AUTO_INCREMENT,
    p_type VARCHAR(255),
    p_name VARCHAR(255),
    P_price FLOAT
);

CREATE TABLE cart(
    productCode INT,
    quantity INT,
    productPrice FLOAT,
    FOREIGN KEY (productCode)
        REFERENCES products (p_code)
);

INSERT INTO products (p_type,p_name,p_price) VALUES ("Electronic","heater","5000");
INSERT INTO products (p_type,p_name,p_price) VALUES ("Electronic","Mobiles","7000");
INSERT INTO products (p_type,p_name,p_price) VALUES ("Cloths","jeans","500");
INSERT INTO products (p_type,p_name,p_price) VALUES ("Cloths","Shirts","900");
INSERT INTO products (p_type,p_name,p_price) VALUES ("Food","Packed","50");
INSERT INTO products (p_type,p_name,p_price) VALUES ("Food","fruits","100");
INSERT INTO products (p_type,p_name,p_price) VALUES ("food","Vegetables","50");
INSERT INTO products (p_type,p_name,p_price) VALUES ("food","snacks","20");

SELECT 
    *
FROM
    PRODUCTS;



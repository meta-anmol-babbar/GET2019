SHOW DATABASES;
CREATE DATABASE parking;

USE parking;


CREATE TABLE employee_record(
    Emp_id INT(11) NOT NULL AUTO_INCREMENT,
    Emp_name VARCHAR(45) NOT NULL,
    Gender VARCHAR(45) NOT NULL,
    Email VARCHAR(45) NOT NULL,
    Password VARCHAR(45) NOT NULL,
    Contact BIGINT(20) NOT NULL,
    Organization VARCHAR(45) NOT NULL,
    PRIMARY KEY (Emp_id),
    UNIQUE KEY Email_UNIQUE (Email)
);

CREATE TABLE Vehicle_record(
    Emp_id INT,
    Veh_name VARCHAR(200) NOT NULL,
    Veh_type VARCHAR(20) CHECK (type IN ('Cycle','Motorcycle', 'Car')),
    Veh_number VARCHAR(200) PRIMARY KEY NOT NULL,
    Veh_identification VARCHAR(200),
    FOREIGN KEY (Emp_id)
        REFERENCES Employee_record (Emp_id)
        ON DELETE SET NULL
);


CREATE TABLE plan_record(
    Emp_id INT(11) DEFAULT NULL,
    Veh_number VARCHAR(20) DEFAULT NULL,
    Plan VARCHAR(20) NOT NULL,
    Price FLOAT NOT NULL,
    KEY Veh_number (Veh_number),
    KEY Emp_id (Emp_id),
    FOREIGN KEY (Veh_number)
        REFERENCES vehicle_record (Veh_number),
    FOREIGN KEY (Emp_id)
        REFERENCES employee_record (Emp_id)
);


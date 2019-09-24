CREATE DATABASE `student` ;


CREATE TABLE `student` (
  `S_id` int(11) NOT NULL,
  `S_age` int(11) NOT NULL,
  `S_email` varchar(255) DEFAULT NULL,
  `Father_name` varchar(50) DEFAULT NULL,
  `First_name` varchar(15) DEFAULT NULL,
  `last_name` varchar(15) DEFAULT NULL,
  `S_class` int(11) NOT NULL,
  PRIMARY KEY (`S_id`)
);


CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(120) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
  );

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  KEY `username` (`username`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
);

insert into users(username, password, enabled) values('user','user',true);
insert into authorities(username, authority) values('user','USER');
insert into users(username, password, enabled) values('admin','admin',true);
insert into authorities(username, authority) values('admin','ADMIN');

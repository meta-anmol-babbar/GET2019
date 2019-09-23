show databases;
create database students;
use students;

create table studentDetails(
    student_id int primary key auto_increment,
    FirstName varchar(255) NOT NULL,
    LastName varchar(255) NOT NULL,
    FatherName varchar(255) Not Null,
    Class int,
    Age int);
    
insert into studentDetails (FirstName,LastName,FatherName,Class,Age) values ("Anmol","Babbar","Mr. Singh",18,12);
insert into studentDetails (FirstName,LastName,FatherName,Class,Age) values ("Anmol","Singh","Mr. Singh",10,5);
insert into studentDetails (FirstName,LastName,FatherName,Class,Age) values ("Aman","Gautam","Mr gautam",10,5);
insert into studentDetails (FirstName,LastName,FatherName,Class,Age) values ("Anmol","sharma","Mr. sharma",17,11);

select student_id,FirstName,LastName,FatherName,Class,Age from StudentDetails;


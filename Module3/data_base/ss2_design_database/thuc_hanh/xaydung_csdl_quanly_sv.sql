create database my_database;
use my_database;
create table Class(id int auto_increment primary key not null,
name varchar(50));
create table Teacher(id int,
name varchar(50), 
age int, 
country varchar(50));

insert into Class(name) values("Le Tu Hung");


insert into Teacher (name,age,country) values("Le Tu Hung5","18","Viet Nam");
insert into Teacher (name,age,country) values("Le Tu Hung6","22","My Tho");

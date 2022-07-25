create database QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
cID int auto_increment primary key,
cName varchar (50) not null,
cAge int not null
);

create table `Order`(
oID int auto_increment primary key,
cID int not null,
oDate date not null,
oTotalPrice float not null,
foreign key (cID) references Customer(cID)
);

create table Product(
pID int auto_increment primary key,
pName varchar(50) not null,
pPrice float not null
);

create table OrderDetail(
oID int not null,
pID int not null,
odQTY varchar(50) not null,
primary key(oID,pID),
foreign key (oID) references `Order`(oID),
foreign key (pID) references Product(pID)
);
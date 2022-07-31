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

insert into Customer 
values (1,'Minh Quan', 10),(2,'Ngoc Oanh', 20),(3,'Hong Ha', 50);

insert into `Order`(oID,cID,oDate) 
values (1,1,'2006-3-21'),(2,2,'2006-3-23'),(3,1,'2006-3-16');

insert into Product
values (1,'May giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);

insert into OrderDetail
values (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order

select oID,oDate,oTotalPrice
from `Order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách

select c.cName,p.pName
from OrderDetail od
inner join `Order` o on o.oID = od.oID
inner join Product p on p.pID = od.pID
inner join Customer c on c.cID = o.cID;


-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select c.cName
from Customer c 
left join `Order` o on c.cID = o.cID
where o.oID is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của
-- từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)

select od.oID as codeOrder, o.oDate as DateOrder, sum(od.odQTY*p.pPrice) as Total 
from OrderDetail od 
join `Order` o on o.oID = od.oID
join Product p on p.pID = od.pID
group by (o.oID);


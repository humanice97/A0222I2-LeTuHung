create database ERD_sang_mo_hinh_quan_he;
use ERD_sang_mo_hinh_quan_he;

create table VatTu(
MaVTU varchar(20) primary key,
TenVTU varchar(50) not null
);

create table PhieuXuat(
SoPX varchar(20) primary key,
NgayXuat datetime
);

create table PhieuNhap(
SoPN varchar(20) primary key,
NgayNhap datetime
);
create table NhaCC(
MaNCC varchar(50) primary key,
TenNCC varchar(50),
DiaChi varchar(50)
);

create table DonDH(
SoDH varchar(20) primary key,
NgayDH datetime,
MaNCC varchar(20),
foreign key (MaNCC) references NhaCC(MaNCC)
);

create table SDT(
ID_SDT int primary key,
MaNCC varchar(20),
foreign key (MaNCC) references NhaCC(MaNCC)
);

create table CTPN(
SoPN varchar(20),
MaVTU varchar(20),
DGNhap varchar(20),
SLNhap int,
primary key(SoPN,MaVTU),
foreign key (SoPN) references PhieuNhap(SoPN),
foreign key (MaVTU) references VatTu(MaVTU)
);

create table CTPX(
SoPX varchar(20),
MaVTU varchar(20),
DGXuat varchar(20),
SLXuat int,
primary key(SoPX,MaVTU),
foreign key (SoPX) references PhieuXuat(SoPX),
foreign key (MaVTU) references VatTu(MaVTU)
);
create table CTDDH(
MaVTU varchar(20),
SoDH varchar(20),
primary key (MaVTU,SoDH),
foreign key (MaVTU) references VatTu(MaVTU),
foreign key (SoDH) references DonDH(SoDH)
);





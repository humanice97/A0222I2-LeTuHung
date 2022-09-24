create database exam;
use exam;


create table trang_thai(
id_trang_thai int primary key ,
ten_trang_thai varchar(120)
);

create table loai_mat_bang(
id_loai_mat_bang int primary key,
ten_loai_mat_bang varchar(120)
);

create table mat_bang(
ma_mat_bang int auto_increment primary key,
dien_tich int,
ma_trang_thai int,
tang int,
ma_loai_mat_bang int,
gia_cho_thue int ,
ngay_bat_dau date,
ngay_ket_thuc date,
foreign key (ma_trang_thai) references trang_thai(id_trang_thai),
foreign key (ma_loai_mat_bang) references loai_mat_bang(id_loai_mat_bang)
);




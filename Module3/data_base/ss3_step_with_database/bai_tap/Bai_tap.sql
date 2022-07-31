
create database if not exists QuanLySinhVien;
use QuanLySinhVien;
create table Class(
ClassID int primary key auto_increment not null,
ClassName varchar(50) not null,
StartDate datetime not null,
`Status` bit
);

create table Student(
StudentId int primary key auto_increment not null,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
`Status` bit,
ClassID int not null,
foreign key (ClassID) references Class(ClassID)
);

create table `Subject`(
SubID int not null auto_increment primary key,
SubName varchar(50) not null,
Credit tinyint not null default 1 check (Credit >=1),
`Status` bit default 1
);

create table Mark(
MarkID int not null auto_increment primary key,
SubID int not null,
StudentID int not null,
Mark float default 0 check (Mark between 0 and 100),
ExamTimes tinyint default 1,
unique (SubID, StudentID),
foreign key (SubID) references `Subject` (SubID),
foreign key (StudentID) references Student (StudentID)
);

insert into Class 
values (1,'A1','2008-12-20',1);
insert into Class 
values (2,'A2','2008-12-20',1);
insert into Class 
values (3,'A3',current_date,0);

INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       

INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);



-- 1 Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from Student
where StudentName like 'H%';

-- 2 Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.

select * from Class
where month(StartDate) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.

select * from Subject
where Credit between 3 and 5;


-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.

update Student 
set ClassID = 2 
where StudentName = 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
--  nếu trùng sắp theo tên tăng dần.

select s.StudentName,sj.SubName, m.Mark
from Student s 
inner join Mark m on s.StudentId = m.StudentID
inner join Subject sj on sj.SubID = m.SubID
order by Mark desc , StudentName;





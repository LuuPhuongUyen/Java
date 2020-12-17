Create database MagazineDb
Use MagazineDb
Create table Magazine (MaID varchar(4) primary key not null, 
MagazineTittle nvarchar (30) NOT NULL, 
Publisher nvarchar (20) NOT NULL,
Price float not null)
Insert into Magazine (MaID, MagazineTittle, Publisher, Price)
Values
('M001','Desktop Java Application', 'IT House', 12.5),
('M002','Web programming with JSP', 'Youth', 8.9)

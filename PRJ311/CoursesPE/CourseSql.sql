Create database PRJ311
Use PRJ311
Create table Courses (CourseID varchar(5) primary key not null, 
Subjects nvarchar (30) NOT NULL, 
LectureName nvarchar (20) NOT NULL,
StartDate datetime not null)
Insert into Courses (CourseID, Subjects, LectureName, StartDate)
Values
('C001M','Desktop Java Application', 'Nguyen Phong Son', '2020-09-12'),
('C002A','Web programming with JSP', 'Doan Duy Binh', '2020-09-10')
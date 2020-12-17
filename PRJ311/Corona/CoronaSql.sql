Create database Corona
Use Corona
Create table InfectedCountry(CountryID varchar(3) primary key not null, 
CountryName nvarchar (20) NOT NULL, 
NumOfInfected int not null,
NumOfDead int not null)
Insert into InfectedCountry(CountryID, CountryName, NumOfInfected, NumOfDead)
Values
('KR','Korea', 3526, 17),
('VN','Viet Nam', 16, 0),
('CN','China', 80151, 2944),
('JP','Japan', 283, 6)

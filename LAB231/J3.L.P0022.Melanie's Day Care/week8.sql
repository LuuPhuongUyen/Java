CREATE DATABASE [J3.L.P0022]
GO
USE  [J3.L.P0022]
GO
CREATE TABLE [Home](
	[content] [nvarchar](200) NULL,
	[imgsrc] [nvarchar](200) NULL
)
GO
Insert into [Home]([content] ,[imgsrc])
VALUES
('Lorem ipsum dolor sit amet',N'./Images/i281756464666921188._szw1280h1280_.jpg')
GO
CREATE TABLE Info([id] [int] NOT NULL,[Title] [nvarchar](200) NULL, [Content][nvarchar](2000) NULL)
GO
INSERT INTO Info([id], [Title], [Content])
VALUES (1,'About me','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy 
nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, 
quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. 
Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, 
vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim .'),
(2,'Contact','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, 
vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim')
GO
CREATE TABLE [AboutMe](
	[title] [nvarchar](80) NULL,
	[content] [nvarchar](3000) NULL,
	[imgsrc] [nvarchar](200) NULL)
GO
INSERT INTO [AboutMe]([title], [content],[imgsrc])
VALUES
('About me','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.
Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis 
nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate 
velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et
iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.
Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius.
Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. 
Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. 
Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.',N'./Images/i281756464666921266._szw480h1280_.jpg')

GO
CREATE TABLE [PhotoAlbum](
	[id] [int] NOT NULL,
	[imgSrc] [nvarchar](300) NULL)
GO
INSERT INTO [PhotoAlbum]([id],[imgSrc])
VALUES
(1,N'./Images/i281756464682242456._rsw360h270_szw360h270_.jpg'),
(2,N'./Images/i281756464682242458._rsw360h270_szw360h270_.jpg'),
(3,N'./Images/i281756464682242461._rsw360h270_szw360h270_.jpg'),
(4,N'./Images/i281756464682242464._rsw360h270_szw360h270_.jpg'),
(5,N'./Images/i281756464682242466._rsw360h270_szw360h270_.jpg'),
(6,N'./Images/i281756464682242467._rsw360h270_szw360h270_.jpg'),
(7,N'./Images/i281756464682242469._rsw360h270_szw360h270_.jpg'),
(8,N'./Images/i281756464682242470._rsw360h270_szw360h270_.jpg')
GO
CREATE TABLE [ContactUs](
	[address] [nvarchar](200) NULL,
	[city] [nvarchar](200) NULL,
	[country] [nvarchar](200) NULL,
	[phone] [nvarchar](200) NULL,
	[email] [nvarchar](50) NULL
) ON [PRIMARY]
 
GO
INSERT INTO [ContactUs]([address], [city], [country], [phone], [email])
VALUES (N'123 Hoà Hải',N'Đà Nẵng' , N'Việt Nam','0901898989', N'FPTU@your-email.com')
GO
CREATE TABLE [Message](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[message] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Message] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Message] ON
go
INSERT into [Message] ([id],[name], [email], [message]) VALUES ( 1,N'NO', N'FPT@gmail.com', N'ABC')
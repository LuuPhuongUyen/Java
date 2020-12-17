Create database [J3.L.P0027]
go
use [J3.L.P0027]
go
CREATE TABLE [Home](
	[id] [int] NOT NULL,
	[title] [nvarchar](300) NULL,
	[content] [nvarchar](2000) NULL,
	[imgsrc] [nvarchar](200) NULL
)
GO
Insert into [Home]([id] ,[title],[content] ,[imgsrc])
VALUES (1,'Our school','Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.',
 N'./Images/i285415639381953156._szw1280h1280_.jpg'),
 (2,'We help children to get an education','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.
Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro.
Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.',
N'./Images/i285415639381953158._szw480h1280_.jpg')
GO
CREATE TABLE [LatestNews](
	[id] [int] NOT NULL,
	[title] [nvarchar](80) NULL,
	[DateAdd][date] NULL,
	[content] [nvarchar](900) NULL)
Insert into [LatestNews]([id] ,[title],[DateAdd],[content] )
VALUES 
(1,'Ullamcorper suscipit lobortis',CAST('2017-10-29' AS DATE),'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.'),
(2,'Aliquip ex ea commodo',CAST('2017-09-08' AS DATE), 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.')
GO
CREATE TABLE [About](
	[title] [nvarchar](80) NULL,
	[content] [nvarchar](2000) NULL,
	[imgsrc] [nvarchar](200) NULL)
GO
INSERT INTO [About]([title], [content],[imgsrc])
VALUES
('About Our School', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. 
Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum.
Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.',N'./Images/i285415639381953159._szw480h1280_.jpg'),
('Volunteers', 'Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum.', '')
GO
CREATE TABLE [PhotoAlbum](
	[id] [int] NOT NULL,
	[imgSrc] [nvarchar](300) NULL)
GO
INSERT INTO [PhotoAlbum]([id],[imgSrc])
VALUES
(1,N'./Images/i285415639381953161._szw360h1280_.jpg'),
(2,N'./Images/i285415639381953164._szw360h1280_.jpg'),
(3,N'./Images/i285415639381953166._szw360h1280_.jpg'),
(4,N'./Images/i285415639381953167._szw360h1280_.jpg'),
(5,N'./Images/i285415639381953169._szw360h1280_.jpg'),
(6,N'./Images/i285415639381953172._szw360h1280_.jpg'),
(7,N'./Images/i285415639381953174._szw360h1280_.jpg'),
(8,N'./Images/i285415639381953177._szw360h1280_.jpg')
GO
CREATE TABLE [HowToHelp](
	[title] [nvarchar](80) NULL,
	[content] [nvarchar](900) NULL,
	[imgsrc] [nvarchar](200) NULL)
GO
INSERT INTO [HowToHelp]([title], [content], [imgsrc])
VALUES
('Thank you for your interest in helping our school', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat',
N'./Images/i285415639381953180._szw480h1280_.jpg')
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
INSERT into [Message] ([name], [email], [message]) VALUES ( N'NO', N'FPT@gmail.com', N'ABC')
INSERT [Message] ([name], [email], [message]) VALUES (N'                                                  ', N'jmthuong97@gma.com', N'                                        ')
                   
SET IDENTITY_INSERT [dbo].[Message] OFF

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

   

/****** Object:  Database [J3.L.P0021]    Script Date: 14/10/2020 1:05:36 PM Luu Phuong Uyen ******/
CREATE DATABASE [J3.L.P0021]
GO
USE [J3.L.P0021]
GO
CREATE TABLE [WishList]([id] [int] NOT NULL,
						[content] [nvarchar](80) NULL, PRIMARY KEY CLUSTERED ([id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [WishList]([id],[content])
VALUES
(1, N'Claritas est etiam processus (www.weddingshop.com)'),
(2, N'Eodem modo typi nobis videntur parum'),
(3, N'Duis autem vel eum iriure dolor'),
(4, N'A house in front of Vinpearl Land')
GO
CREATE TABLE [PhotoPage]([id] [int] NOT NULL, 
				[imgSrc] [nvarchar](300) NULL,PRIMARY KEY CLUSTERED ([id] ASC)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [PhotoPage] ([id], [imgSrc])
VALUES
(9, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602133._rsw360h270_szw360h270_.jpg'),
(10, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602124._rsw360h270_szw360h270_.jpg'),
(11, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602132._rsw360h270_szw360h270_.jpg'),
(12, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602127._rsw360h270_szw360h270_.jpg'),
(13, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602136._rsw360h270_szw360h270_.jpg'),
(14, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602131._rsw360h270_szw360h270_.jpg'),
(15, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602093._rsw360h270_szw360h270_.jpg'),
(16, N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602125._rsw360h270_szw360h270_.jpg')
GO
CREATE TABLE [PartyAddress]([addressValue] [nvarchar](200) NULL,
							[email] [nvarchar](50) NULL) ON [PRIMARY]
GO
INSERT INTO [PartyAddress] ([addressValue], [email]) 
VALUES (N'FPT University - Hoa Hai, Ngu Hanh Son, Da Nang', N'uyenlpde140095@fpt.edu.vn')
GO
CREATE TABLE [HienThi]([id] [int] NOT NULL,
			[title] [nvarchar](80) NULL,
			[content] [nvarchar](500) NULL,
			[imgsrc] [nvarchar](200) NULL,
			[DateAdded] [date] NULL,
			[typeOf] [int] NULL, PRIMARY KEY CLUSTERED ([id] ASC)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [HienThi] ([id], [title], [content], [imgsrc], [DateAdded], [typeOf])
VALUES
(1, N'Photo', N'Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'./Wedding Blog - www.simplesite.com_us-123wedding_files/i282319414620601978._szw1280h1280_.jpg', CAST(N'2012-11-23' AS Date), 1),
(3, N'Dont Go Far Off', N'<p>Dont go far off, not even for a day', N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602136._rsw360h270_szw360h270_.jpg', CAST(N'2012-11-10' AS Date), 2),
(4, N'Dolore magna aliquam', N'I would miss you a lot', N'./Wedding Blog - www.simplesite.com_us-123wedding_files/i282319414620602005._szw480h1280_.jpg', CAST(N'2012-11-18' AS Date), 3),
(5, N'Quote', N'Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'./Photo Album - www.simplesite.com_us-123wedding_files/i282319414620602093._rsw360h270_szw360h270_.jpg', CAST(N'2012-11-20' AS Date), 4)
GO
CREATE TABLE [Guestbook]([id] [int] NOT NULL,
			[name] [nvarchar](100) NULL,
			[email] [nvarchar](100) NULL,
			[website] [nvarchar](100) NULL,
			[imgLink] [nvarchar](200) NULL,
			[dateAdded] [date] NULL,
			[content] [nvarchar](200) NULL, PRIMARY KEY CLUSTERED ([id] ASC)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [Guestbook] ([id], [name], [email], [website], [imgLink], [dateAdded], [content]) 
VALUES 
(2, N'Charlotte Robert', N'Robert@gmail.com', N'www.handsome.com', N'//sp.simplesite.com/7a/e3/s7ae3b6c800a342ed95b955bd73ab42db.jpg', CAST(N'2015-10-27' AS Date), N'Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est not'),
(3, N'André Martin', N'AndrEMartin@gmail.com', N'www.simplesite.com/us-123wedding/146239002', N'//sp.simplesite.com/a4/27/sa427cf2c94424b9cbd3c0f644a0f589e.jpg', CAST(N'2020-04-02' AS Date), N'Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.')
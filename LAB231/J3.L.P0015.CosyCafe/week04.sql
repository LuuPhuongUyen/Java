/****** Object:  Database [J3LP0015]    Script Date: 07/10/2020 1:05:36 PM Luu Phuong Uyen ******/
CREATE DATABASE [J3.L.P0015]
GO
USE [J3.L.P0015]
GO
CREATE TABLE [Article]([id] [int] NOT NULL,
			[type] [int] NOT NULL,
			[title] [nchar](250) NOT NULL,
			[content] [nvarchar](max) NOT NULL,
			[image] [nchar](250) NOT NULL,
			[date] [date] NOT NULL, CONSTRAINT [PK_Article] PRIMARY KEY CLUSTERED 
([id] ASC)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT INTO [Article]([id], [type], [title], [content], [image], [date])
VALUES
(1, 1, N'Maria''s Cosy Cafe', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica', N'2.jpg', CAST(N'1998-03-20' AS Date)),
(2, 2, N'Maria''s Cosy Cafe', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica', N'4.jpg', CAST(N'2019-03-20' AS Date)),
(3, 2, N'Maria''s Cosy Cafe', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica', N'3.jpg', CAST(N'2019-03-19' AS Date)),
(4, 2, N'Hello world',  N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica', N'3.jpg', CAST(N'2019-03-18' AS Date)),
(5, 3, N'About my Cakes', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', N'5.jpg', CAST(N'2019-03-20' AS Date))
GO
CREATE TABLE [Contact]([id] [int] NOT NULL,
			[type] [nchar](250) NOT NULL,
			[key] [nvarchar](250) NULL,
			[value] [nvarchar](250) NULL,CONSTRAINT [PK_Contact] PRIMARY KEY CLUSTERED 
([id] ASC)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [Contact]([id], [type], [key], [value])
VALUES
(1, N'adress', N'', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.Gammel Torv, Copenhagen'),
(2, N'phone', N'Phone', N'123456'),  
(3, N'email', N'Email', N'thaycacac@gmail.com'),
(4, N'work', N'Monday', N'Close'),
(5, N'work ', N'Tuesday - Friday', N'10:00 - 20:00'),
(6, N'work', N'Saturday and sunday', N'11:00 - 21:00')
GO
CREATE TABLE [TypeArticle]([id] [int] NOT NULL,
			[name] [varchar](250) NOT NULL, CONSTRAINT [PK_TypeArticle] PRIMARY KEY CLUSTERED 
([id] ASC)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]
GO
INSERT INTO [TypeArticle]([id],[name])
VALUES
(1, N'introduction'),
(2, N'article'),
(3, N'about')
/****** Object:  Database [J3.L.P0004]    Script Date: 30/09/2020 15:40:02 Luu Phuong Uyen ******/
CREATE DATABASE [J3.L.P0004]
GO
USE [J3.L.P0004]
GO
CREATE TABLE [Article]([id] [int] NOT NULL,
						[title] [nvarchar](255) NOT NULL,
						[image] [varchar](255) NOT NULL,
						[content] [nvarchar](max) NOT NULL,
						[date] [datetime] NOT NULL,
						[author] [nvarchar](255) NOT NULL,CONSTRAINT [PK_Article] PRIMARY KEY CLUSTERED
([id] ASC)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON,
ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT INTO [Article]( [id], [title], [image], [content], [date], [author])
VALUES
(111, N'Making security feeds smarter via
machine learning', N'./public/image/i1.jpg', N'Contrary to popular belief, Lorem Ipsum is not simply random text. It has
roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin
professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a
Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.
Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and
Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The
first line of Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes from a line in section 1.10.32. The standard chunk of
Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de
Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form, accompanied by English
versions from the 1914 translation by H. Rackham.', CAST(N'2020-01-15 02:20:00.000' AS DateTime), N'Web Author'),
(222, N'Lorem Ipsum is simply dummy
text of the printing and typesetting industry. ', N'./public/image/i2.jpg', N'Contrary to popular belief, Lorem Ipsum is not
simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard
McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words,
consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the
undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The
Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular
during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes from a line in section
1.10.32.
The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and
1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form, accompanied
by English versions from the 1914 translation by H. Rackham.', CAST(N'2020-01-14 00:00:00.000' AS DateTime), N'Web
Author'),
(333, N'Elevenia tawark an laynan
Mokado', N'./public/image/i3.jpg', N'There are many variations of passages of Lorem Ipsum available, but the majority
have suffered alteration in some form, by injected humour, or randomised words which don''t look even slightly
believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn''t anything embarrassing
hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as
necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined
with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem
Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.', CAST(N'2020-01-13 00:00:00.000' AS
DateTime), N'H. Rackham'),
(444, N'news was successfully deployed in
1,231 milliseconds.', N'./public/image/i4.jpg', N'The web application [/J3LP0004-digital_news] registered the JDBC driver
[com.microsoft.sqlserver.jdbc.SQLServerDriver] but failed to unregister it when the web application was stopped. To
prevent a memory leak, the JDBC Driver has been forcibly unregistered.', CAST(N'2020-01-12 00:00:00.000' AS
DateTime), N'Web Author'),
(555, N'Visiting unvisited references',
N'./public/image/i5.jpg', N'making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney
College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going
through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from
sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in
45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum,
"Lorem ipsum dolor sit amet..", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the
1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by
Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H.
Rackham.', CAST(N'2020-01-11 00:00:00.000' AS DateTime), N'Web Author')

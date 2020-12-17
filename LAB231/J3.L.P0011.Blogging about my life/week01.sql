USE [master]
GO
/****** Object:  Database [J3.L.P0011]    Script Date: 16/09/2020 7:07:24 AM ******/
CREATE DATABASE [J3.L.P0011]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'J3.L.P0011', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\J3.L.P0011.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'J3.L.P0011_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\J3.L.P0011_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [J3.L.P0011] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [J3.L.P0011].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [J3.L.P0011] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [J3.L.P0011] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [J3.L.P0011] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [J3.L.P0011] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [J3.L.P0011] SET ARITHABORT OFF 
GO
ALTER DATABASE [J3.L.P0011] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [J3.L.P0011] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [J3.L.P0011] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [J3.L.P0011] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [J3.L.P0011] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [J3.L.P0011] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [J3.L.P0011] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [J3.L.P0011] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [J3.L.P0011] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [J3.L.P0011] SET  DISABLE_BROKER 
GO
ALTER DATABASE [J3.L.P0011] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [J3.L.P0011] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [J3.L.P0011] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [J3.L.P0011] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [J3.L.P0011] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [J3.L.P0011] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [J3.L.P0011] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [J3.L.P0011] SET RECOVERY FULL 
GO
ALTER DATABASE [J3.L.P0011] SET  MULTI_USER 
GO
ALTER DATABASE [J3.L.P0011] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [J3.L.P0011] SET DB_CHAINING OFF 
GO
ALTER DATABASE [J3.L.P0011] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [J3.L.P0011] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [J3.L.P0011] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'J3.L.P0011', N'ON'
GO
USE [J3.L.P0011]
GO
/****** Object:  Table [dbo].[aboutMe]    Script Date: 16/09/2020 7:07:25 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[aboutMe](
	[detail] [nvarchar](50) NULL,
	[name] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[blog]    Script Date: 16/09/2020 7:07:25 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[blog](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[image] [nvarchar](max) NULL,
	[detail] [nvarchar](max) NULL,
	[date] [date] NULL,
	[type] [nvarchar](50) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
INSERT [dbo].[aboutMe] ([detail], [name]) VALUES (N'Madison Blackstone is a director. ', N'Peter Son')
INSERT [dbo].[aboutMe] ([detail], [name]) VALUES (N'Vivian Tran is a student. ', N'Vivian Tran')
INSERT [dbo].[aboutMe] ([detail], [name]) VALUES (N'Linh Lan is a manager. ', N'Lan Nguyen')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
USE [master]
GO
ALTER DATABASE [J3.L.P0011] SET  READ_WRITE 
GO
0011'
Đã copy
3.35 m
Đã copy
Tỷ giá bởi www.vietcombank.com.vn
Thêm ngoại tệ khác
Chức năng này sẽ tiếp tục cập nhật bạn nhé, hy vọng bạn cảm thấy hài lòng
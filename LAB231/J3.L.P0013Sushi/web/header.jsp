<%-- 
    Document   : header
    Created on : Sep 23, 2020, 3:31:10 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header">
            <h1>The SuShi Restaurant</h1>
            <span>Welcome to this website</span>
        </div> <div class="menu">
            <a class="${active == 'HomeColor' ? 'setBold' : ''}" href="HomeController">Home</a>
            <a class="${active == 'MenuColor' ? 'setBold' : ''}" href="MenuController">Menu and Price list</a>
            <a class="${active == 'FindUsColor' ? 'setBold' : ''}" href="InfoController">Find us</a>
        </div>
    </body>
</html>

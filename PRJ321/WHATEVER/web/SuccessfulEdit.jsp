<%-- 
    Document   : successfulPage
    Created on : Jul 22, 2020, 7:10:42 PM
    Author     : Hoang My
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WHATEVER</title>
        <link rel="icon" type="image/gif/png" href="images/icon.PNG">
        <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
        <title>Read Book Online</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/styleSuccesfulPage.css">

    </head>
    <body>
        <div class="header">
            <jsp:include page="header.jsp"/>
        </div>
    <center>
        <div class="card">
            <div style="border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;">
                <i class="checkmark" style="color: #9ABC66;">✓</i>
            </div>
            <h1 style="color: #88B04B;">Successful</h1>
            <p >User has been edit</p>
            <a href="home.jsp"><input type="submit" value="View"> </a>
        </div> 
    </center>

    <div class="footer">
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>

<%-- 
    Document   : searchBook
    Created on : Jul 13, 2020, 8:27:27 PM
    Author     : PC
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="java.util.List"%>
<%@page import="edu.fud.DAO.bookDAO"%>
<%@page import="edu.fud.model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WHATEVER</title>
        <link rel="icon" type="image/gif/png" href="images/icon.PNG">
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
    </head>
    <body>
        <div>
            <jsp:include page="header.jsp"/>
        </div>
    <center>
        <h3 style="color: red">No result</h3>
    </center>
    <div>
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>

<%-- 
    Document   : AddNewBook
    Created on : Jul 17, 2020, 8:27:14 AM
    Author     : PC
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Book</title>
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
        <link href="css/styleAddBook.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>     
        <div>
            <jsp:include page="header.jsp"/>
        </div> 
        <div class="addForm">
            <h2>Add New Book</h2>   
            <p style="color: red">${error}</p> 
            <center>
                <s:form action="addNewBook" method="post">
                    <s:textfield cssClass="input" label="BookID" name="BookID" /> 
                    <s:textfield cssClass="input" label="Title" name="Title" />
                    <s:textfield cssClass="input" label="Author" name="Author" />
                    <s:textfield cssClass="input" label="Publisher" name="Publisher" />
                    <s:textfield cssClass="input" label="Year" name="Year" />
                    <s:textfield cssClass="input" label="Category" name="Category" />
                    <s:textfield cssClass="input" label="Language" name="Language" />
                    <s:textfield cssClass="input" label="Preview" name="Preview" />
                    <s:textfield cssClass="input" label="Picture" name="Picture" />
                    <s:textfield cssClass="input" label="Content" name="Content" />
                    <s:submit cssClass="btnAddBook" value="Add" ></s:submit>                                       
                </s:form>
            </center>
        </div>
        <div>
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>

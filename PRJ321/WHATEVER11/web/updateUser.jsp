<%-- 
    Document   : updateUser
    Created on : Jul 22, 2020, 8:02:03 PM
    Author     : Hoang My
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User</title>
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
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div>
            <jsp:include page="header.jsp"/>
        </div>
    <center>
        <div class="container1">
            <form action="updateUserForm">
                <div class="row">
                    <div class="col-25">
                        <label for="userID;">User ID</label>
                    </div>
                    <div class="col-75">
                        <input type="text" value="${US.userID}" readonly name="userID">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="name">Name</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="name" value="${US.name}" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="userName">User Name</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="userName" value="${US.userName}"required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="email">Email</label>
                    </div>
                    <div class="col-75">
                        <input type="email" name="email" value="${US.email}"required>
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="userRight">User Right</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="userRight" value="${US.userRight}"required>
                    </div>   
                </div>
                <div class="row">
                    <input type="submit" value="Update" href="updateUserForm" > 
                </div>   
            </form>
        </div>
    </center>
    <div class="footer">
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>

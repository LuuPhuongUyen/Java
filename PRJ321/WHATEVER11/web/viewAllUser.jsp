<%-- 
    Document   : viewAllUser
    Created on : Jul 21, 2020, 7:44:32 PM
    Author     : Hoang My
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage User</title>
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
        <link rel="stylesheet" href="css/styleManage.css">
    </head>
    <body>
        <div>
            <jsp:include page="header.jsp"/>
        </div>
        <div class="manageTable">
            <form action="manageUserAction">
                <table  border="1">
                    <thead>
                        <tr>
                            <th>User ID</th>
                            <th>Name</th>
                            <th>User Name</th>
                            <th>Email</th>
                            <th>User Right</th>
                            <th colspan="2">Operation</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="U" items="${listAllUser}" >
                            <tr>
                                <td>${U.userID}</td>
                                <td>${U.name}</td>
                                <td>${U.userName}</td>
                                <td>${U.email}</td>
                                <td>${U.userRight}</td>
                                <td>                            
                                    <a href="updated?userID=${U.userID}">Update</a>
                                    <a href="deleted?userID=${U.userID}">Delete</a>
                                </td>
                            </tr>             
                        </c:forEach>
                    </tbody>
                </table>
            </form>
        </div>

        <div class="footer">
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>

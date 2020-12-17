<%-- 
    Document   : viewAllBook
    Created on : Jul 17, 2020, 3:29:29 PM
    Author     : Hoang My
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Book</title>
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
            <form action="manageBookAction">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Book ID</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Publisher</th>
                            <th>Year</th>
                            <th>Category</th>
                            <th>Language</th>

                            <th colspan="2">Operation</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="B" items="${listAllBook}" >
                            <tr>
                                <td>${B.bookID}</td>
                                <td>${B.title}</td>
                                <td>${B.author}</td>
                                <td>${B.publisher}</td>
                                <td>${B.year}</td>
                                <td>${B.category}</td>
                                <td>${B.language}</td>
                                <td>                                                             
                                    <a href="update?bookID=${B.bookID}">Update</a>
                                    <a href="delete?bookID=${B.bookID}">Delete</a>
                                </td>
                            </tr>             
                        </c:forEach>
                    </tbody>
                </table>
            </form>

        </div>
    <center>
        <div>
            <a href="AddNewBook.jsp"><input type="button" value="ADD" class="addButton"></a>
        </div>
    </center>
    <div class="footer">
        <jsp:include page="footer.jsp"/>
    </div>
</body>

</html>

<%-- 
    Document   : updateBook
    Created on : Jul 21, 2020, 9:30:27 PM
    Author     : Hoang My
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Book</title>
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
            <form action="updateBookForm">
                <div class="row">
                    <div class="col-25">
                        <label for="bookID">Book ID</label>
                    </div>
                    <div class="col-75">
                        <input type="text" value="${bo.bookID}" readonly name="bookID" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="title">Title</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="title" value="${bo.title}" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="author">Author</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="author" value="${bo.author}" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="publisher">Publisher</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="publisher" value="${bo.publisher}"required>
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="year">Year</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="year" value="${bo.year}"required>
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="category">Category</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="category" value="${bo.category}" required>
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="language">Language</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="language" value="${bo.language}"required>
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="preview">Preview</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="preview" value="${bo.preview}">
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="picture">Picture</label>
                    </div>
                    <div class="col-75">
                        <input type="url" name="picture" value="${bo.picture}">
                    </div>   
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="content">Content</label>
                    </div>
                    <div class="col-75">
                        <input type="url" name="content" value="${bo.content}">
                    </div>   
                </div>
                <div class="row">
                    <input type="submit" value="Update" href="updateBookForm" > 
                </div>   
    </form>

</div>
</center>

<div class="footer">
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>

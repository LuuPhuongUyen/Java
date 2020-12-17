<%-- 
    Document   : detailsPost
    Created on : Sep 23, 2020, 3:20:05 PM
    Author     : PC
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="icon" type="image/gif/png" href="image/sushi.PNG">
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <link href="css/detail.css" rel="stylesheet" type="text/css"/>
        <link href="css/container.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <jsp:include page="header.jsp"/>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <div class="details">
                            <span>${content.getTitle()}</span>
                            <div class="post">
                                <div class="left-post">
                                    <img src="${content.getImgLink()}" alt="">
                                </div>
                                <div class="right-post">
                                    <p>${content.getFullContent()}</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <jsp:include page="container.jsp"/>
                </div>
                <jsp:include page="footer.jsp"/>
            </div>
        </div>
    </body>
</html>

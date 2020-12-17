<%-- 
    Document   : error
    Created on : Sep 23, 2020, 3:34:18 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link rel="icon" type="image/gif/png" href="image/sushi.PNG">
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="wrap">
            <jsp:include page="header.jsp"/>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <h3>Error!! Please click <a href="HomeController">here</a> to go back home page.</h3>
                    </div>
                    <div>
                        <jsp:include page="container.jsp"/>
                    </div>
                    <div class="footer">
                        <a href="#">The Sushi Restaurant</a>
                        <span>0 2 5 4 7 3</span> 
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

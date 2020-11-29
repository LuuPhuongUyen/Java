<%-- 
    Document   : home.jsp
    Created on : Sep 23, 2020, 4:22:09 PM
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
        <link href="css/container.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <jsp:include page="header.jsp"/>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <div class="img-border">
                            <img src="image/19657434_1899909526926678_1129520503603659229_n.jpg" alt=""/>
                        </div>
                        <c:if test="${not empty noContent}">
                            <h3>${noContent}</h3>
                        </c:if>
                        <c:if test="${empty noContent}">
                            <c:forEach var="i" items="${content}">
                                <div class="border-post">
                                    <span><a href="DetailsPost?id=${i.getId()}">${i.getTitle()}</a></span>
                                    <div class="post">
                                        <div class="left-post">
                                            <a href="DetailsPost?id=${i.getId()}"><img src="${i.getImgLink()}" alt=""></a>
                                        </div>
                                        <div class="right-post">
                                            <p>${i.getContent()}</p>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </c:if>
                        <div class="paging">
                            <c:forEach var="j" begin="1" step="1" end="${totalPage}">
                            </div>
                            <c:if test="${page != j}">
                                <a href="HomeController?page=${j}">${j}</a> |
                            </c:if>
                            <c:if test="${page == j}">${j} |</c:if>
                        </c:forEach> 
                    </div>
                </div>
                <jsp:include page="container.jsp"/>
            </div>
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>

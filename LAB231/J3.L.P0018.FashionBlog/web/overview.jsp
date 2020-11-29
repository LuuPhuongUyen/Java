<%-- 
    Document   : menu
    Created on : May 23, 2018, 11:44:15 AM
    Author     : thuongnnse05095
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body onload="setGroupMonth()">
        <div id="menu" data-page="Home"></div>
        <div class="wrap">
            <%@include file="header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <form action="getOverview">
                            <c:forEach var="ls" items="${lsOverview}">
                                <div id="groupMonth" class="header-table" data-date="${ls.getCreateDate()}">
                                    <h3>${ls.getTitleGroup()}</h3>
                                    <span class="float-right">Date</span>
                                </div>
                                <div class="menu-container">
                                    <div class="title">
                                        <a href="getDetail?id=${ls.getId()}"><span>${ls.getTitle()}</span></a>
                                    </div>
                                    <div class="like">
                                        <span>${ls.getLike()}</span>
                                    </div>
                                    <div class="comment">
                                        <span>${ls.getComment()}</span>
                                    </div>
                                    <div class="date">
                                        <span>${ls.getCreateDate()}</span>
                                    </div>
                                </div>
                            </c:forEach>
                        </form>
                        <div class="overview">
                            <a href="getOverview">Overview</a>
                        </div>

                        <div class="paging">
                            <c:forEach var="j" begin="1" step="1" end="${totalPage}">
                                <c:if test="${page != j}">
                                    <span class="canSelect"><a href="OverviewController?page=${j}" >${j}</a></span> |
                                    </c:if>
                                    <c:if test="${page == j}">
                                    <span class="notSelect">${j}</span> |
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                    <%@include file="container.jsp" %>
                </div>
                <%@include file="footer.jsp" %>
            </div>
        </div>
        <script src="js/menu.js"></script>
        <script src="js/overview.js"></script>
    </body>
</html>

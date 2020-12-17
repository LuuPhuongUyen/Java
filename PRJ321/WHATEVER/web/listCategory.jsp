<%-- 
    Document   : listCategory
    Created on : Jul 21, 2020, 12:50:55 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WHATEVER</title>
    </head>
    <body>
        <ul>
            <c:forEach var="string" items="${listCategory}">
                <li>
                    <s:a action="searchByCategory">${string}
                        <s:param name="category">${string}</s:param>
                            <span class="fa fa-chevron-right"></span>
                    </s:a>
                </li>     
            </c:forEach>
        </ul>
    </body>
</html>

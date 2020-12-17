<%-- 
    Document   : coreTagDemo
    Created on : Jun 2, 2020, 1:25:02 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CoreTagDemo</title>
    </head>
    <body>
        <form>
            Number:
            <input type="text" name="num" value ="${param.num}"/> <br>
            <c:choose>
                <c:when test="${param.num==2}"><p>MON</p></c:when>
                <c:when test="${param.num==3}"><p>TUE</p></c:when>
                <c:when test="${param.num==4}"><p>WED</p></c:when>
                <c:when test="${param.num==5}"><p>THU</p></c:when>
                <c:when test="${param.num==6}"><p>FRI</p></c:when>
                <c:when test="${param.num==7}"><p>SAT</p></c:when>
                <c:when test="${param.num==1}"><p>SUN</p></c:when>
            </c:choose>
            <input type="submit" value="Test"/>
        </form>  
    </body>
</html>

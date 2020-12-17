<%-- 
    Document   : hienthi
    Created on : Jun 23, 2020, 1:48:46 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><font color="green">Hiển thị danh sách sản phẩm</font></h1>
            <c:forEach var="sp" items="${ls}">
            Mã sản phẩm: ${sp.maSp} <br/>
            Tên sản phẩm: ${sp.tenSp} <br/>
            Giá: ${sp.gia} <br/>
            ========================================<br/>
        </c:forEach>
    </body>
</html>

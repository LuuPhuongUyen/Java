<%-- 
    Document   : hello
    Created on : Jun 23, 2020, 1:38:19 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><font color="red">Hello World!</font></h1>
        <h1><font color="green">Thông tin sản phẩm!</font></h1>
        Mã sản phẩm: ${sp.maSp} <br/>
        Tên sản phẩm: ${sp.tenSp} <br/>
        Giá: ${sp.gia} <br/>
    </body>
</html>

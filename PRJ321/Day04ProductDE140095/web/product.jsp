<%-- 
    Document   : products
    Created on : Jun 9, 2020, 3:28:02 PM
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
        <form action="controller">
            ProductID: <input type="text" name="txtId" value="${param.txtId}" /><br>
            ProductName: <input type="text" name="txtName" value="${param.txtName}" /><br>
            Unit: <input type="text" name="txtUnit" value="${param.txtUnit}" /><br>
            Price: <input type="number" name="txtPrice" value="${param.txtPrice}" /><br>
            <input type="submit" name="action" value="Add"/>
        </form>
    </body>
</html>

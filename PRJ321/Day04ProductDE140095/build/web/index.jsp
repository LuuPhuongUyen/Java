<%-- 
    Document   : index
    Created on : Jun 9, 2020, 1:20:48 PM
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="edu.fud.model.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All product</title>
    </head>
    <body>       
        <h1>All product</h1>
        <table border="1">
            <tr>
                <td>ProductId</td>
                <td>ProductName</td>
                <td>Unit</td>
                <td>Price</td>
            </tr>
            <%
                Product pList = new Product();
                List<Product> list = pList.getAll();
                for (Product sp : list) {
                    out.print("<tr>"
                            + "<td>" + sp.getProductID() + "</td>"
                            + "<td>" + sp.getProductName() + "</td>"
                            + "<td>" + sp.getUnit() + "</td>"
                            + "<td>" + sp.getPrice() + "</td>"
                            + "</tr>");
                }
            %>
        </table>
        <br>
        <input type="submit" value="Add new product" name="action" onClick="javascript:window.location = '<%= "product.jsp"%>';"/>  
        <%
            Integer hitsCount = (Integer) application.getAttribute("hitCounter");
            if (hitsCount == null || hitsCount == 0) {
                hitsCount = 1;
            } else {
                hitsCount += 1;
            }
            application.setAttribute("hitCounter", hitsCount);
        %>
    <center>
        <p>Total number of visits: <%= hitsCount%></p>
    </center>
</body>
</html>

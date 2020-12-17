<%-- 
    Document   : product
    Created on : May 26, 2020, 3:10:28 PM
    Author     : PC
--%>
<%@page import="java.util.List"%>
<%@page import="edu.fud.model.Product"%>
<%@page import="edu.fud.model.productDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <h1>Product!</h1>
        <table border="1">
            <tr>
                <td>Code</td>
                <td>Name</td>
                <td>Price</td>
            </tr>
            <%
                productDAO pList = new productDAO();
                List<Product> list = pList.showProduct("");
                for (Product sp : list) {
                    out.print("<tr>"
                            + "<td>" + sp.getCode() + "</td>"
                            + "<td>" + sp.getName() + "</td>"
                            + "<td>" + sp.getPrice() + "</td>"
                            + "</tr>");
                }
            %>
        </table>
    </body>
</html>

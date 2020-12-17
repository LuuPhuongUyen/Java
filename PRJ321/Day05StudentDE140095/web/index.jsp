<%-- 
    Document   : index
    Created on : Jun 16, 2020, 1:51:38 PM
    Author     : PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="edu.fud.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% ArrayList<Student> list = new Student().getAll(); %>
        <h1>List Student</h1>
        <table border="1" width="60%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>DOB</th>
                <th colspan="2"></th>
            </tr>
            <%
                for (Student sp : list) {
                    String updateURL = "update.jsp?id=" + sp.getID();
                    String deleteURL = "delete.jsp?id=" + sp.getID();
            %>
            <tr align="center">
                <td><%= sp.getID()%></td>
                <td><%=sp.getName()%></td>
                <td><%=(sp.isMale() == true ? "Male" : "Female")%></td>
                <td><%=sp.getDob()%></td>
                <td><a href="<%=updateURL%>">Update</a></td>
                <td><a href="<%=deleteURL%>">Delete</a></td>
            </tr>
            <%
                }
            %>
        </table>
        <br>
        <input type="submit" value="Create" name="action" onClick="javascript:window.location = '<%= "create.jsp"%>';"/>  
    </body>
</html>

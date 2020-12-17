<%-- 
    Document   : update
    Created on : Jun 16, 2020, 2:20:24 PM
    Author     : PC
--%>

<%@page import="edu.fud.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            Student sp = new Student().getStudent(id);
        %>
        <form id="newStudent" action="controller" method="POST">
            <h1>Update New Product</h1>
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="txtId" value="<%=sp.getID()%>"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="txtName" value="${param.txtName}"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="radio"  name="gender" value="true" <%=sp.isMale()?"checked":""%>/>
                        <label for="gender">Male</label>
                        <input type="radio"  name="gender" value="false"<%=!sp.isMale()?"checked":""%>/>
                        <label for="gender">Female</label><br></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="date" id="dob" name="dob" value="<%= sp.getDob().toString()%>"><br><br>
                        <input type="hidden" name="action" value="updateStudent">
                        <input type="submit" value="Update student"></td>
                </tr>
        </form>
    </body>
</html>

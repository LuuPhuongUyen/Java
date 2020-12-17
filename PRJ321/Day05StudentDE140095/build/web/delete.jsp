<%-- 
    Document   : delete
    Created on : Jun 20, 2020, 8:44:59 PM
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
            Student sp = new Student();
            sp.deleteStudent(id);
            response.sendRedirect("index.jsp");
        %>

    </body>
</html>

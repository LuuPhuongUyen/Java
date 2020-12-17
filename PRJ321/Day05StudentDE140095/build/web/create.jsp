<%-- 
    Document   : student
    Created on : Jun 16, 2020, 1:19:14 PM
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
        <form id="newStudent" action="controller" method="POST">
            Name: <input type="text" name="txtName" value="${param.txtName}" /><br>
            Gender:  
            <input type="radio" id="gender" name="gender" value="true">
            <label for="gender">Male</label>
            <input type="radio" id="gender" name="gender" value="false">
            <label for="gender">Female</label><br>
            DOB:  <input type="date" id="dob" name="dob"><br><br>
            <input type="hidden" name="action" value="addStudent">
            <input type="submit" value="Create">
        </form>
    </body>
</html>

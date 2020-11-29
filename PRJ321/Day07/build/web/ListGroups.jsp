<%-- 
    Document   : ListGroups
    Created on : Jul 14, 2020, 3:37:49 PM
    Author     : PC
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div class="addForm">
            <h1>List of Groups</h1>
            <table class="list">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Group Name</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="group" items="${dsn}">
                        <tr>
                            <td>${group.ID}</td>
                            <td>${group.groupname}</td>
                            <td>${group.description}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="AddGroup.jsp">
                <input class="btn" type="button" value="Add Group" />
            </a>
            <a href="list">
                <input class="btn" type="button" value="List Contact" />
            </a>
        </div>
    </center>
</body>
</html>

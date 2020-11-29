<%-- 
    Document   : ListContacts
    Created on : Jul 14, 2020, 1:57:02 PM
    Author     : PC
--%>
<%@page import="model.Contact"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
            <h1>List of Contacts</h1>
            <table class="list">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Group</th>
                        <th>Phone Number</th>
                        <th>Operations</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="con" items="${dsll}">
                        <tr>
                            <td>${con.id}</td>
                            <td>${con.firstname}</td>
                            <td>${con.lastName}</td>
                            <td>${con.groupName}</td>
                            <td>${con.phone}</td>
                            <td>
                                <a href="edit?id=${con.id}">Edit</a>
                                <a href="delete?id=${con.id}">Remove</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="AddContact.jsp">
                <input class="btn" type="button" value="Add Contact" />
            </a>
            <a href="listg">
                <input class="btn" type="button" value="List Group" />
            </a>
        </div>
    </center>
</body>
</html>

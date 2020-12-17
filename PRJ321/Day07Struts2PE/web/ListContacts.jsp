<%-- 
    Document   : ListContacts
    Created on : Jul 14, 2020, 1:57:02 PM
    Author     : PC
--%>
<%@page import="model.Contact"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Contacts</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Group</th>
                    <th>Phone</th>
                    <th colspan="2">Operations</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="con" items="${cList}">
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
            <input type="button" value="Add Contact" />
        </a>
        <a href="listg">
            <input type="button" value="List Group" />
        </a>
    </body>
</html>

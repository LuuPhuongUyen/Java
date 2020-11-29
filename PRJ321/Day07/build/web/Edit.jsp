<%-- 
    Document   : Edit
    Created on : Jul 14, 2020, 2:08:30 PM
    Author     : PC
--%>
<%@page import="controller.ListGroupsActionSupport"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
            <h1>Edit a Contact</h1>
            <p style="color: red">${error}</p>
            <form action="editsubmit">
                <table>
                    <tbody>
                        <tr>
                            <td>ID</td>
                            <td><input class="input" type="text" name="id" value="${co.id}" readonly/></td>
                        </tr>
                        <tr>
                            <td>First Name</td>
                            <td><input class="input" type="text" name="first" value="${co.firstname}" /></td>
                        </tr>
                        <tr>
                            <td>Last Name</td>
                            <td><input class="input" type="text" name="last" value="${co.lastName}" /></td>
                        </tr>
                        <tr>
                            <td>Group</td>
                            <td>
                                <select name="group">
                                    <c:forEach var="i" items="<%=ListGroupsActionSupport.dsn%>">    
                                        <option value="${i.ID}">${i.groupname}</option>
                                    </c:forEach>   
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Phone Number</td>
                            <td><input class="input" type="text" name="phone" value="${co.phone}" /></td>
                        </tr>
                    </tbody>
                </table>
                <input class="btn" type="submit" value="Edit"/>
                <a href="list">
                    <input class="btn" type="button" value="Return To Contact List" />
                </a>
            </form>
        </div>
    </center>
</body>
</html>

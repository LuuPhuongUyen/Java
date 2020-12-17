<%-- 
    Document   : addContact
    Created on : Jul 14, 2020, 2:06:55 PM
    Author     : PC
--%>
<%@page import="controller.ListGroupsActionSupport"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add a contact</h1>
        <h5 style="color: red">${error}</h5>
        <form action="add">
            <table border="1">
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fName" value="" require="true"/></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Group</td>
                        <td>
                            <select name="group">
                                <c:forEach var="i" items="<%=ListGroupsActionSupport.gList%>">    
                                    <option value="${i.ID}">${i.groupname}</option>
                                </c:forEach> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td><input type="text" name="phone" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <nav class="buttons">
                <input class="addbutton" type="submit" value="Add"/>
                <a class="listbutton" href="list">
                    <input type="button" value="Return To Contact List" />
                </a>
            </nav>
        </form>
    </body>
</html>

<%-- 
    Document   : addContact
    Created on : Jul 14, 2020, 2:06:55 PM
    Author     : PC
--%>
<%@page import="connection.DatabaseInfo"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.Contact"%>
<%@page import="controller.ListGroupsActionSupport"%>
<%@page import="model.Group"%>
<%@page import="java.util.List"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div class="addForm">
            <h1>Add a Contact</h1>
            <p style="color: red">${error}</p>     
            <form action="add">       
                <table>
                    <tbody>
                        <tr>
                            <td>First Name</td> 
                            <td><input class="input" type="text" name="first" value="" require="true"/></td>
                        </tr>
                        <tr>
                            <td>Last name</td> 
                            <td><input class="input" type="text" name="last" value="" /></td>
                        </tr>
                        <tr>
                            <td>Group</td> 
                            <td><select name="group">
                                    <c:forEach var="i" items="<%=ListGroupsActionSupport.dsn%>">    
                                        <option value="${i.ID}">${i.groupname}</option>
                                    </c:forEach> 
                                </select></td>                        </tr>

                        <tr>
                            <td>Phone Number</td> 
                            <td><input class="input" type="text" name="phone" value="" /></td>
                        </tr>
                    </tbody>
                </table>
                <nav class="buttons">
                    <input class="btn" type="submit" value="Add"/>
                    <a href="list">
                        <input class="btn" type="button" value="Return To Contact List" />
                    </a>
                </nav>
            </form>
        </div>
    </center>
</body>
</html>

<%-- 
    Document   : Add
    Created on : Jul 14, 2020, 3:17:24 PM
    Author     : Admin
--%>
<%@page import="edu.fud.controller.ListGroupActionSupport"%>
<%@page import="edu.fud.model.GroupInfo"%>
<%@page import="java.util.List"%>
<%@page import="edu.fud.dao.GroupDAO"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/struts2.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add a Contact</h1>
        <h5 style="color: red">${error}</h5>
        <form action="add">
            <table border="1">
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td>                
                            <input type="text" name="fir" value="" require="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td>
                            <input type="text" name="las" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Group</td>
                        <td>
                            <select name="group">
                                <c:forEach var="i" items="<%=ListGroupActionSupport.dsn%>">    
                                    <option value="${i.ID}">${i.groupname}</option>
                                </c:forEach> 
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td>
                            <input type="text" name="phone" value="" />
                        </td>
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

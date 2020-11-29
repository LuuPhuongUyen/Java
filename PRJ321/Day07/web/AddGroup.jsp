<%-- 
    Document   : AddGroup
    Created on : Jul 14, 2020, 3:47:37 PM
    Author     : PC
--%>

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
            <h1>Add a Group</h1>
            <h5 style="color: red">${errorg}</h5>
            <form action="addgroup">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Name</td>
                            <td>
                                <input class="input" type="text" name="Groupname" value="" />
                            </td>
                        </tr>
                        <tr>
                            <td>Description</td>
                            <td>
                                <input class="input" type="text" name="description" value="" />
                            </td>
                        </tr>
                    </tbody>
                </table>
                <input class="btn" type="submit" value="Add" />
                <a href="listg">
                    <input class="btn" type="button" value="Return To Group List" />
                </a>
            </form>
        </div>
    </center>
</body>
</html>

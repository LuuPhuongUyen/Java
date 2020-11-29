<%-- 
    Document   : All
    Created on : Jun 8, 2020, 10:12:00 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Load data</title>
    </head>
    <body>
        <form>
            UserName: <input type="text" name="txtUserName" value="" /><br>
            Password: <input type="password" name="txtPassword" value="" /><br>
            LastName: <input type="text" name="txtLastName" value="" /><br>
            <input type="submit" value="Insert" name="action"/>
            <input type="submit" value="Update" name="action"/>
        </form>
        <h1>Load data</h1>
        <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://localhost:1433;databaseName=Day03Users"
                           user="uyenlp" password="abcd"
                           var="con"/>
        <c:if test="${not empty param.txtUserName}">
            <sql:update dataSource="${con}">
                Insert into Users (UserName, [Password], LastName) values(?,?,?)
                <sql:param value="${param.txtUserName}"/>
                <sql:param value="${param.txtPassword}"/>
                <sql:param value="${param.txtLastName}"/>
            </sql:update>
        </c:if>
        <sql:query dataSource="${con}" var="rs">
            SELECT * FROM Users
        </sql:query>
        <table  border="1">
            <tr>
                <td>No.</td><td>UserName</td><td>Password</td><td>LastName</td>
            </tr>
            <c:set var="count" value="0"/>
            <c:forEach var="dong" items="${rs.rows}">
                <tr>
                    <c:set var="count" value="${count+1}"/>
                    <td>${count}</td>
                    <td>${dong.UserName}</td>
                    <td>${dong.Password}</td>
                    <td>${dong.LastName}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

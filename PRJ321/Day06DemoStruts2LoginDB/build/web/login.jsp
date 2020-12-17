<%-- 
    Document   : login
    Created on : Jun 23, 2020, 3:34:30 PM
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
        <h1>Login Struts 2</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username" value=""/></br>
            Password: <input type="password" name="password" value=""/></br>
            <input type="submit" value="Login" />
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>

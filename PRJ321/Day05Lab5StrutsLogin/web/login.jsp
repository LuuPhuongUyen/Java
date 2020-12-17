<%-- 
    Document   : login
    Created on : Jun 22, 2020, 8:31:05 PM
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
        <h1>LOGIN FORM!</h1>
        <form action="loginform.do" method="post">
            Username: <input type="text" name="uname" /></br>
            Password: <input type="password" name="pass" /></br>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>

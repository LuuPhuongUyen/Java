<%-- 
    Document   : HelloEL
    Created on : Jun 2, 2020, 1:00:50 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello EL</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <li>5 + 6 = ${5+6}</li>
            <li>5 - 6 = ${5-6}</li>
            <li>5 * 6 = ${5*6}</li>
            <li>5 / 6 = ${5/6}</li>
            <li>Name: ${param.name}</li>
            <li>Age: ${param.age}</li>
        </ul></body>
</html>

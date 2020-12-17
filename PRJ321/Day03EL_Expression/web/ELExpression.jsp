<%-- 
    Document   : ELExpression
    Created on : Jun 2, 2020, 1:28:51 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL Expression</title>
    </head>
    <body>
        <h1>EL Expression</h1>
        <table border="1">
            <tr>
                <td>Concept</td>
                <td>Expression</td>
                <td>Result</td>
            </tr>
            <tr>
                <td>Cộng</td>
                <td>${"${"}5+5}</td>
                <td>${5+5}</td>
            </tr>
            <tr>
                <td>Trừ</td>
                <td>${"${"}5-5}</td>
                <td>${5-5}</td>
            </tr>
            <tr>
                <td>Nhân</td>
                <td>${"${"}5*5}</td>
                <td>${5*5}</td>
            </tr>
            <tr>
                <td>Chia</td>
                <td>${"${"}5/5}</td>
                <td>${5/5}</td>
            </tr>
        </table>
    </body>
</html>

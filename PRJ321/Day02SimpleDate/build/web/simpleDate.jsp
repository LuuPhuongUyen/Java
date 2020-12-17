<%-- 
    Document   : simpleDate
    Created on : May 26, 2020, 1:11:58 PM
    Author     : PC
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple date</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% Date now =new Date(); %>
        <h1>Now: <%= now %> <h1/>
    </body>
</html>

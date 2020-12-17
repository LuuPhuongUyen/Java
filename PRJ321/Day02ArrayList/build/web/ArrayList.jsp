<%-- 
    Document   : ArrayList
    Created on : May 26, 2020, 1:32:02 PM
    Author     : PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArrayList</title>
    </head>
    <body>
        <h1>ArrayList!</h1>
        <%
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                al.add(i);
            }
            for (int i = 0; i < 10; i++) {
                out.print(al.get(i) + " ");
            }
        %>
    </body>
</html>

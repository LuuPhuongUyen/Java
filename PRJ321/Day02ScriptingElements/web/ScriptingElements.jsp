<%-- 
    Document   : ScriptingElements
    Created on : May 26, 2020, 1:24:40 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scripting Elements</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for (int i = 0; i < 5; i++) {
                out.print("<h4>" + i + "</h4>");
            }
            int result = add(5, 6);
            out.print("<p>Result: " + result + "<p>");
        %>
        <%= "Luu Phuong Uyen"%>
        <br><br>
        Logic expression: <%= 5 > 6%>
        <%!
            String name = "Uyen";

            int add(int a, int b) {
                return a + b;
            }
        %>
    </body>
</html>

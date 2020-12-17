<%-- 
    Document   : JSPScriplet
    Created on : May 26, 2020, 1:16:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Scriplet</title>
    </head>
    <body>
        <form name="for_n" method="get">
            Enter n: <input type="text" name="soLuong"> <br><br>
            <input type="submit" name="bt" value="Phát sinh"<br><br>
            <%
                String s = request.getParameter("soLuong");
                if (s != null) {
                    int n = Integer.parseInt(s);
                    for (int i = 0; i < n; i++) {
                        out.print("<b>" + i + "</b>");
                        out.print("<br>");
                    }
                } else {
                    out.print("<b>Re-enter n!</b>");
                }
            %>           
        </form>
    </body>
</html>

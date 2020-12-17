<%-- 
    Document   : Calculator
    Created on : Jun 2, 2020, 1:34:41 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <form>
            Num1: <input name="txtNum1" value="${param.txtNum1}"/> <br/>
            Num2: <input name="txtNum2" value="${param.txtNum2}"/> <br/>
            <input type="submit" value="Cong"/>
            <h1> Sum: ${param.txtNum1 + param.txtNum2}</h1>
        </form>
    </body>
</html>

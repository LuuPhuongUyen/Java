<%@page import="java.util.List"%>
<%@page import="edu.fud.DAO.bookDAO"%>
<%@page import="edu.fud.model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        <link rel="icon" type="image/gif/png" href="images/icon.PNG">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/styleRead.css">
    </head>
    <body>
        <div>
            <jsp:include page="header.jsp"/>
        </div>
        <div class="bookInfo">
            <div class="bookLeft">
                <img class="imgBook" src="${picture}"/><br/>
            </div>
            <div class="bookRight">
                <h3>${title}</h3>
                Author: <h7> ${author}</h7><br/>
                Publisher: <h7> ${publisher}</h7><br/>
                Year: <h7> ${year}</h7><br/>
                Category: <h7> ${category}</h7><br/>
                Language: <h7> ${language}</h7><br/>
                Preview: <h7>${preview}</h7><br/>
                    <s:if test="%{#session.NAME!=null}">
                        <s:a action="readBook">
                            <s:param name="bookID">${bookID}</s:param>
                            <button class="btnRead" >Read</button>
                    </s:a>
                </s:if>
                <s:else>
                    <br>
                    <p style="color: #ff0000">You have to <a href="Login.jsp">Login</a> to read book!</p>
                </s:else>
            </div>
            <br>

        </div>
        <div>
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>

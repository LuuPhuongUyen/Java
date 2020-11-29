<%-- 
    Document   : FindUs
    Created on : May 25, 2018, 11:35:17 AM
    Author     : thuongnnse05095
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body onload="setBold()">
        <div id="menu" data-page="Info"></div>
        <div class="wrap">
            <%@include file="header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <div class="content-contact">
                            <h3>Contact me</h3>
                            <div class="info">
                                <span>Send your message</span>
                                <div class="border-contact"></div>
                                <s:if test="hasActionErrors()">
                                    <div class="alert-error closeDialog">
                                        <button type="button" class="close" onclick="closeDialog()">×</button>
                                        <span><s:actionerror/></span>
                                    </div>
                                </s:if>
                                <s:if test="hasActionMessages()">
                                    <div class="alert-success closeDialog">
                                        <s:actionmessage/>
                                    </div>
                                </s:if>                            
                            </div>
                            <!-- form id="sendMessage" action="getMessage">-->
                            <form  action="getMessage">
                                <div class="send">
                                    <p>Write your message here. Fill out the form:</p>
                                    <div class="row1">
                                        <input type="text" name="name" placeholder="Write your name here" required="">
                                        <input type="email" name="email" placeholder="Write your email here" required="">
                                    </div>
                                    <div class="row2">
                                        <textarea name="message" placeholder="Write your message here" required=""></textarea>
                                    </div>
                                    <input type="submit" id="submit" name="submit" value="Send - Click here" href="getMessage">
                                </div>
                            </form>
                        </div>
                    </div>
                    <%@include file="container.jsp" %>
                </div>
                <%@include file="footer.jsp" %>
            </div>
        </div>
        <script src="js/sendMessage.js"></script>
        <script src="js/menu.js"></script>
    </body>
</html>

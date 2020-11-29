<%-- 
    Document   : header
    Created on : Jul 3, 2020, 8:32:39 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid px-md-5  pt-4 pt-md-5">
            <div class="row justify-content-between">
                <div class="col-md-8 order-md-last">
                    <div class="row">
                        <div class="col-md-6 text-center">
                            <a class="navbar-brand" href="home.jsp"> <span>WHATEVER</span> <small>Book for everyone</small></a>
                        </div>
                        <div class="col-md-6 d-md-flex justify-content-end mb-md-0 mb-3">
                            <s:form action="searchBook" cssClass="searchform order-lg-last">
                                <div class="form-group d-flex">
                                    <input type="text" name="searchValue" class="form-control pl-3" placeholder="Search">
                                    <button type="submit" placeholder="" class="form-control search"><span class="fa fa-search"></span></button>
                                </div>
                            </s:form>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 d-flex">
                    <div> 
                        <s:if test="%{#session.NAME!=null}">
                            Welcome,
                            <a href="editUser?userID=${sessionScope.ID}">
                                ${sessionScope.NAME}<br>
                            </a>

                            <a  href="logOut"> Logout</a>
                        </s:if>
                        <s:else>
                            <a  href="Login.jsp"> Login</a>
                        </s:else>

                    </div>
                </div>
            </div>
        </div>
        <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
            <div class="container-fluid">

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="fa fa-bars"></span> Menu
                </button>
                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav m-auto">
                        <li class="nav-item"><a href="home.jsp" class="nav-link">Home</a></li>
                        <li class="nav-item"><a href="getAllBook" class="nav-link">Books</a></li>
                        <li class="nav-item"><a href="Contact.jsp" class="nav-link">Contact</a></li>
                            <s:if test="%{#session.permission}">
                            <li class="nav-item"><a href="manageBookAction" class="nav-link">Manage Book</a></li>
                            <li class="nav-item"><a href="manageUserAction" class="nav-link">Manage User</a></li>
                            </s:if>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>

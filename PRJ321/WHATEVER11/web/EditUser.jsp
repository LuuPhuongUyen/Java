<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit User</title>
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
        <link rel="stylesheet" href="styleUpdate.css">
        <link href="css/styleEdit.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleEdit.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div>
            <jsp:include page="header.jsp"/>
        </div>
        <div class="container emp-profile">
            <form action="saveEditUser">
                <center>  
                    <h2>Edit Information </h2>
                </center>
                <div class="row">

                    <div class="col-md-8">
                        <div class="tab-content profile-tab" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <div class="row">
                                    <div class="col-md-6">
                                        <label hidden="">UserID</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input type="text" name="userID" value="${u.getUserID()}" required hidden="">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Name</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input class="input" type="text" name="name" value="${u.getName()}" required>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>User Name</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input class="input" type="text" name="Username" value="${u.getUserName()}" required>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Email</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input class="input" type="email" name="email" value="${u.getEmail()}"required>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Password</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input class="input" type="password" name="password" value="${u.getPassword()}"required>
                                        <center>
                                            <div class="col-md-2">
                                                <input class = "btnEdit" type="submit" value="Save" href="saveEditUser"/>
                                        </center>

                                    </div>
                                </div>
                            </div>
                        </div>                         
                    </div>
                </div>
            </form>      

        </div>
    </div>
    <div class="footer">
        <jsp:include page="footer.jsp"/>
    </div>
</body>
</html>
<%-- 
    Document   : Admin_Login
    Created on : Mar 3, 2017, 3:24:16 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
   

    <title>Heroic Features - Start Bootstrap Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

    <!-- Custom CSS -->
    <link href="css/heroic-features.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="asm.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
              crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
              integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" 
              crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
                integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
        <style>
footer .glyphicon {
    font-size: 20px;
    margin-bottom: 20px;
    color: #f4511e;
}
</style>

        <title>Login</title>
    </head>
    <body id="myPage">
         <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Trang chủ</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <c:choose>
                        <c:when test="${empty sessionScope['userNameAdmin']}">
                             <a href="User_Login.jsp">Đăng nhập</a>
                             
                        </c:when>
                        <c:otherwise>
                            <c:redirect url="Admin.jsp"/>
                        </c:otherwise>
                        </c:choose>
                       
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <fmt:requestEncoding value="UTF-8" />
        <div class="jumbotron text-center">
            <h1>WORKER MANAGE</h1> 
        </div>
        <div id="mid">
            <div id="left"></div>
            <div id="content">
                <center>
                    <c:choose>
                        <c:when test="${empty cookie['userAdmin']}">
<!--                            <h1>LOGIN</h1>

                            <form action="AdminController" method="POST">
                                <table border="0" cellspacing="2" cellpadding="7">


                                    <div class="form-group">
                                        <label>UserName</label>
                                        <input type="text" name="txtUser"  placeholder=" Username"/>
                                    </div>

                                    <div class="form-group">

                                        <label>PassWord</label>
                                        <input type="password" name="txtPass"  placeholder=" Password"/>

                                    </div>
                                    <div class="checkbox">
                                        <label><input type="checkbox" name="ckRemember" value="Remember Acc"/>Remember</label>
                                    </div>
                                    <input class="btn btn-default" type="submit" value="Login"/>
                                    <input class="btn btn-default" type="reset" value="Reset"/>
                                </table>
                            </form>-->
                            
                             <h1>LOGIN</h1>
                                <h:form>

                                <tbody>
                                <div class="form-group">
                                    <label>User :</label>
                                    <h:inputText value="#{adminBean.adminID}" required=""/>
                                </div>
                                <div >
                                    <label>Pass :</label>
                                    <h:inputText value="#{adminBean.passWord}" required=""/>
                                </div>
                                <div class="form-group">
                                    <h:selectManyCheckbox value="Remember Acc" />
                                    <input type="checkbox" name="ckRemember" value="Remember Acc"/>lưu mật khẩu ?</div>
                                     
                                    <h:commandButton action="#{adminBean.checklogin()}" value="Login"/>
                                
                                <button type="reset" class="btn btn-default">Reset</button>
                                </tbody>

                            </h:form>
                            
                        </c:when>
                        <c:otherwise>
<!--                            <h1>Login Form !</h1>
                            <form action="AdminController" method="POST">
                                <table border="0" cellspacing="2" cellpadding="7">

                                    <tr>
                                        <td>User :</td>
                                        <td><input type="text" name="txtUser" value="${cookie['userAdmin'].value}"/></td>
                                    </tr>
                                    <tr>
                                        <td>Pass :</td>
                                        <td><input type="password"  name="txtPass" value="${cookie['passAdmin'].value}"/></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td><input type="submit"  value="Login"/>
                                            <input type="reset" value="Reset"/></td>
                                        <td><input type="checkbox" name="ckRemember" value="Remember Acc" checked="true"/>lưu mật khẩu ?</td>
                                    </tr>
                                </table>
                            </form>-->

                            <h1>LOGIN</h1>

                            <form action="AdminController" method="POST">
                                <table border="0" cellspacing="2" cellpadding="7">
                                    <div class="form-group">
                                        <label>UserName</label>
                                        <input type="text" name="txtUser" value="${cookie['userAdmin'].value}"/>
                                    </div>
                                    <div class="form-group">
                                        <label>PassWord</label>
                                        <input type="password" name="txtPass" value="${cookie['passAdmin'].value}"/>
                                    </div>
                                    <div class="checkbox">
                                        <label><input type="checkbox" name="ckRemember" checked="true" value="Remember"/>Remember</label>
                                    </div>
                                    <button type="submit" value="Login" class="btn btn-default"">Login</button>
                                    <button type="reset" value="Reset" class="btn btn-default"">Reset</button>
                                        </table>
                            </form>
                        </c:otherwise>    
                    </c:choose>
                </center>
            </div>
            <!-- Add Google Maps -->
<div id="googleMap" style="height:400px;width:100%;"></div>
<script>
function myMap() {
    var myCenter = new google.maps.LatLng(21.028554,105.782114);
var mapProp = {center:myCenter, zoom:16, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({position:myCenter});
marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBgGdyipFkSZMkrnSjUMaOKocgrzYePMjk&callback=myMap"></script>
        </div>
        <footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
  <p>Hờ Tờ Mờ Lờ en Cờ Sờ Sờ  Made By<a href="https://www.facebook.com/khuongnvd" title="Visit khuongvd">Khuongnvd</a></p>
</footer>
        
    </body>
</html>
</f:view>
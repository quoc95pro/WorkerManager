<%-- 
    Document   : UserPage
    Created on : 08-Mar-2017, 15:56:35
    Author     : quocvu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
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
        <title>JSP Page</title>
        
    </head>
    <body>
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
                        <c:when test="${empty sessionScope['userNameUser']}">
                             <a href="User_Login.jsp">Đăng nhập</a>
                        </c:when>
                        <c:otherwise>
                            <a>Xin chào,${sessionScope['userNameUser']}</a>
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
        <div class="jumbotron text-center">
            <h1>WORKER MANAGE</h1> 
        </div>
        <div id="mid">
            <div id="left"></div>
            <div id="content">
                <center>
                    <c:choose>
                        <c:when test="${empty sessionScope['userNameUser']}">
                            <c:redirect url="User_Login.jsp"/>
                        </c:when>
                        <c:otherwise>
                            <h1>Welcome ${sessionScope['userNameUser']}</h1>

                            <br/>
                            <br/>
                            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/servjsp_workermanager?characterEncoding=utf-8" 
                                               user="root" password=""  var="sqlSource" scope="session"/>
                            <sql:query dataSource="${sqlSource}" var="result">
                                SELECT * FROM rentalcontract WHERE UserName =?
                                <sql:param value="${sessionScope['userNameUser']}" />
                            </sql:query>
                            <h1>Job List!</h1>
                            <table class="table table-bordered" >
                                <tr>
                                    <th>Mã Hợp Đồng</th>
                                    <th>Địa Điểm</th>
                                    <th>Mô Tả Công Việc</th>
                                    <th>Số Công Nhân</th>    
                                    <th>Thời Gian Bắt Đầu</th>
                                    <th>Thời Gian Kết Thúc</th>
                                    <th>Người Duyệt</th>
                                    <th>Trạng Thái</th>
                                </tr>
                                <c:forEach var="p" items="${result.rows}">        
                                    <tr>
                                        <td>${p.RentalContractID}</td>
                                        <td>${p.place}</td>
                                        <td>${p.JobDescription}</td>
                                        <td>${p.NumberOfWorker}</td>
                                        <td>${p.StartTime}</td>
                                        <td>${p.EndTime}</td>
                                        <td>${p.AdminID}</td>
                                        <td>${p.Status}</td>
                                    </tr>
                                </c:forEach>
                            </table>
                            <br/>
                            <br/>
                          
                        </c:otherwise>    
                    </c:choose>
                </center>
            </div>
        </div>
        <div id="footer"></div>
    </body>
</html>
</f:view>
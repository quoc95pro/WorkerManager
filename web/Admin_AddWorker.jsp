<%-- 
    Document   : UpdateRentalContractID
    Created on : Mar 10, 2017, 5:49:59 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="asm.css">
        <title>JSP Page</title>
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
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>WORKER MANAGE</h1> 
        </div>
        <div id="mid">
            
            <div id="content">
                <center>
                    <c:choose>
                        <c:when test="${empty sessionScope['userNameAdmin']}">
                            <c:redirect url="Admin_Login.jsp"/>
                        </c:when>
                        <c:otherwise>
                            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/servjsp_workermanager?characterEncoding=utf-8" 
                                               user="root" password=""  var="sqlSource" scope="session"/>
                            <sql:query dataSource="${sqlSource}" var="result">
                                SELECT * FROM rentalcontract where RentalContractID= '${param.id}'

                            </sql:query>
                            <a href="AdminPage.jsp">back</a>
                            <form action="AddWorkerdb.jsp?id=${param.id}" method="POST">
                                <table class="table table-bordered">
                                    <tr>
                                        <th>Mã Hợp Đồng</th>
                                        <th>Người Tạo</th>
                                        <th>Địa điểm</th>
                                        <th>Mô tả công việc</th>
                                        <th>Số lượng công nhân</th>
                                        <th>Thời Gian Bắt Đầu</th>
                                        <th>Thời Gian Kết</th>
                                        <th>Tổng Giá</th>
                                        <th>Trạng Thái</th>
                                    </tr>
                                    <c:forEach var="p" items="${result.rows}">
                                        <tr>
                                            <td>${p.RentalContractID}</td>
                                            <td>${p.UserName}</td>
                                            <td>${p.place}</td>
                                            <td>${p.JobDescription}</td>
                                            <td>${p.NumberOfWorker}</td>
                                            <td>${p.StartTime}</td>
                                            <td>${p.EndTime}</td>
                                            <td>${p.Price}</td>
                                            <td>${p.Status}</td>
                                        </tr>

                                    </c:forEach>
                                </table>
                                <h1>Thêm công nhân</h1>


                                <sql:query dataSource="${sqlSource}" var="result">
                                    SELECT * FROM worker where Status='free'
                                </sql:query>

                                <table class="table table-striped">
                                    <tr>
                                        <th>Mã Công Nhân</th>
                                        <th>Mật Khẩu</th>
                                        <th>Tên Đầy Đủ</th>
                                        <th>Năm Sinh</th>
                                        <th>Loại</th>    
                                        <th>Mô Tả</th>
                                        <th>Số Công Việc Đã Hoàn Thành</th>
                                        <th>Giá 1 Ngày Công</th>
                                        <th>Trạng Thái</th>
                                    </tr>

                                    <c:forEach var="p" items="${result.rows}">
                                        <tr>
                                            <td>${p.WorkerID}</td>
                                            <td>${p.PassWord}</td>
                                            <td>${p.FullName}</td>
                                            <td>${p.YearOfBirth}</td>
                                            <td>${p.Type}</td>
                                            <td>${p.Description}</td>
                                            <td>${p.WorksCompleted}</td>
                                            <td>${p.PricePerDay}</td>
                                            <td>${p.Status}</td>
                                            <td><input name="select2" type="checkbox"  value="${p.WorkerID}"/></td>
                                        </tr>
                                    </c:forEach>


                                </table>




                                <div>
                                    <button type="submit" class="btn btn-primary">ADD</button>
                                    <button type="reset" class="btn btn-primary">Reset</button>
                                </div>
                            </form>
                        </c:otherwise>    
                    </c:choose>
                </center>
            </div>
        </div>
        
    </body>
</html>

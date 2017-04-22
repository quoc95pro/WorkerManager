<%-- 
    Document   : check
    Created on : Mar 12, 2017, 5:36:43 PM
    Author     : admin
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/servjsp_workermanager?characterEncoding=utf-8" 
                           user="root" password=""  var="sqlSource" scope="session"/>
        <sql:query dataSource="${sqlSource}" var="count">
            SELECT NumberOfWorker FROM rentalcontract where RentalContractID= '${param.id}'

        </sql:query>

        <c:forEach var="p" items="${paramValues['select2']}">
            ${ok=ok+1}
        </c:forEach>

        <c:forEach var="q" items="${count.rows}">
            ${ok2=q.NumberOfWorker}
        </c:forEach>
        <c:if test="${ok==ok2}">
            <c:forEach var="p" items="${paramValues['select2']}">

                <sql:update dataSource="${sqlSource}" var="result">
                    INSERT INTO workerrentalcontract(RentalContractID,WorkerID,Status) VALUES (?,?,?);
                    <sql:param value="${param.id}" />
                    <sql:param value="${p}" />
                    <sql:param value="working" />
                </sql:update>

                <sql:update dataSource="${sqlSource}" var="rs2">
                    UPDATE `worker` SET `Status`='working' where WorkerID=?
                    <sql:param value="${p}" />
                </sql:update>
            </c:forEach>


            <sql:update dataSource="${sqlSource}" var="rs">
                UPDATE `rentalcontract` SET `Status`='working',AdminID=?  where RentalContractID=?
                <sql:param value="${sessionScope['userNameAdmin']}" />
                <sql:param value="${param.id}" />
            </sql:update>

            <c:if test="${result>=1&&rs>=1&&rs2>=1}">
                <c:redirect url="AdminPage.jsp" >
                </c:redirect>
            </c:if>   
        </c:if> 
        <c:if test="${ok!=ok2}">  
            <c:redirect url="AdminPage.jsp" >
                <c:param name="mess" value="Hợp Đồng Cần ${ok2} Công Nhân"/>
            </c:redirect>
        </c:if>    
    </body>
</html>

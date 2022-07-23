
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"/>
    <script src="./js/bootstrap.min.js"></script>
    <title>Employee List</title>
</head>
<body>
    <div class="container">
    <center>

    </center>
    <div align="center">
        <table class="table table-bordered">
            <%-- <caption><h2>List of Uploaded Resumes</h2></caption> --%>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Salary</th>
            </tr>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td><c:out value="${employee.id}" /></td>
                    <td><c:out value="${employee.name}" /></td>
                    <td><c:out value="${employee.designation}" /></td>
                    <td><c:out value="${employee.salary}" /></td>
                </tr>
            </c:forEach>
            <tr>
                <td>
                    <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </h3>
                </td>
            </tr>
        </table>
    </div>
    </div>
</body>
</html>

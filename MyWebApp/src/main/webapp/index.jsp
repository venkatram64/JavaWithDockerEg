<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Emp Web App</title>
</head>
<body>
<h1><%= "Emp Form" %>
</h1>
<br/>
<div class="container">
    <form method="post" action="myEmpCreate" autocomplete="off">
        <label for="name">Emp Name</label><br>
        <input type="text" id="name" name="name"><br>
        <label for="designation">Designation</label><br>
        <input type="text" id="designation" name="designation"><br><br>
        <label for="salary">Salary</label><br>
        <input type="text" id="salary" name="salary"><br><br>
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
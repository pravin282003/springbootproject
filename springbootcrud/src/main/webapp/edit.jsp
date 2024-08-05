<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="update">
   <pre>
   <input type="text" name="rollno" value="${stu.rollno}">
   <input type="text" name="name" value="${stu.name}">
   <input type="text" name="username" value="${stu.username}">
   <input type="text" name="password" value="${stu.password}">
   
   <input type="submit" value="UPDATE">
   
   </pre>
   </form>

</body>
</html>
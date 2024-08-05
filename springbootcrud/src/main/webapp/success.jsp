<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table border="3">
    <tr>
   <th>ROLLNO</th>
   <th>NAME</th>
   <th>USERNAME</th>
   <th>PASSWORD</th>
      
   </tr>
   <c:forEach item="${data}" var="s">
  <tr>
  <td>${s.rollno}</td>
  <td>${s.name}</td>
  <td>${s.username}</td>
  <td>${s,password}</td>
  <td <a href=delete?rollno="${s.rollno}">DELETE</a> ||<a href=edit?rollno="${s.rollno}">EDIT</a>/td>
  </tr>
   </c:forEach>
 
   
   </table>

</body>
</html>
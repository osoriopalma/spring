<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Data</h1>
<form:form action="student.do" method="POST" commandName="student">

<table>
  <tr>
  <td>Student ID</td>
  <td>
  <form:input path="studentId"/>
  </td>
  </tr>
  
  
  
    <tr>
  
  <td>First name</td>
  <td>
  <form:input path="firstname"/>
  </td>
  </tr>
  
  
  
    <tr>
  
  <td>Last name</td>
  <td>
  <form:input path="lastname"/>
  </td>
  </tr>
  
  
      <tr>
  
  <td>Year level</td>
  <td>
  <form:input path="yearLevel"/>
  </td>
  </tr>
  
  
  <tr>  
   <td colspan="2">
   <input type="submit" name="action" value="Add"/>
   <input type="submit" name="action" value="Edit"/>
   <input type="submit" name="action" value="Delete"/>
   <input type="submit" name="action" value="Search"/>
   
   
   </td>
  </tr>

</table>


</form:form>
</body>
</html>
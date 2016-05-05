<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="cn.imeixi.java.pojo.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>

</script>
</head>
<body>
	<%
		List<Student> students = (List<Student>)request.getAttribute("students");
		
	%>
	<table border="1" cellpadding="10px" cellspacing="0">
	
		<tr>
			<th>stuId</th>
			<th>stuName</th>
			<th>sex</th>
			<th>birth</th>
			<th>score</th>
			<th></th>
		</tr>
		
	<%
		for(Student student:students){
	%>
		<tr>
			<td><%= student.getStuId() %> </td>
			<td><%= student.getStuName() %> </td>
			<td><%= student.getSex() %> </td>
			<td><%= student.getBirth() %> </td>
			<td><%= student.getScore() %> </td>
			<td><a href ="deleteStudent?stuId=<%=student.getStuId() %>">Delete</a></td>
		</tr>
	
	<%
		}
	%>	
	
	</table>

</body>
</html>
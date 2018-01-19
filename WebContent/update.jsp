<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="studentAction_updateStudents.action" name="student"
		method="post">
		<table>
			<tr>
				<td>学生编号:${student.sid }<input type="hidden" name="student.sid"
					value="${student.sid }"></td>
			</tr>
			<tr>
				<td>学生名称:<input name="student.sname" value="${student.sname}">
				</td>
			</tr>
			<tr>
				<td>学生年龄:<input name="student.age" value="${student.age}">
				</td>
			</tr>
			<tr>
				<td>所属班级:${student.banji} <input type="hidden"
					name="student.banji" value="${student.banji}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="更新"></td>
			</tr>
		</table>

	</form>
</body>
</html>
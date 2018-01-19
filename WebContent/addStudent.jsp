<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	增加学习页面
	<form action="studentAction_addStudent.action" method="post"
		name="student">
		<table>
			<tr>
				<td>请输入学生姓名<input name="student.sname" value="">
				</td>
			</tr>
			<tr>
				<td>请输入学生年龄<input name="student.age" value="">
				</td>
			</tr>
			<tr>
				<td>请输入学生班级<select name="student.banji">
						<option value="软件1501班">软件1501班</option>
						<option value="软件1502班">软件1502班</option>
						<option value="软件1601班">软件1601班</option>
						<option value="软件1701班">软件1701班</option>

				</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="增加"></td>
			</tr>
		</table>
	</form>
</body>
</html>
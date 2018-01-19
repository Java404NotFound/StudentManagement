<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="addStudent.jsp"><input type="button" value="增加"></a>
	<a href="selectStudentName.jsp"><input type="button" value="查询"></a>

	<table style="" border="2">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>班级</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${studetList}" var="studet">

			<tr>
				<td>${studet.sid }</td>
				<td>${studet.sname }</td>
				<td>${studet.age}</td>
				<td><a href="javascript:tobanji('${studet.banji}')"> ${studet.banji}</a>
				<td><a
					href="studentAction_delStudent.action?sid=${studet.sid }">删除</a> <a
					href="studentAction_updStudent.action?sid=${studet.sid}"> 修改</a> <a
					href="studentAction_getStudentbyId.action?sid=${studet.sid}">
						详情</a></td>
			</tr>

		</c:forEach>

	</table>
	<form id="banji" name="student"
		action="studentAction_findStudentByBanji.action" method="post">
		<input id="hahaha" name="student.banji" type="hidden"
			value="">
	</form>
</body>
<script type="text/javascript">
	function tobanji(a) {
		document.getElementById("hahaha").value=a;
		document.getElementById("banji").submit();
	}
</script>
</html>
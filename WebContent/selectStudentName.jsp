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
请输入模糊查询的姓名:
<form action="studentAction_findStudentBySname.action" method="post" name="student">
 <input type="text" name="student.sname"> <input type="submit" value="查询">
 </form>
 <div>
 <c:forEach items="${studentByNames}" var="student">
    编号: ${student.sid}<br>
   姓名: ${student.sname }<br>
  年龄:${student.age}<br>
   班级:${student.banji }<br>
  </c:forEach>
 
 </div>
 <a href="toindex.jsp">返回</a>
</body>
</html>
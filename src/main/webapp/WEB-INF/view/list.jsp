<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="list.do" method="post">
	价格范围<input type="text" name="p1" value="${p1 }">--<input type="text" name="p2" value="${p2 }">元 &nbsp &nbsp
	百分比范围<input type="text" name="s1" value="${s1 }">--<input type="text" name="s2" value="${s2 }">
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>价格</td>
		<td>百分比</td>
	</tr>
	<c:forEach items="${info.list }" var="g">
	<tr>
		<td>${g.id }</td>
		<td>${g.name }</td>
		<td>${g.price }</td>
		<td>${g.sales }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			当前页${info.pageNum }/${info.pages },共${info.total }条数据
			<a href="list.do?pageNum=1&p1=${p1 }&p2=${p2 }">首页</a>
			<a href="list.do?pageNum=${info.prePage }&p1=${p1 }&p2=${p2 }">上一页</a>
			<a href="list.do?pageNum=${info.nextPage }&p1=${p1 }&p2=${p2 }">下一页</a>
			<a href="list.do?pageNum=${info.pages }&p1=${p1 }&p2=${p2 }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>
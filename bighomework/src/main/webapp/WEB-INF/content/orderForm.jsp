<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单</title>
<meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
   <style>
.thtd{
        color:coral;
        font-family:华文细黑;
        font-size: 16px;
        padding: 5px 15px;
        }
        table {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;
	background: #ffecf5;
}

th, td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
}

th {
	font-weight: bold;
	background: #ffa6ff;
}
    </style>
</head>
<body>
<div>
欢迎[${sessionScope.user.loginname }]查看订单
<table border="1">
	<tr>
		<th width="150px">序号</th><th width="150px">订单号</th><th>订单状态</th><th>查看详情</th><th>删除</th><th>发货</th>
	</tr>
	<c:forEach items="${requestScope.order_list }" var="order">
		
		<tr>
			<td>${order.id }</td>
			<td>${order.id }${order.user_id}${order.goods_id }</td>
			<td>${order.state }</td>
			<td>
			<form action="selectorder" method="post">
			<input type="submit" value="查看详情">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
			<td>
			<form action="deleteorder" method="post" >
			<input type="submit" value="删除">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
			<td>
			<form action="doingorder" method="post" >
			<input type="submit" value="发货">
			<input type="hidden" id="good_id" name="good_id" value="${order.goods_id}">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
		</tr>
		
	</c:forEach>
</table>
</div>
</body>
</html>
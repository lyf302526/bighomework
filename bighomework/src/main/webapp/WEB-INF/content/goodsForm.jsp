<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>商品首页</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
   <style>
.thtd{
        color:#000079;
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
	<font color="#FF5809"><h1>欢迎[${sessionScope.user.loginname }]来到饰品小屋！</h1></font>
	<font color="#FF5809"><h3>当前在线人数为：${applicationScope.count}人</h3></font>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		    <font size="14"><a href="loginForm">登陆</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<font size="14"><a href="signForm">注册</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<table class="table table-hover">
				<thead>
					<tr>
						<th>图片</th><th>物品名</th><th>描述</th><th>价格</th><th>加入购物车</th><th>收藏物品</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.goods_list}" var="goods">
					<tr>
						<td><img src="${goods.image}"height="60"></td>
						<td>${goods.goods_name}</td>
						<td>${goods.discriber}</td>
						<td>${goods.price}</td>
						<td><form action="addCart" method="post">
							<input type="hidden" id="goods_id" name="goods_id" value="${goods.goods_id }">
							<input type="hidden" id="price" name="price" value="${goods.price }">
							<input type="hidden" id="image" name="image" value="${goods.image }">
							<input type="hidden" id="user_id" name="user_id" value="${sessionScope.user.user_id }">
							<input type="submit" style="background-color:#4DFFFF" value="加入购物车">
							</form></td>
						<td><form action="collect" method="post">
							<input type="hidden" id="goods_id" name="goods_id" value="${goods.goods_id }">
							<input type="hidden" id="price" name="price" value="${goods.price }">
							<input type="hidden" id="image" name="image" value="${goods.image }">
							<input type="hidden" id="user_id" name="user_id" value="${sessionScope.user.user_id }">
							<input type="submit" style="background-color:#79FF79" value="收藏">
							</form></td>
					</tr>
					
					
				</c:forEach>
				</tbody>
			</table>
			<a href="cartForm"><font color="#FF5809" size="60px">去购物车</font></a>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>

  </body>
</html>
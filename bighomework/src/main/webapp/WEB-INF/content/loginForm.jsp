<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登陆</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div id="div1">
<font color="#FF5809"><h3>登录页面</h3></font>
<form action="login" method="post">
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<font color="#FF5809"><h3>
				欢迎来到饰品小屋！
			</h3></font>
			<form class="form-horizontal" role="form">
				<div class="form-group">
					 
					<label for="inputEmail3" class="col-sm-2 control-label">
						<font color="#FF5809">登录名：</font>
					</label>
					<div class="col-sm-10">
						<input type="text" id="loginname" name="loginname"class="form-control" >
					</div>
				</div>
				<div class="form-group">
					 
					<label for="inputPassword3" class="col-sm-2 control-label">
						<font color="#FF5809">密码：</font>
					</label>
					<div class="col-sm-10">
						<input type="password" id="password" name="password" class="form-control" id="signpwd">
					</div>
				</div>
				<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									 
									<label>
										<input name="aaaa" type="checkbox" onclick="Save()"> 记住密码
									</label>
									
								</div>
							</div>
						</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default">
							<font color="#FF5809">登录</font>
						</button>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="changeForm"><font color="#FF5809">修改密码</font></a>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</form>
</body>
</html>

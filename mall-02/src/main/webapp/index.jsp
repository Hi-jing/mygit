<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>新世纪商城中台管理系统</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/index.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/static/icheck-1.x/skins/square/blue.css" />
<script src="${APP_PATH}/static/icheck-1.x/icheck.js"></script>
<title>会员中台系统</title>
</head>
<body>

	<div id="top">
		<img src="images/index/logo.png"><span>新世纪国际商城</span>
	</div>
	<div id="content" class="row">
		<div class="col-md-4 col-md-offset-4 myclo">
			<p class="con_title">中台管理系统</p>
			<form id="ad_form">
				<div class="input-group myinput" style="width: 90%">
					<div class="input-group-addon" style="background-color: #fff;">
						<span class="glyphicon glyphicon-user"></span>
					</div>

					<%
						String name = "";
						Cookie[] cookies = request.getCookies();
						if (cookies != null && cookies.length > 0) {
							for (Cookie c : cookies) {
								if (c.getName().equals("ad_username")) {
									name = c.getValue();
								}
							}
						}
						if (name.equals("")) {
					%><input type="text" class="form-control" name="adUsername"
						placeholder="用户名" id="username">
					<%
						} else {
					%><input type="text" class="form-control" name="adUsername"
						value="<%=name%>" id="username">
					<%
						}
					%>

				</div>
				<label class="warn" id="warn_1">该用户名不存在</label>
				<div class="input-group myinput" style="width: 90%">
					<div class="input-group-addon" style="background-color: #fff;">
						<span class="glyphicon glyphicon-lock"></span>
					</div>

					<input type="password" class="form-control" name="adPassword"
						placeholder="密码">
				</div>
				<label class="warn" id="warn_2">用户名与密码不匹配，请重新输入！</label>

				<div class="tag">
					<input type="checkbox" name="isSave"><span>&nbsp;&nbsp;记住用户名</span>
				</div>
				<br />
			</form>
			<button type="button" class="btn btn-primary btn-lg btn-block"
				style="width: 80%; margin: 0px auto;" id="ad_login">登录</button>
		</div>
		<div id="mark">
			<span>Power By 走心队 Production time @2017-08 From 广东石油化工学院 </span>
		</div>
	</div>
	<div id="bottom"></div>
	<script type="text/javascript">
		$(function() {

			//使用bootstrap的icheck插件对复选框选中美化
			$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%"
			});

			//校验输入的用户名是否与密码匹配
			$("#ad_login").click(function() {
				$.ajax({
					url : "${APP_PATH}/admin",
					type : "POST",
					data : $("#ad_form").serialize(),
					success : function(result) {
						if (result.code == 100) {
							$("#warn_2").hide();
							//校验成功，跳转中台管理系统主页
							window.location.href = "${APP_PATH}/jumpPage";
						} else {
							$("#warn_2").show();
						}
					}
				});
			});

			//用户名输入值改变校验用户名是否不存在
			$("#username").change(function() {
				var adName = this.value;
				//发送ajax
				$.ajax({
					url : "${APP_PATH}/checkAdName",
					type : "POST",
					data : "adName=" + adName,
					success : function(result) {
						if (result.code == 100) {
							$("#warn_1").hide();
						} else {
							$("#warn_1").show();
						}
					}
				});
			});
		});
	</script>
</body>
</html>

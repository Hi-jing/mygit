<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>积分服务</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/mem_integral.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="${APP_PATH}/static/icheck-1.x/skins/square/blue.css" />
<script src="${APP_PATH}/static/icheck-1.x/icheck.js"></script>
<script>
	$('.dropdown-toggle').dropdown();
</script>
</head>
<body>
	<div id="mem_integral_top" class="row">
		<div style="height: 15%; width: 100%;"></div>
		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="padding: 10px;">

				<div class="col-md-2">
					<span style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">积分消费记录表</span>
				</div>

				<div class="col-md-2">


					<select class="form-control" >
						<option>订单编号</option>
					</select>

				</div>


				<div class="col-md-3 ">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="搜索">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">搜索</button>
						</span>
					</div>
				</div>


				<div class="col-md-1 ">
					<button type="button" class="btn btn-info">导出数据</button>
				</div>

				<div class="col-md-4"></div>
			</div>

			<table class="table table-bordered">
				<thead>

					<tr style="background: #EFEDED;">
						<th>订单id</th>
						<th>会员昵称</th>
						<th>创建时间</th>
						<th>消费积分值</th>
						<th>会员等级</th>
						<th>金额</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>

					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


					<tr>
						<td>123123</td>
						<td>和九条狗玩呢</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>
						<td>200</td>
						<td>vip2</td>
						<td>136.5</td>
						<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>

					</tr>


				</tbody>


			</table>

			<div class="col-md-12">
				<div class="col-md-4">
					<span style="float: left;">当前第1页，有210页，共有1047条记录</span>
				</div>
				<div class="col-md-8">
					<nav aria-label="Page navigation"
						style="float:right;margin-top: -3%;">
					<ul class="pagination">
						<li><a href="#"> <span>首页</span>
						</a></li>
						<li><a href="#"> <span>&laquo;</span>
						</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#"> <span>&raquo;</span>
						</a></li>
						<li><a href="#"> <span>尾页</span>
						</a></li>
					</ul>
					</nav>
				</div>

			</div>
		</div>

	</div>

	<!-- 管理会员等级 -->
	<div id="mem_integral_bottom" class="row">
		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="padding: 10px;">
				<div class="col-md-2">
					<span style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">会员等级管理表</span>
				</div>
				<div class="col-md-4">
					<div class="col-md-12">
						<div class="col-md-8 ">
							<p class="text-primary" style="font-size: 18px;">会员等级个数:</p>
						</div>
						<div class="col-md-4 col-md-pull-3">
							<select class="form-control">
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
							</select>
						</div>
					</div>


				</div>
				<div class="col-md-4 col-md-pull-1">
					<button type="button" class="btn btn-primary">应用</button>
				</div>



			</div>

			<table class="table table-bordered">
				<thead>

					<tr style="background: #EFEDED;">
						<th>操作</th>
						<th>等级ID</th>
						<th>等级名称</th>
						<th>折扣</th>
						<th>需成长值</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td><span class="glyphicon glyphicon-pencil inedit"></span></td>
						<td>vip1</td>
						<td>普通会员</td>
						<td>100%</td>
						<td>600</td>
					</tr>

					<tr>
						<td><span class="glyphicon glyphicon-pencil inedit"></span></td>
						<td>vip2</td>
						<td>黄金会员</td>
						<td>90%</td>
						<td>600</td>
					</tr>

					<tr>
						<td><span class="glyphicon glyphicon-pencil inedit"></span></td>
						<td>vip3</td>
						<td>白金会员</td>
						<td>80%</td>
						<td>600</td>
					</tr>

					<tr>
						<td><span class="glyphicon glyphicon-pencil inedit"></span></td>
						<td>vip4</td>
						<td>钻石会员</td>
						<td>70%</td>
						<td>600</td>
					</tr>

					<tr>
						<td><span class="glyphicon glyphicon-pencil inedit"></span></td>
						<td>vip5</td>
						<td>黑耀会员</td>
						<td>60%</td>
						<td>600</td>
					</tr>


				</tbody>


			</table>


		</div>
	</div>
	<script type="text/javascript" src="${APP_PATH}/js/mem_integral.js"></script>

	<!-- 查看的模态框 -->
	<div id="in_look_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">查看模态框</h4>
				</div>

				<div class="modal-body">
					<p>内容&hellip;</p>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>

			</div>
		</div>
	</div>


	<!-- 编辑的模态框 -->
	<div id="in_edit_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">编辑模态框</h4>
				</div>

				<div class="modal-body">
					<p>内容&hellip;</p>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>

			</div>
		</div>
	</div>




</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>会员流失预警</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/loss_warning.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>




</head>
<body>
	<div id="loss_warn_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#loss_warning"
						aria-controls="home" role="tab" data-toggle="tab">会员流失预警分析</a></li>


				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="loss_warning">

						<div class="col-md-12">
							<div class="col-md-12">
								<br>
							</div>
							<div class="col-md-12">
								<div class="col-md-3" style="margin-left:50px; ">

									<select class="form-control" style="width: 110px;">
										<option>会员昵称</option>
										<option>姓名</option>
									</select>
								</div>
								<div class="col-md-3" style="margin-left:-150px; ">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="搜索">
										<span class="input-group-btn">
											<button class="btn btn-default" type="button">搜索</button>
										</span>
									</div>
								</div>
								<div class="col-md-3">
									<select class="form-control" style="width: 110px;">
										<option>一周以内</option>
										<option>一个月内</option>
									</select>

								</div>
								<div class="col-md-2" style="margin-left:-150px; ">
									<button class="btn btn-primary" type="button">排序</button>
								</div>
							</div>
							<div class="col-md-12">
								<br>
							</div>
							<table class="table table-bordered">
								<thead>

									<tr style="background: #EFEDED;">
										<th>会员昵称</th>
										<th>姓名</th>
										<th>手机号</th>
										<th>上次登录时间</th>
										<th>上次消费时间</th>
										<th>未消费时日</th>
										<th>忠诚度</th>


									</tr>
								</thead>
								<tbody>

									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


									<tr>
										<td>和九条狗玩叫呢</td>
										<td>林统东</td>
										<td>13005666711</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>32</td>
										<td>80</td>
									</tr>


								</tbody>


							</table>

							<div class="col-md-12">
								<div class="col-md-4">
									<span style="float: left; font-size: 10px; padding-top: 20px;">共210页，有1047条记录</span>
								</div>
								<div class="col-md-8">
									<nav aria-label="Page navigation" style="float: right;">
									<ul class="pagination pagination-sm">
										<li class="previous"><a href="#"> <span>首页</span>
										</a></li>
										<li><a href="#"> <span>&laquo;</span>
										</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#"> <span>&raquo;</span>
										</a></li>
										<li class="next"><a href="#"> <span>尾页</span>
										</a></li>
									</ul>
									</nav>

								</div>

							</div>

						</div>







					</div>

				</div>

			</div>


		</div>



	</div>

	<!-- 会员流失分析图 -->
	<div id="loss_bottom" class="row">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">

			<div id="loss_warning_echart" style="width: 100%; height: 450px;"></div>

		</div>



	</div>

	<div class="col-md-12" style="background: #e6edf5;">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
	</div>
	<script type="text/javascript" src="${APP_PATH}/js/loss_warning.js"></script>





</body>
</html>

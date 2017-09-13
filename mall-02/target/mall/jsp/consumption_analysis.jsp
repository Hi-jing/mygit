<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>消费分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/consumption_analysis.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/static/icheck-1.x/skins/square/blue.css" />
<script src="${APP_PATH}/static/icheck-1.x/icheck.js"></script>

<script type="text/javascript"
	src="${APP_PATH}/static/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"
	charset="UTF-8"></script>
<link
	href="${APP_PATH}/static/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet" media="screen">

<script>
	$('.dropdown-toggle').dropdown();
</script>

</head>
<body>
	<div id="reg_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#consumption"
						aria-controls="home" role="tab" data-toggle="tab">消费分析</a></li>
				

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="consumption">

						<div class="col-md-12">
							<div class="col-md-6">
								<div class="col-md-12">
									<br>
								</div>
								<div class="col-md-12">
									<div class="col-md-3">

										<select class="form-control" style="width: 110px;">
											<option>会员昵称</option>
											<option>会员姓名</option>
											<option>会员地区</option>
										</select>
									</div>
									<div class="col-md-5">
										<div class="input-group">
											<input type="text" class="form-control" placeholder="搜索">
											<span class="input-group-btn">
												<button class="btn btn-default" type="button">搜索</button>
											</span>
										</div>
									</div>
									<div class="col-md-3">
										<a href="#" class="btn btn-default">统一分析</a>
									</div>
									<div class="col-md-1">
										<a href="javascript:warning();" class="btn btn-default">警示</a>
									</div>
								</div>
								<div class="col-md-12">
									<br>
								</div>
								<table class="table table-bordered">
									<thead>

										<tr style="background: #EFEDED;">
											<th><input type="checkbox" id="re_all"></th>
											<th>会员昵称</th>
											<th>姓名</th>
											<th>地区</th>
											<th>忠诚度</th>
											<th>操作</th>


										</tr>
									</thead>
									<tbody>

										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
										</tr>

										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
										</tr>
										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
										</tr>
										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
										</tr>
										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
										</tr>
										<tr>
											<td><input type="checkbox" name="re_bar"></td>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>雷州</td>
											<td>80</td>
											<td><a href="#">消费分析</a></td>
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
							<div class="col-md-5 col-md-offset-1">
								<div id="integral_service_echart"
									style="width: 700px; height: 360px;"></div>
							</div>
						</div>







					</div>

				</div>

			</div>








		</div>

		

	</div>

	<!-- 会员收入支出图 -->
	<div id="re_bottom" class="row">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
		
			<div id="income_spend_echart" style="width: 100%; height: 300px;"></div>

		</div>



	</div>

<div class="col-md-12" style="background: #e6edf5;">
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>
	<script type="text/javascript"
		src="${APP_PATH}/js/consumption_analysis.js"></script>



	<!-- 警示的模态框 -->
	<div id="warning_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">警示模态框</h4>
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

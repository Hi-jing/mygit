<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>购物品类分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/shoppingcategory_analysis.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>




</head>
<body>
	<div id="sho_category__top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#shoppingcategory_analysis"
						aria-controls="home" role="tab" data-toggle="tab">购物品类分析</a></li>
				

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="shoppingcategory_analysis">

						<div class="col-md-12">
							<div class="col-md-6">
								<div class="col-md-12">
									<br>
								</div>
								<div class="col-md-12">
									<div class="col-md-3">

										<select class="form-control" style="width: 110px;">
											<option>会员昵称</option>
											<option>姓名</option>
											<option>手机号</option>
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
											<th>周订单数</th>
											<th>月订单数</th>
											<th>操作</th>


										</tr>
									</thead>
									<tbody>

										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>

										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>
										
										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>
										
										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>
										
										
										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>
										
										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
										</tr>
										<tr>
											<td>和九条狗玩呢</td>
											<td>林统东</td>
											<td>13005666711</td>
											<td>50</td>
											<td>560</td>
											<td><a href="#">饼图分析</a></td>
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
								<div id="shoppingcategory_analysis_echart"
									style="width: 800px; height: 360px;"></div>
							</div>
						</div>







					</div>

				</div>

			</div>








		</div>

		

	</div>



<div class="col-md-12" style="background: #e6edf5;">
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>
	<script type="text/javascript"
		src="${APP_PATH}/js/shoppingcategory_analysis.js"></script>





</body>
</html>

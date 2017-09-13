<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>礼品兑换</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/gift_exchange.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>




</head>
<body>
	<div id="gift_ex_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#gift_exchange"
						aria-controls="home" role="tab" data-toggle="tab">礼品兑换分析</a></li>
				

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="gift_exchange">

						<div class="col-md-12">
							<div class="col-md-6">
								<div class="col-md-12">
									<br>
								</div>
								<div class="col-md-12">
									<div class="col-md-3">

										<select class="form-control" style="width: 110px;">
											<option>商品名称</option>
											<option>商品类型</option>
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
										<button class="btn btn-primary" type="button">最热兑换</button>
									</div>
								</div>
								<div class="col-md-12">
									<br>
								</div>
								<table class="table table-bordered">
									<thead>

										<tr style="background: #EFEDED;">
											<th>商品名称</th>
											<th>商品类型</th>
											<th>所需积分</th>
											<th>补差金额</th>
											<th>已兑换量</th>
											<th>库存量</th>


										</tr>
									</thead>
									<tbody>

										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>

										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>
										
										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>
										
										
										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>
										
										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>
										
										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
										</tr>
										
										<tr>
											<td>某名牌男装</td>
											<td>男装</td>
											<td>200</td>
											<td>9.9</td>
											<td>560</td>
											<td>440</td>
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
								<div id="gift_exchange_echart"
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
		src="${APP_PATH}/js/gift_exchange.js"></script>





</body>
</html>

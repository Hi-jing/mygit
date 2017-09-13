<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>主页内容</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/home_content.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>

</head>
<body>
	<div id="home_up">
		<div class="btn_nav">
			<button type="button" class="btn btn-primary">
				<span class="glyphicon glyphicon-yen"></span> 成交金额：4567.89元
			</button>
		</div>
		<div class="btn_nav">
			<button type="button" class="btn btn-success">
				<span class="glyphicon glyphicon-shopping-cart"></span> 订单：4567笔
			</button>
		</div>
		<div class="btn_nav">
			<button type="button" class="btn btn-info">
				<span class="glyphicon glyphicon-volume-up"></span> 通知：456条
			</button>
		</div>
		<div class="btn_nav">
			<button type="button" class="btn btn-warning">
				<span class="glyphicon glyphicon-time"></span> 待处理：17条
			</button>
		</div>
	</div>
	<div id="home_middle" class="row">
		<div class="col-md-12" style="margin-top: -4%;">
			<div class="col-md-8">
				<div class="col-md-12" style="background: #fff; border-radius: 5px;">
					<div id="order_total_echart" style="width: 750px; height: 280px;">
						<img src="${APP_PATH}/images/gif/ajax-loader.gif" id="top_img">
					</div>
				</div>

			</div>
			<div class="col-md-4">
				<div class="col-md-12" style="background: #fff; border-radius: 5px;">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>登录记录</th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>

							</tr>
						</thead>
						<tbody id="lo_record">
<!-- 							<tr> -->
<!-- 								<td>管理员</td> -->
<!-- 								<td></td> -->
<!-- 								<td></td> -->
<!-- 								<td></td> -->
<!-- 								<td>2017/2/8</td> -->
<!-- 								<td>12:45:23</td> -->
<!-- 							</tr> -->
					

						</tbody>


					</table>
				</div>

			</div>
		</div>

	</div>
	<div id="down" class="row" style="margin-top: -2%;">
		<div class="col-md-12">
			<div class="col-md-6">
				<div class="col-md-12" style="background: #fff; border-radius: 5px;">
					<!-- 		<div id="e_title"> -->
					<!-- 			<span style="color: #7BB1EF;">订单交易类型</span> -->

					<!-- 		</div> -->
					<div id="order_type_echart" style="width: 700px; height: 360px;">
					</div>
				</div>

			</div>
			<div class="col-md-6" style="background: #fff; border-radius: 5px;">

				<p style="color: #7BB1EF; font-size: 16px; padding-top: 10px;">商品销售排行</p>
				<table class="table table-hover">
					<thead>

						<tr style="background: #EFEDED;">
							<th>排名</th>
							<th>商品编号</th>
							<th>商品名称</th>
							<th>销售数量</th>
						</tr>
					</thead>
					<tbody id="rank">

					</tbody>


				</table>
			</div>
		</div>

	</div>
	<script type="text/javascript" src="${APP_PATH}/js/home_content.js"></script>




</body>
</html>

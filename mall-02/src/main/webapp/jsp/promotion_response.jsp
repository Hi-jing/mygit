<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>促销活动响应分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/promotion_response.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>




</head>
<body>
	<div id="prom_res__top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a
						href="#promotion_response" aria-controls="home" role="tab"
						data-toggle="tab">促销活动响应类分析</a></li>
					<li role="presentation"><a href="#pro_echart"
						aria-controls="home" role="tab" data-toggle="tab">饼图分析</a></li>

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active"
						id="promotion_response">

						<div class="col-md-12">
							<div class="col-md-12">
								<br>
							</div>
							<div class="col-md-12">
								<div class="col-md-2 col-md-offset-2">
									<select class="form-control">
											<option>——状态——</option>
											<option>进行中</option>
											<option>已结束</option>
										</select>
								</div>
								<div class="col-md-4">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="搜索">
										<span class="input-group-btn">
											<button class="btn btn-default" type="button">搜索</button>
										</span>
									</div>
								</div>
								<div class="col-md-2">
									<button type="button" class="btn btn-info">导出数据</button>
								</div>
							</div>
							<div class="col-md-12">
								<br>
							</div>
							<table class="table table-bordered">
								<thead>

									<tr style="background: #EFEDED;">
										<th>商品名称</th>
										<th>活动开始时间</th>
										<th>活动结束时间</th>
										<th>状态</th>
										<th>消费记录数</th>
										<th>剩余库存量</th>
										<th>消费会员</th>

									</tr>
								</thead>
								<tbody>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>


									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
									</tr>

									<tr>
										<td>某品牌男装</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>2017/8/10&nbsp;&nbsp;11:50</td>
										<td>进行中</td>
										<td>5002</td>
										<td>560</td>
										<td><a href="#">明细</a></td>
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



					<!-- 第二个 -->
					<div role="tabpanel" class="tab-pane" id="pro_echart">


						<div class="col-md-12">
							<div id="promotion_response_echart"
								style="width: 1200px; height: 450px;"></div>
						</div>

						<div class="col-md-12">
							<br> <br> <br>
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
		src="${APP_PATH}/js/promotion_response.js"></script>





</body>
</html>

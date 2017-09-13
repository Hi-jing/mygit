<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>推广与销售</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/promote_sales.css" />
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



</head>
<body>
	<div id="sales_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a
						href="#sales_data" aria-controls="home" role="tab"
						data-toggle="tab">销售记录分析</a></li>
					

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">


					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="sales_data">



						<div class="col-md-12" style="padding: 10px;">
							<div class="col-md-2">
								<span
									style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">销售记录表</span>
							</div>
							<div class="col-md-3 col-md-pull-1">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="搜索">
									<span class="input-group-btn">
										<button class="btn btn-default" type="button">搜索</button>
									</span>
								</div>
							</div>


							<div class="col-md-1 col-md-pull-1">
								<button type="button" class="btn btn-warning">删除记录</button>
							</div>
							<div class="col-md-1 col-md-pull-1">
								<button type="button" class="btn btn-info">导入数据</button>
							</div>


						</div>



						<table class="table table-bordered">
							<thead>

								<tr style="background: #EFEDED;">
									<th><input type="checkbox" id="sale_sall"></th>
									<th>订单编号</th>
									<th>商品名称</th>
									<th>会员昵称</th>
									<th>会员等级</th>
									<th>折扣</th>
									<th>消费金额</th>
									<th>下单时间</th>
									<th>操作</th>


								</tr>
							</thead>
							<tbody>

								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
								</tr>
								<tr>
									<td><input type="checkbox" name="sale_sbar"></td>
									<td>4535654</td>
									<td>某品牌男装</td>
									<td>和九条狗玩呢</td>
									<td>vip3</td>
									<td>80%</td>
									<td>60.0</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td><a href="javascript:look_details()">详情</a></td>
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

			</div>








		</div>

	</div>

	<!-- 办理会员卡增长图 -->
	<div id="sales_bottom" class="row">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="height: 15px; width: 100%;"></div>
			<div class="col-md-12">
				<div class="col-md-2">
					<span id="memcard_growth_title">会员卡办理增长图</span>
				</div>
				<div class="col-md-5">
					<div class="col-md-4 col-md-offset-2">
						<span class="date_time">开始时间:</span>
					</div>
					<div class="input-group date form_date col-md-6 col-md-pull-1">
						<span class="input-group-addon"><span
							class="glyphicon glyphicon-calendar"></span></span> <input
							class="form-control" type="text" value="" readonly>


					</div>
				</div>
				<div class="col-md-5">
					<div class="col-md-4 col-md-pull-1">
						<span class="date_time">结束时间:</span>
					</div>
					<div class="input-group date form_date col-md-6 col-md-pull-2"
						id="end_time">
						<span class="input-group-addon"><span
							class="glyphicon glyphicon-calendar"></span></span> <input
							class="form-control" type="text" value="" readonly>


					</div>
				</div>

			</div>
			<div id="order_growth_echart" style="width: 100%; height: 300px;"></div>

		</div>



	</div>


	<script type="text/javascript"
		src="${APP_PATH}/js/promote_sales.js"></script>

	<!-- 查看详情的模态框 -->
	<div id="details_look_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">查看详情模态框</h4>
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

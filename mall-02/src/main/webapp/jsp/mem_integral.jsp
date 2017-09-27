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


					<select class="form-control">
						<option>订单编号</option>
					</select>

				</div>


				<div class="col-md-3 ">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="搜索"
							id="search_text"> <span class="input-group-btn">
							<button class="btn btn-default" type="button" id="search_or">搜索</button>
						</span>
					</div>
				</div>


				<div class="col-md-1 ">
					<button type="button" class="btn btn-info" id="export">导出数据</button>
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
				<tbody id="mem_int_tbody">

				</tbody>


			</table>
			<div class="col-md-12" id="form_bottom"></div>

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
						<th>等级</th>
						<th>等级名称</th>
						<th>折扣</th>
						<th>需成长值</th>
					</tr>
				</thead>
				<tbody id="level_tabel">


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
					<h4 class="modal-title">查看积分订单详情</h4>
				</div>

				<div class="modal-body" style="width: 100%; height: 250px;">
					<div class="col-md-12">
						<div class="col-md-6">
							<p class="text-left">
								订单编号：
								<mark id="or_id"></mark>
							</p>
							<p class="text-left">
								会员姓名：
								<mark id="or_name"></mark>
							</p>
							<p class="text-left">
								会员昵称：
								<mark id="or_niname"></mark>
							</p>
							<p class="text-left">
								收货地址：
								<mark id="or_ad"></mark>
							</p>
							<p class="text-left">
								手机号：
								<mark id="or_ph"></mark>
							</p>
							<p class="text-left">
								邮编：
								<mark id="or_co"></mark>
							</p>
						</div>
						<div class="col-md-6">
							<p class="text-left">
								下单时间：
								<mark id="or_date"></mark>
							</p>
							<p class="text-left">
								实付款：
								<mark id="or_pay"></mark>
							</p>
							<p class="text-left">
								消费积分值：
								<mark id="or_in"></mark>
							</p>
							<p class="text-left">
								订单类型：
								<mark id="or_type"></mark>
							</p>
							<p class="text-left">
								客户留言：
								<mark id="or_msg"></mark>
							</p>
						</div>
					</div>
					<!-- 					You can use the mark tag to <mark>highlight</mark> text -->
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>

			</div>
		</div>
	</div>



	<!-- 编辑我的会员等级管理的模态框 -->
	<div id="edit_memLevel_modal" class="modal fade" tabindex="-1"
		role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">编辑我的会员等级管理</h4>
				</div>

				<div class="modal-body" style="width: 100%; height: 250px;">
					<div class="col-md-12">
							<form class="form-horizontal">
								<div class="form-group" >
									<label for="inputEmail3" class="col-sm-2 control-label">等级：</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="input_vip"
											placeholder="等级">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword3" class="col-sm-2 control-label">等级名称：</label>
									<div class="col-sm-10">
										<input type="text" class="form-control"
											id="input_name" placeholder="等级名称">
									</div>
								</div>
								
								<div class="form-group">
									<label for="inputPassword3" class="col-sm-2 control-label">折扣：</label>
									<div class="col-sm-10">
										<select class="form-control" style="width: 150px;" id="select_level">
										<option value="10" >100%</option>
										<option value="9.5">95%</option>
										<option value="9">90%</option>
										<option value="8.5">85%</option>
										<option value="8">80%</option>
										<option value="7.5">75%</option>
										<option value="7">70%</option>
									</select>
									</div>
								</div>
								
								<div class="form-group">
									<label for="inputPassword3" class="col-sm-2 control-label">成长值：</label>
									<div class="col-sm-10">
										<input type="text" class="form-control"
											id="input_val" placeholder="成长值">
									</div>
								</div>

							</form>

					</div>
				</div>

				<div class="modal-footer">
					 
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">修改</button>
				</div>

			</div>
		</div>
	</div>








</body>
</html>

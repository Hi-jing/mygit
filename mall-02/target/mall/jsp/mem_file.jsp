<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>会员档案</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/mem_file.css" />
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
	<div id="mem_top" class="row">
		<div style="height: 15%; width: 100%;"></div>
		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="padding: 10px;">
				<div class="col-md-2">
					<span style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">会员档案</span>
				</div>
				<div class="col-md-2 col-md-pull-1">


					<select class="form-control" id="search_select">
						<option value="1">会员ID</option>
						<option value="2">会员昵称</option>
						<option value="3">会员姓名</option>
					</select>

				</div>
				<div class="col-md-3 col-md-pull-1">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="搜索"
							id="searchInp"> <span class="input-group-btn">
							<button class="btn btn-default" type="button" id="searchBtn">搜索</button>
						</span>
					</div>
				</div>

				<!-- 				<div class="col-md-1 col-md-pull-1"> -->
				<!-- 					<button type="button" class="btn btn-primary" id="addMem">添加会员</button> -->
				<!-- 				</div> -->
				<div class="col-md-1 col-md-pull-1">
					<button type="button" class="btn btn-warning" id="deleteMem">删除会员</button>
				</div>
				<div class="col-md-1 col-md-pull-1">
					<button type="button" class="btn btn-info" id="export">导出excel</button>
				</div>


			</div>

			<table class="table table-bordered">
				<thead>

					<tr style="background: #EFEDED;">
						<th><input type="checkbox" id="all"></th>
						<th>会员ID</th>
						<th>昵称</th>
						<th>姓名</th>
						<th>忠诚度</th>
						<th>手机号</th>
						<th>性别</th>
						<th>邮箱</th>
						<th>创建时间</th>
						<th>操作</th>


					</tr>
				</thead>
				<tbody id="mem_file_tbody">

				</tbody>


			</table>

			<div class="col-md-12" id="form_bottom"></div>

		</div>
	</div>

	<!-- 	</div> -->

	<!-- 会员增长图 -->
	<div id="mem_bottom" class="row" id="kkk">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;" id="lll">
			<div class="col-md-12" style="height: 15px; width: 100%;"></div>
			<div class="col-md-12">
				<div class="col-md-2">
					<span id="mem_growth_title">会员增长趋势图</span>
				</div>
				<div class="col-md-4">
					<div class="col-md-4 col-md-offset-2">
						<span class="date_time">开始时间:</span>
					</div>
					<div class="input-group date form_date col-md-6 col-md-pull-1" id="start_time">
						<span class="input-group-addon"><span
							class="glyphicon glyphicon-calendar"></span></span> <input
							class="form-control" type="text" value="" readonly id="stTime">


					</div>
				</div>
				<div class="col-md-4">
					<div class="col-md-4 col-md-pull-1">
						<span class="date_time">结束时间:</span>
					</div>
					<div class="input-group date form_date col-md-6 col-md-pull-2"
						id="end_time">
						<span class="input-group-addon"><span
							class="glyphicon glyphicon-calendar"></span></span> <input
							class="form-control" type="text" value="" readonly id="eTime">


					</div>
				</div>

				<div class="col-md-2 col-md-pull-1" id="btn_load">
<!-- 					<button type="button" class="btn btn-primary" id="load">加载</button> -->
<!-- 					<button type="button" class="btn btn-primary" id="refresh">刷新</button> -->
				</div>

			</div>
			<div id="order_growth_echart" style="width: 100%; height: 300px;">
			<img src="${APP_PATH}/images/gif/ajax-loader.gif" id="growth_img">
			</div>

		</div>



	</div>


	<script type="text/javascript" src="${APP_PATH}/js/mem_file.js"></script>

	<!-- 查看的模态框 -->
	<!-- 	<div id="look_modal" class="modal fade" tabindex="-1" role="dialog"> -->
	<!-- 		<div class="modal-dialog" role="document"> -->
	<!-- 			<div class="modal-content"> -->

	<!-- 				<div class="modal-header"> -->
	<!-- 					<h4 class="modal-title">查看模态框</h4> -->
	<!-- 				</div> -->

	<!-- 				<div class="modal-body"> -->
	<!-- 					<p>内容&hellip;</p> -->
	<!-- 				</div> -->

	<!-- 				<div class="modal-footer"> -->
	<!-- 					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> -->
	<!-- 				</div> -->

	<!-- 			</div> -->
	<!-- 		</div> -->
	<!-- 	</div> -->


	<!-- 修改的模态框 -->
	<div id="edit_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">编辑模态框</h4>
				</div>

				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">昵&nbsp;&nbsp;&nbsp;称：</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="nickname"></p>

							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">姓&nbsp;&nbsp;&nbsp;名：</label>
							<div class="col-sm-10">
								<input type="text" name="meName" class="form-control"
									id="m_name" placeholder="name"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">性&nbsp;&nbsp;&nbsp;别：</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="meSex" id="gender1" value="M"> 男
								</label> <label class="radio-inline"> <input type="radio"
									name="meSex" id="gender1" value="F"> 女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">邮&nbsp;&nbsp;&nbsp;箱：</label>
							<div class="col-sm-10">
								<input type="text" name="meEmail" class="form-control"
									id="m_email" placeholder="email@qq.com"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">手机号：</label>
							<div class="col-sm-10">
								<input type="text" name="mePhone" class="form-control"
									id="m_phone" placeholder="phonenumber"> <span
									class="help-block"></span>
							</div>
						</div>

						<!-- 						<div class="form-group"> -->
						<!-- 							<label class="col-sm-2 control-label">地&nbsp;&nbsp;&nbsp;区：</label> -->
						<!-- 							<div class="col-sm-10"> -->
						<!-- 								<input type="text" name="" class="form-control" -->
						<!-- 									id="m_district" placeholder="district"> <span -->
						<!-- 									class="help-block"></span> -->
						<!-- 							</div> -->
						<!-- 						</div> -->






					</form>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="save_mem">保存</button>
				</div>

			</div>
		</div>
	</div>


</body>
</html>

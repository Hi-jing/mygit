<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>服务与换购</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/mem_care.css" />
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

<link href="${APP_PATH}/static/fileinput/css/fileinput.css" media="all"
	rel="stylesheet" type="text/css" />
<script src="${APP_PATH}/static/fileinput/js/fileinput.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/fileinput/js/fr.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/fileinput/js/es.js"
	type="text/javascript"></script>





<script>
	$('.dropdown-toggle').dropdown();
</script>

</head>
<body>
	<div id="mem_care_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#add_item"
						aria-controls="home" role="tab" data-toggle="tab">添加促销商品</a></li>
					<li role="presentation"><a href="#look_item"
						aria-controls="profile" role="tab" data-toggle="tab">查看促销商品</a></li>
<!-- 					<li role="presentation"><a href="#message_edit" -->
<!-- 						aria-controls="profile" role="tab" data-toggle="tab">推送信息编辑</a></li> -->

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">


					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="add_item">

						<div class="col-md-12">
							<form class="form-inline" id="good_form" >
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>商品名称:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="商品名称" name="goName">
									</div>
									<div class="form-group" style="padding-left: 30px;">
										<a href="javascript:add_picture();">添加图片</a>&nbsp;&nbsp;
										 <span class="glyphicon glyphicon-info-sign" aria-hidden="true" style="color: red;" id="add_sign"></span>
									</div>
								</div>

								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>规格名称:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="规格名称" name="kiName">
<!-- 										<label>&nbsp;&nbsp;（多个规格以；隔开）</label> -->
									</div>
									<div class="form-group" style="padding-left: 30px;">
										<label>商品类型:&nbsp;&nbsp;</label> <select class="form-control"
											name="goType">
											<option value="食品">食品</option>
											<option value="家电">家电</option>
											<option value="手机数码">手机数码</option>
											<option value="女装">女装</option>
											<option value="男装">男装</option>
											<option value="鞋靴">鞋靴</option>
											<option value="箱包">箱包</option>
											<option value="内衣配饰">内衣配饰</option>
											<option value="百货">百货</option>
											<option value="家居家纺">家居家纺</option>
										</select>

									</div>


								</div>
								<div class="col-md-12" style="padding-top: 30px;">


									<div class="form-group">
										<label>销售类型:&nbsp;&nbsp;</label> <select class="form-control"
											id="sale_select" name="ptName">
											<option value="1">普通销售</option>
											<option value="2">积分销售</option>
											<option value="3">促销销售</option>
										</select>
									</div>


									<div class="form-group" style="padding-left: 30px;">
										<label>需积分:&nbsp;&nbsp;</label> <input type="text" disabled
											class="form-control in_input" placeholder="积分值"
											name="ptNeedintegral">
									</div>

									<div class="form-group" style="padding-left: 30px;">
										<label>补差金额:&nbsp;&nbsp;</label> <input type="text" disabled
											class="form-control in_input" placeholder="金额"
											name="ptAddmoney">
									</div>


								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<label>开始时间:&nbsp;&nbsp;</label>
									<div class="input-group date form_date col-md-2">
										<span class="input-group-addon"> <span
											class="glyphicon glyphicon-calendar"> </span>
										</span> <input class="form-control date_input" type="text" value=""
											readonly disabled name="ptStartdate">

									</div>

									<label>&nbsp;&nbsp;&nbsp;&nbsp;结束时间:&nbsp;&nbsp;</label>
									<div class="input-group date form_date col-md-2">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-calendar"></span></span> <input
											class="form-control date_input" type="text" value="" readonly
											disabled name="ptOverdate">

									</div>
								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>现价:&nbsp;&nbsp;</label> <input type="text"
											class="form-control now_price" placeholder="现价" name="kiNowprice">
									</div>
									<div class="form-group" style="padding-left: 20px;">
										<label>原价:&nbsp;&nbsp;</label> <input type="text"
											class="form-control pre_price" placeholder="原价" name="kiPreprice">
									</div>
									<div class="form-group" style="padding-left: 20px;">
										<label>库存量:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="库存量" name="goTotal">
									</div>
								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>进货价:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="进货价" name="kiAddmoney">
									</div>

									<div class="form-group" style="padding-left: 20px;">
										<label>备注:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="备注" name="ptMsg">
									</div>

								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<div class="col-md-4">
											<!-- 											<button type="button" class="btn btn-primary">保存</button> -->
											<input type="submit" class="btn btn-primary"
												id="save_goodmsg" value="保存">
										</div>
										<div class="col-md-4 col-md-offset-2">
											<!-- 											<button type="button" class="btn btn-warning">重置</button> -->
											<input type="reset" class="btn btn-warning" value="重置">
										</div>


									</div>
								</div>

							</form>


						</div>







					</div>






					<!-- 第二个 -->
					<div role="tabpanel" class="tab-pane" id="look_item">


						<div class="col-md-12" style="padding: 10px;">
							<div class="col-md-2">
								<select class="form-control">
									<option>商品名称</option>
									<option>商品类型</option>
									<option>状态</option>
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


							<div class="col-md-1">
								<button type="button" class="btn btn-info" id="export_Good">导入数据</button>
							</div>


						</div>



						<table class="table table-bordered">
							<thead>

								<tr style="background: #EFEDED;">
									<th>商品名称</th>
									<th>商品类型</th>
									<th>促销价</th>
									<th>销售量</th>
									<th>库存量</th>
									<th>状态</th>
									<th>操作</th>


								</tr>
							</thead>
							<tbody id="mem_care_tbody">

							</tbody>


						</table>


						<div class="col-md-12" id="form_bottom">

						</div>


					</div>



					<!-- 第三个 -->
					<div role="tabpanel" class="tab-pane" id="message_edit">

						<div class="col-md-12">
							<form class="form-inline">
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>标题:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="商品名称">
									</div>

								</div>


								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>内容:&nbsp;&nbsp;</label>
										<textarea class="form-control" rows="3" style="width: 300px;"
											name="textarea" placeholder="商品名称"></textarea>
									</div>
								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<label>备注:&nbsp;&nbsp;</label> <input type="text"
											class="form-control" placeholder="备注">
									</div>

								</div>
								<div class="col-md-12" style="padding-top: 30px;">
									<div class="form-group">
										<div class="col-md-4">
											<button type="button" class="btn btn-primary">立即发送</button>
										</div>
										<div class="col-md-4">
											<button type="button" class="btn btn-info">&nbsp;&nbsp;保存&nbsp;&nbsp;</button>
										</div>
										<div class="col-md-4 ">
											<button type="button" class="btn btn-warning">&nbsp;&nbsp;重置&nbsp;&nbsp;</button>
										</div>


									</div>
								</div>
							</form>


						</div>







					</div>


					<div class="col-md-12">
						<br> <br> <br> <br> <br> <br>
					</div>
				</div>

			</div>








		</div>

		<div class="col-md-12">
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>

	</div>




	<script type="text/javascript" src="${APP_PATH}/js/mem_care.js"></script>







	<!-- 查看促销活动商品详情的模态框 -->
	<div id="look_sale_modal" class="modal fade" tabindex="-1"
		role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">查看促销活动商品详情模态框</h4>
				</div>

				<div class="modal-body">
					<p>内容&hellip;</p>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" >关闭</button>
				</div>

			</div>
		</div>
	</div>


	<!-- 添加图片的模态框 -->
	<div id="add_picture_modal" class="modal fade" tabindex="-1"
		role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="width: 800px; height: 680px;">

				<div class="modal-header">
					<h4 class="modal-title">添加图片</h4>
				</div>

				<div class="modal-body" style="height: 550px;">

					<div class="container kv-main" style="width: 700px;">




						<form enctype="multipart/form-data">

							<div class="form-group">
								<input id="file-1" type="file" name="files" multiple
									class="file" data-overwrite-initial="false"
									data-min-file-count="2">
							</div>

						</form>



					</div>

				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="close_model">关闭</button>
				</div>

			</div>
		</div>
	</div>




	<script>
		$("#file-1").fileinput({
			uploadUrl : '${APP_PATH}/pic',
			allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
			overwriteInitial : false,
			uploadAsync : true, //默认异步上传
			maxFileSize : 1000,
			maxFilesNum : 10,
			showPreview : true, //是否显示预览
			//showZoom:false,
			maxFileCount : 5, //表示允许同时上传的最大文件个数
			browseClass : "btn btn-default", //按钮样式 
			slugCallback : function(filename) {
				return filename.replace('(', '_').replace(']', '_');
			}
		});

		//异步上传返回结果处理
		$("#file-1").on("fileuploaded",
				function(event, data, previewId, index) {
					console.log(data.id);
					console.log(data.index);
					console.log(data.file);
					console.log(data.reader);
					console.log(data.files);
				});
	</script>
</body>
</html>

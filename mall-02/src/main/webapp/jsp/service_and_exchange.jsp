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
<link rel="stylesheet" href="${APP_PATH}/css/service_and_exchange.css" />
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
	<div id="ser_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
<!-- 					<li role="presentation" class="active"><a href="#o_yuan" -->
<!-- 						aria-controls="home" role="tab" data-toggle="tab">0元兑换</a></li> -->
<!-- 					<li role="presentation"><a href="#fill_pool" -->
<!-- 						aria-controls="profile" role="tab" data-toggle="tab">补差金额兑换</a></li> -->
<!-- 					<li role="presentation"><a href="#lucky_draw" -->
<!-- 						aria-controls="profile" role="tab" data-toggle="tab">积分抽奖</a></li> -->
					<li role="presentation" class="active"><a href="#type_analysis"
						aria-controls="profile" role="tab" data-toggle="tab">积分服务类型分析</a></li>
				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">


					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane" id="o_yuan">



						<div class="col-md-12" style="padding: 10px;">
							<div class="col-md-2">
								<span
									style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">0元兑换</span>
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
									<th><input type="checkbox" id="se_seall"></th>
									<th>会员昵称</th>
									<th>商品名称</th>
									<th>兑换时间</th>
									<th>积分花费</th>
									<th>操作</th>


								</tr>
							</thead>
							<tbody id="se_tb">

								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_sebar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
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

					<!-- 第二个 -->
					<div role="tabpanel" class="tab-pane" id="fill_pool">


						<div class="col-md-12" style="padding: 10px;">
							<div class="col-md-3">
								<span
									style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">补差金额兑换</span>
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
									<th><input type="checkbox" id="se_se2all"></th>
									<th>会员昵称</th>
									<th>商品名称</th>
									<th>兑换时间</th>
									<th>积分花费</th>
									<th>补差金额</th>
									<th>操作</th>


								</tr>
							</thead>
							<tbody>

								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_se2bar"></td>
									<td>和九条狗玩呢</td>
									<td>某名牌男装</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td>200</td>
									<td>9.9</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-zoom-in conlook"></span> <span
										class="glyphicon glyphicon-trash condelete"></span></td>
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



					<!-- 第三个 -->
					<div role="tabpanel" class="tab-pane" id="lucky_draw">


						<div class="col-md-12" style="padding: 10px;">
							<div class="col-md-2">
								<span
									style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">积分抽奖</span>
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
									<th><input type="checkbox" id="se_se3all"></th>
									<th>会员昵称</th>
									<th>优惠券名称</th>
									<th>现金红包</th>
									<th>时间</th>
									<th>操作</th>


								</tr>
							</thead>
							<tbody>

								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>

								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>




								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
								</tr>


								<tr>
									<td><input type="checkbox" name="se_se3bar"></td>
									<td>和九条狗玩呢</td>
									<td>满200减100某类型商品优惠券</td>
									<td>8.8</td>
									<td>2017/8/10&nbsp;&nbsp;11:50</td>
									<td id="se_operation"><span
										class="glyphicon glyphicon-trash condelete"></span></td>
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



					<!-- 第四个 -->
					<div role="tabpanel" class="tab-pane active" id="type_analysis">

						<div class="col-md-12">
							<div class="col-md-6">
								<div class="col-md-12">
									<br>
								</div>
								<div class="col-md-12">
									<div class="col-md-6">

										<select class="form-control" style="width: 150px;" id="search_select">
											<option value="2">会员昵称</option>
											<option value="3">会员姓名</option>
										</select>
									</div>
									<div class="col-md-6 col-md-pull-2">
										<div class="input-group">
											<input type="text" class="form-control" placeholder="搜索" id="searchInp">
											<span class="input-group-btn">
												<button class="btn btn-default" type="button" id="searchBtn">搜索</button>
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
											<th>忠诚度</th>
											<th>手机号</th>
											<th>操作</th>


										</tr>
									</thead>
									<tbody id="se_memtbody">
									
									</tbody>


								</table>
								
								<div class="col-md-12" id="form_bottom02">
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

		<div class="col-md-12">
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>

	</div>




	<script type="text/javascript"
		src="${APP_PATH}/js/service_and_exchange.js"></script>

	<!-- 查看的模态框 -->
	<div id="se_look_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">查看模态框</h4>
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

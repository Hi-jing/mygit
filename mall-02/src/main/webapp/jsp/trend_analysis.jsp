<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>商品销售趋势分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/trend_analysis.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>


<script type="text/javascript"
	src="${APP_PATH}/static/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"
	charset="UTF-8"></script>
<link
	href="${APP_PATH}/static/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet" media="screen">


</head>
<body>
	<div id="trend_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#trend_analysis"
						aria-controls="home" role="tab" data-toggle="tab">商品销售趋势分析</a></li>
				

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="trend_analysis">

						<div class="col-md-12">
								<div class="col-md-12">
									<br>
								</div>
								
								<div class="col-md-12">
								<div class="col-md-3" style="margin-left:50px; ">

									<select class="form-control" style="width: 110px;">
										<option>商品名称</option>
											<option>商品类型</option>
											<option>现价</option>
											<option>状态</option>
									</select>
								</div>
								<div class="col-md-3" style="margin-left:-150px; ">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="搜索">
										<span class="input-group-btn">
											<button class="btn btn-default" type="button">搜索</button>
										</span>
									</div>
								</div>
								<div class="col-md-3">
									<select class="form-control" style="width: 120px;">
										<option>商品类型1</option>
											<option>商品类型2</option>
											<option>商品类型3</option>
											<option>商品类型4</option>
											<option>商品类型5</option>
									</select>

								</div>
								<div class="col-md-2" style="margin-left:-150px; ">
									<button class="btn btn-primary" type="button">分析</button>
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
											<th>现价</th>
											<th>成本</th>
											<th>销量</th>
											<th>状态</th>
											<th>操作</th>


										</tr>
									</thead>
									<tbody>

										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
										</tr>
										
										<tr>
											<td>某品牌男装</td>
											<td>男装</td>
											<td>343</td>
											<td>322</td>
											<td>3232</td>
											<td>上架</td>
											<td><a href="javascript:line_analysis();">拆线图分析</a></td>
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
											<li><a href="#">4</a></li>
											<li><a href="#">5</a></li>
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

				</div>

			</div>








		</div>

		

	</div>

	<!-- 商品销售分析图 -->
	<div id="trend_bottom" class="row">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
		
			<div id="trend_analysis_echart" style="width: 100%; height: 450px;"></div>

		</div>



	</div>

<div class="col-md-12" style="background: #e6edf5;">
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>
	<script type="text/javascript"
		src="${APP_PATH}/js/trend_analysis.js"></script>







</body>
</html>

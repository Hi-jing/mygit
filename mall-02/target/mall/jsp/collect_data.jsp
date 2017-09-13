<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>数据汇总</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/collect_data.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>
<body>
	<div id="collect_data_content" class="row">
		<div style="height: 15%; width: 100%;"></div>
		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="padding: 10px;">

				<div class="col-md-2">
					<span style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">数据汇总信息表</span>
				</div>

				<div class="col-md-2">

					<select class="form-control">
						<option>订单编号</option>
						<option>商品名称</option>
						<option>会员昵称</option>
						<option>会员姓名</option>
						<option>会员等级</option>
						<option>商品类型</option>
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
					<button type="button" class="btn btn-info">导出数据</button>
				</div>




				<div class="col-md-4">
					<div class="col-md-4 col-md-offset-1">
						<p class="text-primary" style="font-size: 15px; padding-top: 5px;">每页显示</p>
					</div>
					<div class="col-md-4 col-md-pull-1">
						<select class="form-control">
							<option>5条</option>
							<option>10条</option>
							<option>15条</option>
							<option>20条</option>
						</select>
					</div>

					<div class="col-md-2 col-md-pull-1">
						<button type="button" class="btn btn-primary">应用</button>
					</div>


				</div>


			</div>

			<table class="table table-bordered">
				<thead>

					<tr style="background: #EFEDED;">
				
						<th>订单编号</th>
						<th>商品名称</th>
						<th>会员昵称</th>
						<th>会员姓名</th>
						<th>会员等级</th>
						<th>商品类型</th>
						<th>商品规格</th>
						<th>消费金额</th>
						<th>消费积分</th>
						<th>购买数量</th>
						<th>购买方式</th>
						<th>下单时间</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>


					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

					</tr>
					
					<tr>
						<td>4564165</td>
						<td>某品牌男装</td>
						<td>和九条狗玩呢</td>
						<td>林统东</td>
						<td>vip3</td>
						<td>男装</td>
						<td>白色</td>
						<td>123</td>
						<td>200</td>
						<td>2</td>
						<td>会员卡</td>
						<td>2017/8/10&nbsp;&nbsp;11:50</td>

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


		<div class="col-md-12">
			<br> <br> <br> <br>
			<br> <br> <br> <br>
			<br> <br> <br> <br>
			<br> <br> <br> <br>
		</div>

	</div>


	<script type="text/javascript" src="${APP_PATH}/js/collect_data.js"></script>

	

</body>
</html>

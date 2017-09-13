<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>商品销售排名分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/sale_rank.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>
<body>
	<div id="sal__top" class="row">
		<div style="height: 15%; width: 100%;"></div>
		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="padding: 10px;">

				<div class="col-md-2">
					<span style="color: #3ca0ec; font-size: 20px; margin-left: -15px;">商品销售排名</span>
				</div>

				<div class="col-md-2">


					<select class="form-control">
						<option>商品编号</option>
						<option>商品名称</option>
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


				<div class="col-md-2 ">
					<button type="button" class="btn btn-info" id="unified_into">导出数据</button>
				</div>


			</div>

			<table class="table table-bordered">
				<thead>

					<tr style="background: #EFEDED;">
						<th>排名</th>
						<th>商品编号</th>
						<th>商品名称</th>
						<th>商品类型</th>
						<th>成本</th>
						<th>销量</th>
						<th>利润</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

					</tr>
					
					
						<tr>
						<td>1</td>
						<td>23423523</td>
						<td>某品牌男装</td>
						<td>男装</td>
						<td>233</td>
						<td>543543</td>
						<td>3543</td>
						<td>下架</td>
						<td><a href="javascript:look_details();">查看详情</a></td>

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
		
		<div class="col-md-12"><br><br><br><br><br><br><br>
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>

	</div>



	<script type="text/javascript"
		src="${APP_PATH}/js/sale_rank.js"></script>

	<!-- 商品详情信息的模态框 -->
	<div id="goods_details_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-header">
					<h4 class="modal-title">商品详情信息模态框</h4>
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

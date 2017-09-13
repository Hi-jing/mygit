<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>新世纪商城中台管理系统</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/home.css" />

<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${APP_PATH}/css/home_content.css" />
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/static/icheck-1.x/skins/square/blue.css" />
<script src="${APP_PATH}/static/icheck-1.x/icheck.js"></script>
<script>
	
</script>
<title>会员中台系统</title>
</head>
<body>
	<script src="${APP_PATH}/js/home.js"></script>
	<div id="left">
		<div id="le_top">
			<div id="lt_content">
				<img src="images/index/logo.png">
				<p>新世纪商城</p>
			</div>
		</div>
		<div id="le_bottom">

			<ul id="nav_ul">

				<li>
					<div class='first_1' name="home_content.jsp">
						<span class="glyphicon glyphicon-home"></span> <span
							class="nav_title">主页</span>
					</div>
				</li>



				<li>
					<div class='first'>
						<span class="glyphicon glyphicon-user"></span><span
							class="nav_title">会员管理</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="mem_file.jsp"><span
							class="glyphicon glyphicon-triangle-right"></span>档案管理</li>
						<li value="mem_integral.jsp"><span
							class="glyphicon glyphicon-triangle-right"></span>积分服务</li>
<!-- 						<li value="action_trace.jsp"><span class="glyphicon glyphicon-triangle-right"></span>行为跟踪</li> -->
<!-- 						<li value="consumer_stored_value.jsp"><span class="glyphicon glyphicon-triangle-right"></span>消费储值</li> -->
					</ul>
				</li>


				<li>
					<div class='first'>
						<span class="glyphicon glyphicon-bookmark"></span><span
							class="nav_title">积分营销</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="service_and_exchange.jsp"><span class="glyphicon glyphicon-triangle-right"></span>积分换购分析</li>

					</ul>
				</li>


				<li>
					<div class='first'>
						<span class="glyphicon glyphicon-link"></span><span
							class="nav_title">会员互动</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="mem_care.jsp"><span class="glyphicon glyphicon-triangle-right"></span>会员关怀</li>
						<li value="mem_visit.jsp"><span class="glyphicon glyphicon-triangle-right"></span>会员回访</li>

					</ul>
				</li>



				<li>
					<div class='first'>
						<span class="glyphicon glyphicon-list-alt"></span><span
							class="nav_title">会员分析</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="consumption_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>消费分析</li>
						<li value="regional_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>地域分析</li>
						<li value="loyalty_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>忠诚度分析</li>
<!-- 						<li value="gift_exchange.jsp"><span class="glyphicon glyphicon-triangle-right"></span>礼品兑换分析</li> -->
						<li value="grade_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>等级分析</li>
						<li value="loss_warning.jsp"><span class="glyphicon glyphicon-triangle-right"></span>会员流失预警</li>
						<li value="group_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>会员群体分析</li>
<!-- 						<li value="shoppingtime_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>购物时段分析</li> -->
						<li value="shoppingamount_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>购物金额分析</li>
						<li value="shoppingcategory_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>购物品类分析</li>
<!-- 						<li value="promotion_response.jsp"><span class="glyphicon glyphicon-triangle-right"></span>促销活动响应</li> -->

					</ul>
				</li>



				<li>
					<div class='first'>
						<span class="glyphicon glyphicon-tags"></span><span
							class="nav_title">销售分析</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="inventory_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>商品库存排名</li>
<!-- 						<li value="sale_rank.jsp"><span class="glyphicon glyphicon-triangle-right"></span>商品销售排名</li> -->
						<li value="trend_analysis.jsp"><span class="glyphicon glyphicon-triangle-right"></span>品类销售与趋势</li>
						<li value="promote_sales.jsp"><span class="glyphicon glyphicon-triangle-right"></span>推广与销售</li>

					</ul>
				</li>



				<li>
					<div class='first' id="special">
						<span class="glyphicon glyphicon-euro"></span><span
							class="nav_title">数据挖掘</span><span
							class="glyphicon glyphicon-menu-left"></span>
					</div>
					<ul class='second'>
						<li value="collect_data.jsp" id="li_special"><span class="glyphicon glyphicon-triangle-right"></span>数据汇总</li>

					</ul>
				</li>

<!-- 				<li> -->
<!-- 					<div class='first' id="special"> -->
<!-- 						<span class="glyphicon glyphicon-phone"></span><span -->
<!-- 							class="nav_title">移动引擎</span><span -->
<!-- 							class="glyphicon glyphicon-menu-left"></span> -->
<!-- 					</div> -->
<!-- 					<ul class='second'> -->
<!-- 						<li id="li_special" value="sms_email.jsp"><span class="glyphicon glyphicon-triangle-right"></span>短信与邮件营销</li> -->

<!-- 					</ul> -->

<!-- 				</li> -->



			</ul>

		</div>
	</div>


	<div id="right">
		<div id="top">
			<div id="t_top">
				<div id="tt_left">
					<span class="glyphicon glyphicon-user"> ${name} </span>
				</div>
				<div id="tt_right">
					<span class="glyphicon glyphicon-cog"> </span> <span
						class="glyphicon glyphicon-info-sign"> </span> <span
						class="glyphicon glyphicon-log-out"> </span>
				</div>
			</div>
			<div id="t_title">
				<ol class="breadcrumb" id="path_nav">
				</ol>
			</div>
		</div>
		<div id="content"></div>
	</div>

	<!-- 个人资料与权限设置的模态框 -->
	<div id="setting_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">

				<div class="modal-body">
					<div>
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#personal_data"
								aria-controls="home" role="tab" data-toggle="tab">个人资料</a></li>
							<li role="presentation"><a href="#permission"
								aria-controls="profile" role="tab" data-toggle="tab">权限设置</a></li>

						</ul>

						<!-- Tab panes -->
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane active" id="personal_data">个人资料</div>
							<div role="tabpanel" class="tab-pane" id="permission">权限设置</div>

						</div>

					</div>
				</div>


				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">保存</button>
				</div>


			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

</body>
</html>

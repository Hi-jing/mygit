<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>会员群体分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/shoppingtime_analysis.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/echarts.min.js"></script>
<script src="${APP_PATH}/static/jQueryDistpicker/distpicker.data.js"></script>
<script src="${APP_PATH}/static/jQueryDistpicker/distpicker.js"></script>
<script src="${APP_PATH}/static/jQueryDistpicker/main.js"></script>

</head>
<body>
	<div id="shop_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a
						href="#line_analysis" aria-controls="home" role="tab"
						data-toggle="tab">折线图分析</a></li>
					<li role="presentation"><a
						href="#bread_analysis" aria-controls="home" role="tab"
						data-toggle="tab">饼图分析</a></li>

				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">


					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="line_analysis">

						<div class="col-md-12">
							<div class="col-md-6">
								<div id="shoppingtime_analysis_echart01"
									style="width: 1100px; height: 400px;"></div>
							</div>


						</div>



					</div>

					<!-- 第二个 -->
					<div role="tabpanel" class="tab-pane" id="bread_analysis">

						<div class="col-md-12">
							<div class="col-md-6">
								<div id="shoppingtime_analysis_echart02"
									style="width: 1000px; height: 400px;"></div>
							</div>


						</div>



					</div>
					<div class="col-md-12">
						<br> <br> <br> <br>
						<br> 
					</div>

				</div>

			</div>








		</div>



	</div>


	<div class="col-md-12" style="background: #e6edf5;">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
	</div>
	<script type="text/javascript" src="${APP_PATH}/js/shoppingtime_analysis.js"></script>






</body>
</html>

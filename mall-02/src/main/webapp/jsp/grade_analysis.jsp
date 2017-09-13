<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>等级分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/grade_analysis.css" />
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


	<!-- 会员等级销售分析折线图 -->
	<div id="gr_bottom" class="row">

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12" style="height: 15px; width: 100%;"></div>
<!-- 			<div class="col-md-12"> -->

<!-- 				<div class="col-md-5"> -->
<!-- 					<div class="col-md-4 col-md-offset-2"> -->
<!-- 						<span class="date_time">开始时间:</span> -->
<!-- 					</div> -->
<!-- 					<div class="input-group date form_date col-md-6 col-md-pull-1"> -->
<!-- 						<span class="input-group-addon"><span -->
<!-- 							class="glyphicon glyphicon-calendar"></span></span> <input -->
<!-- 							class="form-control" type="text" value="" readonly> -->


<!-- 					</div> -->
<!-- 				</div> -->
<!-- 				<div class="col-md-5"> -->
<!-- 					<div class="col-md-4 col-md-pull-1"> -->
<!-- 						<span class="date_time">结束时间:</span> -->
<!-- 					</div> -->
<!-- 					<div class="input-group date form_date col-md-6 col-md-pull-2" -->
<!-- 						id="end_time"> -->
<!-- 						<span class="input-group-addon"><span -->
<!-- 							class="glyphicon glyphicon-calendar"></span></span> <input -->
<!-- 							class="form-control" type="text" value="" readonly> -->


<!-- 					</div> -->
<!-- 				</div> -->

<!-- 			</div> -->
			<div class="col-md-12">
				<br> <br>
			</div>
			<div id="grade_analysis_echart" style="width: 100%; height: 400px;"></div>

			<div class="col-md-12">
				<br> <br> <br> <br> <br> <br>
			</div>
		</div>

		<div class="col-md-12">
			<br><br>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br> <br>
		</div>

	</div>




	<script type="text/javascript" src="${APP_PATH}/js/grade_analysis.js"></script>






</body>
</html>

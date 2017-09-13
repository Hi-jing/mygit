<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width" name="viewport">
<title>地域分析</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH}/css/regional_analysis.css" />
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
	<div id="region_top" class="row">
		<div style="height: 15%; width: 100%;"></div>

		<div class="col-md-12" style="background: #fff; border-radius: 5px;">
			<div class="col-md-12">

				<div class="col-md-12">
					<div style="height: 15px; width: 100%;"></div>
				</div>
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a
						href="#region_analysis" aria-controls="home" role="tab"
						data-toggle="tab">地域分析</a></li>


				</ul>

				<!-- Tab panes -->
				<div class="tab-content row">




					<!-- 第一个 -->
					<div role="tabpanel" class="tab-pane active" id="region_analysis">

						<div class="col-md-12">
							<div class="col-md-6">
								<div id="regional_analysis_echart"
									style="width: 800px; height: 360px;"></div>
							</div>
							<div class="col-md-6" style="padding-left: 60px;">
								<div class="col-md-12">
							
									<div class="col-md-12" style="padding-top: 50px;">
										<h4>地理位置：</h4>
									</div>
									
									<div class="docs-methods" style="padding-top: 100px;">
										<form class="form-inline">
											<div id="distpicker">
												<div class="form-group">
													<label class="sr-only" for="province">Province</label> <select
														class="form-control" id="province"></select>
												</div>
												<div class="form-group">
													<label class="sr-only" for="city">City</label> <select
														class="form-control" id="city"></select>
												</div>
												<div class="form-group">
													<label class="sr-only" for="district">District</label> <select
														class="form-control" id="district"></select>
												</div>
												

											</div>
										</form>
									</div>
									<div class="col-md-12 col-md-offset-2" style="padding-top: 30px;">
													<div class="form-group">
														<button type="button" class="btn btn-primary">分析占比</button>
														<button class="btn btn-warning" id="reset-deep"
															type="button">&nbsp;&nbsp;&nbsp;&nbsp;重置&nbsp;&nbsp;&nbsp;&nbsp;</button>

													</div>
												</div>
									
								</div>



							</div>

						</div>







					</div>
					<div class="col-md-12">
						<br> <br> <br> <br><br> <br> <br> <br>
					</div>

				</div>

			</div>








		</div>



	</div>


	<div class="col-md-12" style="background: #e6edf5;">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>
	</div>
	<script type="text/javascript"
		src="${APP_PATH}/js/regional_analysis.js"></script>






</body>
</html>

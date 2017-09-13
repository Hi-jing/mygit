<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<link href="${APP_PATH}/static/fileinput/css/fileinput.css" media="all"
	rel="stylesheet" type="text/css" />
<script src="${APP_PATH}/static/fileinput/js/fileinput.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/fileinput/js/fr.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/fileinput/js/es.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="container kv-main">




		<form enctype="multipart/form-data">

			<div class="form-group">
				<input id="file-1" type="file" name="files" multiple class="file"
					data-overwrite-initial="false" data-min-file-count="2">
			</div>

		</form>



	</div>


	<script>
		$("#file-1").fileinput({
			uploadUrl : '${APP_PATH}/pic02', // you must set a valid URL here else you will get an error
			allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
			overwriteInitial : false,
			maxFileSize : 1000,
			maxFilesNum : 10,
			//allowedFileTypes: ['image', 'video', 'flash'],
			slugCallback : function(filename) {
				return filename.replace('(', '_').replace(']', '_');
			}
		});
	</script>
</body>
</html>
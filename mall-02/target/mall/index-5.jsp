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
</head>
<body>

<!-- <form method="POST" action="" enctype="multipart/form-data" > -->
	01: <input type="file" name="files1" id="file1"/> 
	02: <input type="file" name="files2" id="file2"/> 
	03： <input type="file" name="files3" id="file3"/> 
	04： <input type="file" name="files4" id="file4"/> 
	05： <input type="file" name="files5" id="file5"/>  
    <button type="button" id="submitId">点击上传</button>  
<!-- </form>     -->


  
<script src="${APP_PATH}/static/ajaxfileupload.js"></script>  
<script>  
    $("#submitId").on("click",function () {  
        $.ajaxFileUpload({  
            url:"${APP_PATH}/pic", //你处理上传文件的服务端  
            type: 'post',
            secureuri:false,//是否启用安全机制  
            fileElementId:"file1",
            dataType: 'application/json',
            success: function (data) {   //调用成功时怎么处理  
              alert("上传成功");  
            }  
        });  


//     	$.ajaxFileUpload({  
//             url : "${APP_PATH}/pic",  
//             secureuri : false,  
//             //fileElementId:'uploadfile1',//原使用方法  
//              fileElementId:['file1','file2','file3','file4','file5'],//现使用方法  
//             dataType : 'json',  
//             success : function(data) {  
//                 ajaxLoadEnd();  
//                 if (data.result == "success") {  
//                     $.messager.alert('信息','导入成功。','info');  
//                 } else {  
//                     $('#import_right').dialog('open');  
//                     $.messager.alert('信息','导入失败。<br>错误信息：'+data.message,'error');  
//                 }  
//             },  
//             error : function(data, status, e)  
//             {  
//                 ajaxLoadEnd();  
//                 $.messager.alert('信息','导入失败。<br>错误信息：网络异常或表单数据错误。','error');  
//             }  
//         });
    	
    	
    });  
</script>  
</body>
</html>
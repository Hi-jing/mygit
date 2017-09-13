<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工列表</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());


%>

<!--	web路径问题
不以/开始的相对路径，找资源是以当前路径为基准，经常出现问题
以/开始的相对路径，找资源是以服务器的路径为基准（http://localhost:3306）,再加上自己的项目名 
 -->
 
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>


<!-- 修改模态框 -->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">员工修改</h4>
				</div>
				<div class="modal-body">

					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">empName</label>
							<div class="col-sm-10">
								<input type="text" name="empName" class="form-control"
									id="emp_name2" placeholder="name"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">email</label>
							<div class="col-sm-10">
								<input type="text" name="email" class="form-control"
									id="emp_email2" placeholder="email@qq.com"> <span
									class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">gender</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="gender" id="gender2" value="M" checked="checked">
									男
								</label> <label class="radio-inline"> <input type="radio"
									name="gender" id="gender2" value="F"> 女
								</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">deptName</label>
							<div class="col-sm-4">
								<select class="form-control" name="eId">

								</select>
							</div>
						</div>


					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="update_emp">更新</button>
				</div>
			</div>
		</div>
	</div>
	
	
	

	<!-- 新增模态框 -->
	<div class="modal fade" id="addModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">员工增加</h4>
				</div>
				<div class="modal-body">

					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">empName</label>
							<div class="col-sm-10">
								<input type="text" name="empName" class="form-control"
									id="emp_name" placeholder="name"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">email</label>
							<div class="col-sm-10">
								<input type="text" name="email" class="form-control"
									id="emp_email" placeholder="email@qq.com"> <span
									class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">gender</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="gender" id="gender1" value="M" checked="checked">
									男
								</label> <label class="radio-inline"> <input type="radio"
									name="gender" id="gender1" value="F"> 女
								</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">deptName</label>
							<div class="col-sm-4">
								<select class="form-control" name="eId">

								</select>
							</div>
						</div>


					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="save_emp">保存</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>SSM-CRUD</h1>
			</div>
		</div>

		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button type="button" class="btn btn-primary" id="add_model">新增</button>
				<button type="button" class="btn btn-danger">删除</button>
			</div>
		</div>

		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_table">
					<thead>
						<tr>
							<th>#</th>
							<th>empName</th>
							<th>gender</th>
							<th>email</th>
							<th>deptName</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>

					</tbody>


				</table>
			</div>
		</div>


		<!-- 分页 -->
		<div class="row">
			<div class="col-md-6" id="page_info"></div>
			<div class="col-md-6" id="page_nav"></div>
		</div>

	</div>

	<script type="text/javascript">
		var totalRecord;
		//1、页面加载完成以后，直接去发送ajax请求，要到分页数据
		$(function() {

			to_page(1);
		});

		function to_page(pn) {

			$.ajax({
				url : "${APP_PATH}/emps",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {

					//console.log(result);
					//1、解析员工信息
					build_emps_table(result);
					//2、解析分页条信息
					build_page_info(result);
					build_page_nav(result);
				}
			});
		}

		function build_emps_table(result) {
			$("#emps_table tbody").empty();
			var emps = result.extend.pageInfo.list;
			$.each(emps, function(index, item) {
				var empIdTd = $("<td></td>").append(item.empId);
				var empNameTd = $("<td></td>").append(item.empName);
				var ganderTd = $("<td></td>").append(
						item.gender == "M" ? "男" : "女");
				var emailTd = $("<td></td>").append(item.email);
				var deptNameTd = $("<td></td>")
						.append(item.department.deptName);
				var editButton = $("<button></button>").addClass(
						"btn btn-primary btn-sm edit_btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-pencil")).append("编辑");
				var deleteButton = $("<button></button>").addClass(
						"btn btn-danger btn-sm delete_btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-remove")).append("删除");
				var btn = $("<td></td>").append(editButton).append(" ").append(
						deleteButton);
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>").append(empIdTd).append(empNameTd).append(
						ganderTd).append(emailTd).append(deptNameTd)
						.append(btn).appendTo("#emps_table tbody");
			})
		}

		//解析分页信息
		function build_page_info(result) {
			$("#page_info").empty();
			$("#page_info").append(
					"当前第" + result.extend.pageInfo.pageNum + "页，有"
							+ result.extend.pageInfo.pages + "页，共有"
							+ result.extend.pageInfo.total + "条记录")

			totalRecord = result.extend.pageInfo.total;
		}

		//解析分页条信息
		function build_page_nav(result) {
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页").attr("href", "#"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));

			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				firstPageLi.click(function() {
					to_page(1);
				})
				prePageLi.click(function() {
					to_page(result.extend.pageInfo.pageNum - 1);
				})
			}

			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var finalPageLi = $("<li></li>").append(
					$("<a></a>").append("尾页").attr("href", "#"));

			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				finalPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					to_page(result.extend.pageInfo.pageNum + 1);
				})
				finalPageLi.click(function() {
					to_page(result.extend.pageInfo.pages);
				})
			}

			ul.append(firstPageLi).append(prePageLi);

			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}

				numLi.click(function() {
					to_page(item);
				})
				ul.append(numLi);

			})
			ul.append(nextPageLi).append(finalPageLi);

			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");
		}

		function reset_form(ele) {
			$(ele)[0].reset();
			//清空表单样式
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		
		$("#add_model").click(function() {
			//表单重置
			reset_form("#addModal form");
			
			$("#addModal select").empty();
			getDepts();
			$('#addModal').modal({
				backdrop : "static"
			});

		});

		/**
		显示部门信息
		*/
		function getDepts() {
			$.ajax({
				url : "${APP_PATH}/depts",
				type : "GET",
				success : function(result) {
					//console.log(result);
					//显示部门信息
					$.each(result.extend.depts, function() {
						//						$("#addModal select").append
						var optionEle = $("<option></option>").append(
								this.deptName).attr("value", this.deptId);
						optionEle.appendTo("#addModal select");
					})

				}
			});
		}

		//校验方法
		function testRight() {
			var empName = $("#emp_name").val();
			var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;

			if (!regName.test(empName)) {
				//alert("用户名可以是2-5位中文或是6-16位英文和数字组合");

				show_validate_msg("#emp_name", "error",
						"用户名可以是2-5位中文或是6-16位英文和数字组合");
				return false;
			} else {
				show_validate_msg("#emp_name", "success", "");
			}
			;

			var email = $("#emp_email").val();
			var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if (!regEmail.test(email)) {
				//alert("邮箱不正确");

				show_validate_msg("#emp_email", "error", "邮箱不正确");
				return false;
			} else {
				show_validate_msg("#emp_email", "success", "");
			}
			;

			return true;
		}

		function show_validate_msg(ele, status, msg) {
			//清除当前元素的校验状态
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
			if ("success" == status) {
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text(msg);
			} else if ("error" == status) {
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
			}
		}
		//ajax保存员工信息
		$("#save_emp").click(function() { 
			alert($("#addModal form").serialize());
			//保存前先jquery校验
			if (!testRight()) {
				return false;
			};
			if($(this).attr("ajax-va") == "error"){
				return false;
			}
			$.ajax({
				url : "${APP_PATH}/emp",
				type : "POST",
				data : $("#addModal form").serialize(),
				success : function(result) {
					if (result.code ==100) {
						//关闭模态框
						$("#addModal").modal("hide");
						//跳转刚插入的数据显示
						to_page(totalRecord);
					}else{
						//console.log(result);
						//有哪 个字段的错误信息
// 						alert(result.extend.errorFields.email);
// 						alert(result.extend.errorFields.empName);
						if (undefined != result.extend.errorFields.email) {
							//显示邮箱错误
							show_validate_msg("#emp_email", "error", result.extend.errorFields.email);
						}
						if (undefined != result.extend.errorFields.empName) {
							//显示名字错误
							show_validate_msg("#emp_name", "error", result.extend.errorFields.empName);
						}
					}
					
				}
			});

		});
		
		//用户名唯一校验
		$("#emp_name").change(function () {
			var empName = this.value;
			//发送ajax
			$.ajax({
				url : "${APP_PATH}/checkuser",
				type : "POST",
				data : "empName="+empName,
				success : function(result) {
					if (result.code == 100) {
						show_validate_msg("#emp_name", "success", "用户名可用");
						$("#save_emp").attr("ajax-va","success");
					}else {
						show_validate_msg("#emp_name", "error", result.extend.va_msg);
						$("#save_emp").attr("ajax-va","error");
					}
				}
			});
		});
		
		
		
	</script>
</body>
</html>
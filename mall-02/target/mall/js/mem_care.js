// JavaScript Document
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
var recordRow;
$(document).ready(function() {

			// 复选框添加全选或非合适的事件
			electAll();

			// 使用icheckrt插件给单选框复选框添加样式
			initialize();

			// 操作事件
			operation();

			// 时期操作
			time_opertion();

			getLookGoodDetails();

			$("#sale_select").change(function() {
						var opt = $("#sale_select").val();
						if (opt == "2") {
							$(".in_input").removeAttr("disabled");
						} else {
							$(".in_input").attr("disabled", true);
						}

						if (opt == "3") {
							$(".date_input").removeAttr("disabled");
						} else {
							$(".date_input").attr("disabled", true);

						}

					});

		});

function time_opertion() {
	$('.form_date').datetimepicker({
				todayBtn : 1,
				autoclose : 1,
				startView : 1,
				minView : 1
			});

	// 结束时间改变时触发事件
	$('#end_time').datetimepicker().on('changeDate', function(ev) {

			});
}

function operation() {
	
		$("#export_Good").on("click", function() {
				postcall(getRootPath() + "/good/excel/export", null, null);
			});
			
			
			
	$("#se_operation > span").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".conlook").click(function() {
				$("#se_look_modal").modal("show");
			})
	$(document).on("mouseover", ".saleedit", function() {
				$(this).css("cursor", "pointer");
			});

	$(document).on("click", ".saleedit", function() {
				$("#look_sale_modal").modal("show");
			})
	$(document).on("click", ".saledelete", function() {
				if (confirm("确认要删除吗?")) {
					alert("true");
				} else {
					alert("false");
				}
			});

	$(".se_nav_li > a").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".se_nav_li > a").click(function() {
				$("#se_nav_condition").text($(this).text());
			});

	$('input[id=lefile01]').change(function() {
				$('#photoCover01').val($(this).val());
			});

	$('input[id=lefile02]').change(function() {
				$('#photoCover02').val($(this).val());
			});

	$('input[id=lefile03]').change(function() {
				$('#photoCover03').val($(this).val());
			});

	$('input[id=lefile04]').change(function() {
				$('#photoCover04').val($(this).val());
			});

	$('input[id=lefile05]').change(function() {
				$('#photoCover05').val($(this).val());
			});

	// ajax保存商品信息
	$("#save_goodmsg").click(function() {
				// alert(getRootPath());

				$.ajax({
					url : getRootPath() + "/saveGoodMsg",
					type : "POST",
					dataType : 'json',
					data : $("#good_form").serialize(),
					success : function(result) {
						// jump_page("mem_care.jsp");
						alert(result.code);
					}
						// ,
						// error:function(XMLHttpRequest, textStatus,
						// errorThrown){
						// alert("请求对象XMLHttpRequest: "+XMLHttpRequest);
						// alert("错误类型textStatus: "+textStatus);
						// alert("异常对象errorThrown: "+errorThrown);
						// }
					});

			});

	// ajax保存商品信息
	$("#save_goodPic").click(function() {

		alert($("#ceshiform").serialize());
			/*
			 * $.ajax({ url : getRootPath()+"/uploadHeadPhoto", type : "POST", //
			 * data : $("#good_form").serialize(), success : function(result) {
			 * if (result.code == 100) { alert("请求成功"); }else{ alert("请求失败"); } },
			 * error:function(XMLHttpRequest, textStatus, errorThrown){
			 * alert("请求对象XMLHttpRequest: "+XMLHttpRequest);
			 * alert("错误类型textStatus: "+textStatus); alert("异常对象errorThrown:
			 * "+errorThrown); } });
			 */

		});

	$("#close_model").click(function() {
				$("#add_sign").removeClass("glyphicon glyphicon-info-sign");
				$("#add_sign").addClass("glyphicon glyphicon-ok-sign");
				$("#add_sign").css("color", "green");

			})

}

// ajax请求跳转页面
function jump_page(str) {

	var jPage = "jsp/" + str;
	$.ajax({
				url : getRootPath() + "/jumpPage",
				type : "GET",
				dataType : "html",
				success : function(result) {
					$("#content").empty();
					$("#content").load(jPage);
				}
			});
}

// 复选框添加全选或非合适的事件
function electAll() {
	$('#se_seall').on('ifChecked', function() {
				$("[name='se_sebar']").iCheck('check');
			});

	$('#se_seall').on('ifUnchecked', function() {
		$("[name='se_sebar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});

	$('#se_se2all').on('ifChecked', function() {
				$("[name='se_se2bar']").iCheck('check');
			});

	$('#se_se2all').on('ifUnchecked', function() {
		$("[name='se_se2bar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});

	$('#se_se3all').on('ifChecked', function() {
				$("[name='se_se3bar']").iCheck('check');
			});

	$('#se_se3all').on('ifUnchecked', function() {
		$("[name='se_se3bar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});

}

// 使用icheckrt插件给单选框复选框添加样式
function initialize() {

	// $("input").iCheck({
	// checkboxClass : "icheckbox_square-blue",
	// radioClass : "iradio_square-blue",
	// increaseArea : "20%"
	// });
}

function add_picture() {
	$("#add_picture_modal").modal("show");
}

// 获得根目录
function getRootPath() {
	var strFullPath = window.document.location.href;
	var strPath = window.document.location.pathname;
	var pos = strFullPath.indexOf(strPath);
	var prePath = strFullPath.substring(0, pos);
	var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
	return (prePath + postPath);
}

function getLookGoodDetails() {
	$.ajax({
				url : getRootPath() + "/good/getPromotionGood",
				type : "GET",
				dataType : 'json',
				success : function(result) {
					if (result.code == 100) {
						writeHtml(result);
					}
				}
			});
}

function isShelve(i) {
	if (i == 1) {
		return "已上架";
	} else {
		return "已下架";
	}
}

function writeHtml(result) {
	$("#mem_care_tbody").empty();
	$("#form_bottom").empty();
	for (var i = 0; i < result.extend.pageInfo.list.length; i++) {
		var html = '<tr>' + '<td>' + result.extend.pageInfo.list[i].goName
				+ '</td>' + '<td>' + result.extend.pageInfo.list[i].goType
				+ '</td>' + '<td>'
				+ result.extend.pageInfo.list[i].go_kind.kiNowprice + '</td>'
				+ '<td>' + result.extend.pageInfo.list[i].goBuysum + '</td>'
				+ '<td>' + result.extend.pageInfo.list[i].goTotal + '</td>'
				+ '<td>'
				+ isShelve(result.extend.pageInfo.list[i].go_kind.kiState)
				+ '</td>' + '<td id="se_operation">'
				+ '<span class="glyphicon glyphicon-pencil saleedit" myAttr="'
				+ result.extend.pageInfo.list[i].goId + '"></span>'
				+ '</td></tr>';
		$("#mem_care_tbody").append(html);
	}

	var html02 = '<div class="col-md-4">'
			+ '<span style="float: left;">'
			+ '当前第'
			+ result.extend.pageInfo.pageNum
			+ '页，'
			+ '共'
			+ result.extend.pageInfo.pages
			+ '页，'
			+ '共有'
			+ result.extend.pageInfo.total
			+ '条记录</span></div>'
			+ '<div class="col-md-8">'
			+ '<nav aria-label="Page navigation" style="float:right;margin-top: -3%;">'
			+ '<ul class="pagination">'
			+ '<li><a href="javascript:homePage();"> <span>首页</span>'
			+ '</a></li>' + '<li id="pre"><a href="javascript:jumpPage('
			+ (result.extend.pageInfo.pageNum - 1)
			+ ');"> <span>&laquo;</span>' + '</a></li>' + ''
			+ getLiSum(5, result.extend.pageInfo.pageNum) + ''
			+ '<li><a href="javascript:jumpPage('
			+ (result.extend.pageInfo.pageNum + 1)
			+ ');"> <span>&raquo;</span>' + '</a></li>'
			+ '<li><a href="javascript:jumpPage('
			+ result.extend.pageInfo.pages + ');"> <span>尾页</span>'
			+ '</a></li>' + '</ul>' + '</nav>' + '</div>';

	$("#form_bottom").append(html02);
	recordRow = result.extend.pageInfo.pageNum;

}

/*
 * 跳转表单信息
 */
function jumpPage(fin) {

	$.ajax({
				url : getRootPath() + "/good/getPromotionGood",
				type : "GET",
				dataType : "json",
				data : "pn=" + fin,
				success : function(result) {
					writeHtml(result);
				}
			});

}

function homePage() {
	$.ajax({
				url : getRootPath() + "/good/getPromotionGood",
				type : "GET",
				dataType : "json",
				data : "pn=" + 1,
				success : function(result) {
					writeHtml(result);
				}
			});

}

/*
 * 根据页数写入li
 */
function getLiSum(inter, inter02) {
	var str = "";
	if (inter02 < inter) {
		for (var i = 0; i < inter; i++) {
			if (inter02 == (i + 1)) {
				str += '<li class="active"><a href="javascript:jumpPage('
						+ (i + 1) + ');">' + (i + 1) + '</a></li>';
			} else {
				str += '<li><a href="javascript:jumpPage(' + (i + 1) + ');">'
						+ (i + 1) + '</a></li>';
			}

		}
	} else {
		for (var i = (inter02 - 5); i < inter02; i++) {
			if (inter02 == (i + 1)) {
				str += '<li class="active"><a href="javascript:jumpPage('
						+ (i + 1) + ');">' + (i + 1) + '</a></li>';
			} else {
				str += '<li><a href="javascript:jumpPage(' + (i + 1) + ');">'
						+ (i + 1) + '</a></li>';
			}

		}
	}

	return str;
}


/*
 * 伪异步post操作
 */
function postcall(url, params, target) {
	var tempform = document.createElement("form");
	tempform.action = url;
	tempform.method = "get";
	tempform.style.display = "none"
	if (target) {
		tempform.target = target;
	}

	for (var x in params) {
		var opt = document.createElement("input");
		opt.name = x;
		opt.value = params[x];
		tempform.appendChild(opt);
	}

	var opt = document.createElement("input");
	opt.type = "submit";
	tempform.appendChild(opt);
	document.body.appendChild(tempform);
	tempform.submit();
	document.body.removeChild(tempform);
}


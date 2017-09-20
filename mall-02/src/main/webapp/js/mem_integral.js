// JavaScript Document
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
var recordRow;
$(document).ready(function() {
			in_operation();
			initialize();
			getMemIntegral();

			operation();
		});
		
		
function operation() {
		$("#export").on("click", function() {
				postcall(getRootPath() + "/member/integral/record/excel/export", null, null);
			});
			
		$("#search_or").on("click", function() {
				$.ajax({
					url : getRootPath() + "/member/integral/record/searchOrder",
					type : "GET",
					dataType : "json",
					data : "like=" + $("#search_text").val(),
					success : function(result) {
						writeHtml(result);
					}
				});
				
			});
}

		
/*
 * 伪异步post操作,处理导出数据
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



/**
 * 以下是对表的信息写入（ajax请求）
 */

function getMemIntegral() {
	$.ajax({
				url : getRootPath() + "/member/management/integral/query",
				type : "GET",
				dataType : "json",
				success : function(result) {
					writeHtml(result);
				}
			});
}

/*
 * 书写表单信息
 */
function writeHtml(result) {
	$("#mem_int_tbody").empty();
	$("#form_bottom").empty();
	for (var i = 0; i < result.extend.pageInfo.list.length; i++) {
		var html = '<tr>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].orId
				+ '</td>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].member.meNickname
				+ '</td>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].orDate
				+ '</td>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].orExpendval
				+ '</td>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].me_level.lePhase
				+ '</td>'
				+ '<td>'
				+ result.extend.pageInfo.list[i].orCostmoney
				+ '</td>'
				+ '<td><span class="glyphicon glyphicon-zoom-in inlook"></span></td>'
				+ '</tr>';

		$("#mem_int_tbody").append(html);
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
			+ '</a></li>'
			+ '<li id="pre"><a href="javascript:jumpPage('
			+ (result.extend.pageInfo.pageNum - 1)
			+ ');"> <span>&laquo;</span>'
			+ '</a></li>'
			+ ''
			+ getLiSum(5,
					result.extend.pageInfo.pageNum) + ''
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
				url : getRootPath() + "/member/management/integral/query",
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
				url : getRootPath() + "/member/management/integral/query",
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
		for (var i = (inter02-5); i < inter02; i++) {
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







function in_operation() {
	$(".inlook").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".inlook").click(function() {
				$("#in_look_modal").modal("show");
			})

	$(".inedit").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".inedit").click(function() {
				$("#in_edit_modal").modal("show");
			})

	$(".in_nav_li > a").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

}

// 使用icheckrt插件给单选框复选框添加样式
function initialize() {

	$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%"
			});
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
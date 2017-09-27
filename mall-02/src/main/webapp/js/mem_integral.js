// JavaScript Document
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
var recordRow;
$(document).ready(function() {
			in_operation();
			initialize();
			getMemIntegral();

			operation();
		});

function writeLevel(result) {
	for (var i = 0; i < result.extend.list.length; i++) {
		var html = '<tr>'
				+ '<td><span class="glyphicon glyphicon-pencil inedit" myAttr="'
				+ result.extend.list[i].leId + '"></span></td>' + '<td>'
				+ result.extend.list[i].lePhase + '</td>' + '<td>'
				+ getLevelName(result.extend.list[i].lePhase) + '</td>'
				+ '<td>' + result.extend.list[i].leDiscount * 10 + '%</td>'
				+ '<td>' + result.extend.list[i].leNeedgrowthvalue + '</td>'
				+ '</tr>';
		$("#level_tabel").append(html);
	}
}

function getLevelName(re) {
	if (re == "vip1") {
		return "普通会员";
	} else if (re == "vip2") {
		return "白银会员";
	} else if (re == "vip3") {
		return "黄金会员";
	} else if (re == "vip4") {
		return "白金会员";
	} else if (re == "vip5") {
		return "钻石会员";
	} else if (re == "vip6") {
		return "星耀会员";
	} else if (re == "vip7") {
		return "王者会员";
	}
}



function in_operation() {

	$(document).on("click", ".inedit", function() {
		/*
		 * 根据会员id得到会员等级信息
		 */
		$.ajax({
					url : getRootPath()
							+ "/member/management/level/getLevelMsg",
					type : "GET",
					dataType : "json",
					data : "leId=" + $(this).attr("myAttr"),
					success : function(result) {
						if (result.code == 100) {
							$("#input_vip").val(result.extend.levelmsg.lePhase);
							$("#input_name")
									.val(getLevelName(result.extend.levelmsg.lePhase));
							$("#input_val")
									.val(result.extend.levelmsg.leNeedgrowthvalue);
							$("#select_level").val([result.extend.levelmsg.leDiscount]);
						}
					}
				});
		$("#edit_memLevel_modal").modal("show");
	});

	/*
	 * 得到会员等级管理表信息
	 */
	$.ajax({
				url : getRootPath() + "/member/management/level",
				type : "GET",
				dataType : "json",
				success : function(result) {
					if (result.code == 100) {
						writeLevel(result);
					}
				}
			});

	$(document).on("mouseover", ".inlook", function() {
				$(this).css("cursor", "pointer");
			});

	$(document).on("click", ".inlook", function() {
		$.ajax({
			url : getRootPath() + "/member/integral/record/getOrderDetails",
			type : "GET",
			dataType : "json",
			data : "orid=" + $(this).attr("myAttr"),
			success : function(result) {
				if (result.code == 100) {
					$("#or_id").text(result.extend.myorder.orId);
					$("#or_name").text(result.extend.myorder.me_address.adName);
					$("#or_niname")
							.text(result.extend.myorder.member.meNickname);
					$("#or_ad")
							.text(result.extend.myorder.me_address.adDistrict
									+ " "
									+ result.extend.myorder.me_address.adAddress);
					$("#or_ph").text(result.extend.myorder.me_address.adPhone);
					$("#or_co")
							.text(result.extend.myorder.me_address.adZipcode);
					$("#or_date").text(result.extend.myorder.orDate);
					$("#or_pay").text(result.extend.myorder.orCostmoney);
					$("#or_in").text(result.extend.myorder.orExpendval);
					$("#or_type").text("积分订单");
					$("#or_msg").text(result.extend.myorder.orLeavemsg);
					$("#in_look_modal").modal("show");
				}
			}
		});

	});

	$(document).on("mouseover", ".inedit", function() {
				$(this).css("cursor", "pointer");
			});

	$(document).on("mouseover", ".in_nav_li > a", function() {
				$(this).css("cursor", "pointer");
			});

}

function operation() {
	$("#export").on("click", function() {
		postcall(getRootPath() + "/member/integral/record/excel/export", null,
				null);
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
				+ '<td><span class="glyphicon glyphicon-zoom-in inlook" myAttr="'
				+ result.extend.pageInfo.list[i].orId + '"></span></td>'
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
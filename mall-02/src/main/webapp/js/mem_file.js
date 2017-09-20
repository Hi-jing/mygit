// JavaScript Document
jQuery = window.parent.jQuery;
var recordRow;
var c = new Array("first", "second", "third");
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {

			getMemFile();

			// 会员增长拆线图
			//

			// 复选框添加全选或非合适的事件
			electAll();

			// 使用icheckrt插件给单选框复选框添加样式
			initialize();

			// 操作事件
			operation();

			// 时期操作
			time_opertion();

			exportMemData();

		});

/*
 * 得到时间并格式化
 */
function getNowFormatDate(str) {
	var currentdate = "";
	var date = new Date();
	var seperator1 = "-";
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	var strDate = date.getDate();
	if (month >= 1 && month <= 9) {
		month = "0" + month;
	}
	if (strDate >= 0 && strDate <= 9) {
		strDate = "0" + strDate;
	}
	if (str == "nowMonth") {
		currentdate = year + seperator1 + month + seperator1 + "01";
	} else {

		currentdate = year + seperator1 + month + seperator1 + strDate;
	}

	return currentdate;
}

function time_opertion() {
	$("#eTime").val(getNowFormatDate(null));
	$("#stTime").val(getNowFormatDate("nowMonth"));
	$('.form_date').datetimepicker({
				minView : "month", // 选择日期后，不会再跳转去选择时分秒
				format : 'yyyy-mm-dd',
				todayBtn : 1,
				autoclose : 1
			});

	// 结束时间改变时触发事件
	$('#end_time').datetimepicker().on('changeDate', function(ev) {
		// $("#growth_img").css("visibility", "visible");
		$.ajax({
					url : getRootPath() + "/member/management/growthTrend",
					type : "GET",
					dataType : "json",
					data : "stTime=" + $("#stTime").val() + "&eTime="
							+ $("#eTime").val(),
					success : function(result) {
						$("#growth_img").css("visibility", "hidden");
						order_growth_echart(result);
					}
				});

	});

	$('#start_time').datetimepicker().on('changeDate', function(ev) {
		// $("#growth_img").css("visibility", "visible");

		$.ajax({
					url : getRootPath() + "/member/management/growthTrend",
					type : "GET",
					dataType : "json",
					data : "stTime=" + $("#stTime").val() + "&eTime="
							+ $("#eTime").val(),
					success : function(result) {
						$("#growth_img").css("visibility", "hidden");
						order_growth_echart(result);
					}
				});

	});

	$.ajax({
				url : getRootPath() + "/member/management/growthTrend",
				type : "GET",
				dataType : "json",
				data : "stTime=" + $("#stTime").val() + "&eTime="
						+ $("#eTime").val(),
				success : function(result) {
					$("#growth_img").css("visibility", "hidden");
					order_growth_echart(result);
				}
			});

}

// 会员增长拆线图
function order_growth_echart(rel) {
	var myChart = echarts.init(document.getElementById('order_growth_echart'));

	// 指定图表的配置项和数据
	var option = {
		title : {
			show : false,
			text : '会员增长趋势图',
			top : 5,
			left : 20

		},
		tooltip : {
			trigger : 'axis'
		},
		toolbox : {
			show : false,
			top : 5,
			feature : {
				dataView : {
					show : true
				},

				dataZoom : {
					show : true
				},
				saveAsImage : {
					show : true
				},
				magicType : {
					type : ['line', 'bar']
				}
			}
		},
		legend : {
			top : 5,
			data : ['']
		},
		xAxis : {
			data : rel.extend.stringX
		},
		yAxis : {},
		dataZoom : [{
					type : 'slider',
					start : 10,
					end : 40
				}],
		series : [{

					name : '',
					type : 'line',
					data : rel.extend.intY,// 所有订单的数据，ajax请求更新
					markPoint : {
						data : [{
									type : 'max',
									name : '最大值'
								}, {
									type : 'min',
									name : '最小值',
									symbol : 'arrow'
								}]
					},
					markLine : {
						data : [{
									type : 'average',
									name : '平均值'
								}]
					}
				}]
	};

	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);

}

function exportMemData() {

	/*
	 * 伪异步发post请求
	 */
	$("#export").on("click", function() {
				postcall(getRootPath() + "/member/excel/export", null, null);
			});

	/*
	 * 根据id或会员昵称或会员姓名查询会员一条记录
	 */
	$("#searchBtn").on("click", function() {
		$.ajax({
					url : getRootPath() + "/member/management/queryOne",
					type : "GET",
					dataType : "json",
					data : "like=" + $("#searchInp").val() + "&select="
							+ $("#search_select").val(),
					success : function(result) {
						writeHtml(result);
					}
				});

	});

	/*
	 * 批量删除数据
	 */
	$("#deleteMem").on("click", function() {
				var allMyAttr = "";
				for (var i = 0; i < $("input[name='bar']").length; i++) {
					if ($("input[name='bar']").eq(i).prop("checked") == true) {
						allMyAttr += $("input[name='bar']").eq(i)
								.attr("myAttr")
								+ ",";
					}
				}

				$.ajax({
							url : getRootPath() + "/member/delete/batch",
							type : "GET",
							dataType : "json",
							data : "allMeId=" + allMyAttr,
							success : function(result) {
								getMemFile();
							}
						});

			});

}

// 复选框添加全选或非合适的事件
function electAll() {
	$('#all').on('click', function() {

				if (this.checked) {
					$("input[name='bar']").prop("checked", true);
				} else {
					$("input[name='bar']").prop("checked", false);
				}

			});
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

/*
 * 得到表单信息
 */
function getMemFile() {
	$.ajax({
				url : getRootPath() + "/member/management/query",
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
	$("#mem_file_tbody").empty();
	$("#form_bottom").empty();
	for (var i = 0; i < result.extend.pageInfo.list.length; i++) {
		var html = '<tr>' + '<td><input type="checkbox" name="bar" myAttr='
				+ result.extend.pageInfo.list[i].meId + '></td>' + '<td>'
				+ result.extend.pageInfo.list[i].meId + '</td>' + '<td>'
				+ result.extend.pageInfo.list[i].meNickname + '</td>' + '<td>'
				+ result.extend.pageInfo.list[i].meName + '</td>' + '<td>'
				+ result.extend.pageInfo.list[i].meLoyalty + '</td>' + '<td>'
				+ result.extend.pageInfo.list[i].mePhone + '</td>'

				+ '<td>'
				+ getSex(result.extend.pageInfo.list[i].meSex)
				+ '</td>'

				+ '<td>'
				+ result.extend.pageInfo.list[i].meEmail
				+ '</td>'

				+ '<td>'
				+ result.extend.pageInfo.list[i].meRegister
				+ '</td>'
				+ '<td id="operation">'
				// + '<span class="glyphicon glyphicon-zoom-in look" myAttr="'
				// + result.extend.pageInfo.list[i].meId + '"></span>'
				+ '<span class="glyphicon glyphicon-pencil edit" myAttr="'
				+ result.extend.pageInfo.list[i].meId + '"></span>'
				+ '<span class="glyphicon glyphicon-trash delete" myAttr="'
				+ result.extend.pageInfo.list[i].meId + '"></span>' + '</td>'
				+ '</tr>';
		$("#mem_file_tbody").append(html);
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
				url : getRootPath() + "/member/management/query",
				type : "GET",
				dataType : "json",
				data : "pn=" + fin,
				success : function(result) {
					writeHtml(result);
				}
			});

}

/*
 * 判断是否为M或Y返回字符串
 */
function getSex(str) {
	if (str == "M") {
		return "男";
	} else {
		return "女";
	}

}

function homePage() {
	$.ajax({
				url : getRootPath() + "/member/management/query",
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

function operation() {

	$("#operation > span").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(document).on("click", ".edit", function() {

		$.ajax({
					url : getRootPath() + "/member/getInfoById",
					type : "GET",
					dataType : "json",
					data : "memid=" + $(this).attr("myAttr"),
					success : function(result) {

						$("#nickname").html("&nbsp;&nbsp;"
								+ result.extend.member.meNickname);
						$("#m_name").val(result.extend.member.meName);
						$("#m_email").val(result.extend.member.meEmail);
						$("#m_phone").val(result.extend.member.mePhone);
						// $("#m_district").val(result.extend.member.meDistrict);
						if (result.extend.member.meSex == "M") {
							$("input[name='meSex']").eq(1)
									.removeAttr("checked");
							$("input[name='meSex']").eq(0)
									.prop("checked", true);

						} else {
							$("input[name='meSex']").eq(0)
									.removeAttr("checked");
							$("input[name='meSex']").eq(1)
									.prop("checked", true);
						}
						$("#save_mem")
								.attr("myAttr", result.extend.member.meId);
						$("#edit_modal").modal("show");
					}
				});

	});

	$(document).on("click", ".delete", function() {
				if (confirm("确认要删除吗?")) {
					$.ajax({
								url : getRootPath() + "/member/delete",
								type : "GET",
								dataType : "json",
								data : "meId=" + $(this).attr("myAttr"),
								success : function(result) {
									jumpPage(1);
								}
							});
				} else {
				}
			});

	$("#save_mem").on("click", function() {
		// 保存前先jquery校验
		if (!testRight()) {
			return false;

		};
		$.ajax({
					url : getRootPath() + "/member/saveMem",
					type : "POST",
					dataType : "json",
					data : $("#edit_modal form").serialize() + "&meId="
							+ $(this).attr("myAttr"),
					success : function(result) {
						// $("#edit_modal").modal("hide");
						if (result.code == 100) {
							$("#edit_modal").modal("hide");
							jumpPage(recordRow);
						} else {
							alert("有问题");
						}
					}
				});
	});

	$("#m_email").on("change", function() {
				var email = $("#m_email").val();
				var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
				if (!regEmail.test(email)) {
					show_validate_msg("#m_email", "error", "邮箱不正确");
				} else {
					show_validate_msg("#m_email", "success", "");
				}
			});

	/*
	 * 编辑表单中前端验证
	 */
	$("#m_phone").on("change", function() {
		var m_phone = $("#m_phone").val();
		var reg = /^\d+$/;
		if (m_phone.length != 11) {
			show_validate_msg("#m_phone", "error", "请输入正确的手机号码！");
		} else if (!m_phone.match(reg)) {
			show_validate_msg("#m_phone", "error", "请输入正确的手机号码！");
		} else {
			$.ajax({
						url : getRootPath() + "/member/checkOnlyNumber",
						type : "GET",
						dataType : "json",
						data : "number=" + m_phone + "&meId="
								+ $("#save_mem").attr("myAttr"),
						success : function(result) {
							if (result.code == 100) {
								show_validate_msg("#m_phone", "success", "")
							} else {
								show_validate_msg("#m_phone", "error",
										"该号码已被其他人使用！")
							}
						}
					});
		}

	});

}

function show_validate_msg(ele, status, msg) {
	// 清除当前元素的校验状态
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

// 校验方法
function testRight() {

	var email = $("#m_email").val();
	var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	if (!regEmail.test(email)) {
		show_validate_msg("#m_email", "error", "邮箱不正确");
		return false;
	} else {
		show_validate_msg("#m_email", "success", "");
	}

	var m_phone = $("#m_phone").val();
	var reg = /^\d+$/;
	if (m_phone.length != 11) {
		show_validate_msg("#m_phone", "error", "请输入正确的手机号码！");
		return false;
	} else if (!m_phone.match(reg)) {
		show_validate_msg("#m_phone", "error", "请输入正确的手机号码！");
		return false;
	} else {
		$.ajax({
					url : getRootPath() + "/member/checkOnlyNumber",
					type : "GET",
					dataType : "json",
					data : "number=" + m_phone + "&meId="
							+ $("#save_mem").attr("myAttr"),
					success : function(result) {
						if (result.code == 100) {
							show_validate_msg("#m_phone", "success", "")
						} else {
							show_validate_msg("#m_phone", "error",
									"该号码已被其他人使用！")
							return false;
						}
					}
				});
	};

	return true;
}

// 使用icheckrt插件给单选框复选框添加样式
function initialize() {
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
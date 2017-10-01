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

			//integral_service_echart();
			
			
			getMemFile();

		});

/**
 * 以下是对表的信息写入（ajax请求）
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
	$("#se_memtbody").empty();
	$("#form_bottom02").empty();
	for (var i = 0; i < result.extend.pageInfo.list.length; i++) {
		var html = '<tr>' +
				'<td>' + result.extend.pageInfo.list[i].meNickname+ '</td>' +
				'<td>' + result.extend.pageInfo.list[i].meName + '</td>' +
				'<td>' + result.extend.pageInfo.list[i].meLoyalty +'</td>' +
				'<td>' + result.extend.pageInfo.list[i].mePhone + '</td>' +
				'<td><a href="javascript:getMemAnalysis('+ result.extend.pageInfo.list[i].meId + ');">饼图分析</a></td>' +
				'</tr>';
		$("#se_memtbody").append(html);
	}

	var html02 = '<div class="col-md-4">'
			+ '<span style="float: left; font-size: 10px;padding-top: 20px;">共'
			+ result.extend.pageInfo.pages
			+ '页，有'
			+ result.extend.pageInfo.total
			+ '条记录</span>' 
			+ '</div>'
			+ '<div class="col-md-8">'
			+ '<nav aria-label="Page navigation" style="float: right;">'
			+ '<ul class="pagination pagination-sm">'
			+ '<li class="previous"><a href="javascript:homePage();"> <span>首页</span>'
			+ '</a></li>' + '<li><a href="javascript:jumpPage('
			+ (result.extend.pageInfo.pageNum - 1)
			+ ');"> <span>&laquo;</span>' + '</a></li>'
			+ getLiSum(3, result.extend.pageInfo.pageNum)
			+ '<li><a href="javascript:jumpPage('
			+ (result.extend.pageInfo.pageNum + 1)
			+ ');"> <span>&raquo;</span></a></li>'
			+ '<li class="next"><a href="javascript:jumpPage('
			+ result.extend.pageInfo.pages + ');"> <span>尾页</span>'
			+ '</a></li>' + '</ul></nav></div>';

	$("#form_bottom02").append(html02);
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
		for (var i = (inter02 - 3); i < inter02; i++) {
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

function time_opertion() {
	$('.form_date').datetimepicker({
				minView : "month", // 选择日期后，不会再跳转去选择时分秒
				format : 'yyyy-mm-dd',
				todayBtn : 1,
				autoclose : 1
			});

	// 结束时间改变时触发事件
	$('#end_time').datetimepicker().on('changeDate', function(ev) {

			});
}

function operation() {
	$("#se_operation > span").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".conlook").click(function() {
				$("#se_look_modal").modal("show");
			})

	$(".condelete").click(function() {
				if (confirm("确认要删除吗?")) {
					alert("true");
				} else {
					alert("false");
				}
			});

	$(".se_nav_li > a").mouseover(function() {
				$(this).css("cursor", "pointer");
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

	$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%"
			});
}

function getMemAnalysis(mid){
		$.ajax({
				url : getRootPath() + "/member/integral/serviceExchange/getChartInfo",
				type : "GET",
				dataType : "json",
				data : "memid=" + mid,
				success : function(result) {
					integral_service_echart(result);
				}
			});
}

// 积分服务类型分析图
function integral_service_echart(result) {
	$("#integral_service_echart").empty();
	var myChart = echarts.init(document
			.getElementById('integral_service_echart'));

	// 指定图表的配置项和数据
	var option = {
		title : {
			show : true,
			text : '积分服务类型占比',
			top : 20,
			x : 'left'

		},
		tooltip : {
			trigger : 'item',
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},
		legend : {
			orient : 'vertical',
			left : 380,
			top : 100,
			data : ['0元换购', '补差换购', '普通消费']
		},
		series : [{
					name : '订单交易类型',
					type : 'pie',
					radius : '65%',
					center : ['25%', '55%'],
					data : [{
								value : result.extend.map.o_rmb_for,
								name : '0元换购'
							}, {
								value : result.extend.map.senders_for,
								name : '补差换购'
							}, {
								value : result.extend.map.regular_consumption,
								name : '普通消费'
							}

					]
				}]
	};

	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);
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

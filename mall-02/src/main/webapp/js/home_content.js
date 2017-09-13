// JavaScript Document
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	// 订单当周总计表
	order_total_echart();
	// 订单类型表
	order_type_echart();

	getAdDate();

	getOrGoodRank();

	});

function getOrGoodRank() {
	$.ajax({
				url : getRootPath() + "/goodRank",
				type : "GET",
				dataType : "json",
				success : function(result) {
					for (var i = 0; i < result.extend.glist.length; i++) {
						var html = '<tr>'
						+'<td>'+(i+1)+'</td>'
						+'<td>'+result.extend.glist[i].goId+'</td>'
						+'<td>'+result.extend.glist[i].goName+'</td>'
						+'<td>'+result.extend.glist[i].goBuysum+'</td>'
						+'</tr>';
						$("#rank").append(html);
					}

				}
			});
}

function getAdDate() {
	$.ajax({
				url : getRootPath() + "/getAdLoginRecord",
				type : "GET",
				dataType : "json",
				success : function(result) {
					for (var i = 0; i < result.extend.loginRecord.length; i++) {
						var html = '<tr>'
								+ '<td>'
								+ result.extend.loginRecord[i].administrator.adUsername
								+ '</td>' + '<td></td><td></td><td></td>'
								+ '<td>' + result.extend.loginRecord[i].loDate
								+ '</td><td></td>';
						$("#lo_record").append(html);
					}

				}
			});
}

function order_total_echart() {
	$.ajax({
				url : getRootPath() + "/administrator/getOrderSum",
				type : "GET",
				dataType : "json",
				success : function(result) {
					$("#top_img").css("visibility", "hidden");
					var myChart = echarts.init(document
							.getElementById('order_total_echart'));

					// 指定图表的配置项和数据
					var option = {
						title : {
							show : true,
							text : '最近七天有效订单数量',
							top : 5,
							left : 20

						},
						tooltip : {
							trigger : 'axis'
						},
						toolbox : {
							show : true,
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
							data : ['所有订单', '积分订单', '普通订单']
						},
						xAxis : {
							data : [result.extend.date[6],
									result.extend.date[5],
									result.extend.date[4],
									result.extend.date[3],
									result.extend.date[2],
									result.extend.date[1],
									result.extend.date[0]]
						},
						yAxis : {},
						series : [{

							name : '所有订单',
							type : 'line',
							data : [result.extend.orSum[6].allSum,
									result.extend.orSum[5].allSum,
									result.extend.orSum[4].allSum,
									result.extend.orSum[3].allSum,
									result.extend.orSum[2].allSum,
									result.extend.orSum[1].allSum,
									result.extend.orSum[0].allSum],// 所有订单的数据，ajax请求更新
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
						}, {

							name : '积分订单',
							type : 'line',
							data : [result.extend.orSum[6].integralSum,
									result.extend.orSum[5].integralSum,
									result.extend.orSum[4].integralSum,
									result.extend.orSum[3].integralSum,
									result.extend.orSum[2].integralSum,
									result.extend.orSum[1].integralSum,
									result.extend.orSum[0].integralSum],// 积分订单的数据，ajax请求更新
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
						}, {

							name : '普通订单',
							type : 'line',
							data : [result.extend.orSum[6].generalSum,
									result.extend.orSum[5].generalSum,
									result.extend.orSum[4].generalSum,
									result.extend.orSum[3].generalSum,
									result.extend.orSum[2].generalSum,
									result.extend.orSum[1].generalSum,
									result.extend.orSum[0].generalSum],// 积分订单的数据，ajax请求更新
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
			});

}

// 订单类型表
function order_type_echart() {
	$.ajax({
				url : getRootPath() + "/administrator/getOrderTypeSum",
				type : "GET",
				dataType : "json",
				success : function(result) {
					var myChart = echarts.init(document
							.getElementById('order_type_echart'));

					// 指定图表的配置项和数据
					var option = {
						title : {
							show : true,
							text : '订单交易类型',
							top : 10,
							x : 'left'

						},
						tooltip : {
							trigger : 'item',
							formatter : "{a} <br/>{b} : {c} ({d}%)"
						},
						legend : {
							orient : 'vertical',
							left : 450,
							top : 100,
							data : ['普通消费', '0元换购', '补差换购']
						},
						series : [{
									name : '订单交易类型',
									type : 'pie',
									radius : '65%',
									center : ['28%', '55%'],
									data : [{
												value : result.extend.ordinaryOrder,
												name : '普通消费'
											}, {
												value : result.extend.zeroExchange,
												name : '0元换购'
											}, {
												value : result.extend.buChaExchange,
												name : '补差换购'
											}

									]
								}]
					};

					// 使用刚指定的配置项和数据显示图表。
					myChart.setOption(option);

				}
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

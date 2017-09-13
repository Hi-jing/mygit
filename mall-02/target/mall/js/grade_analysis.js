// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	//会员等级销售分析图
	grade_analysis_echart();

	
	//时期操作
	time_opertion();

});

function time_opertion(){
	$('.form_date').datetimepicker({
		minView: "month", //选择日期后，不会再跳转去选择时分秒 
	    format: 'yyyy-mm-dd',
	    todayBtn:  1,
	    autoclose: 1
	});
	
	//结束时间改变时触发事件
	$('#end_time').datetimepicker().on('changeDate', function(ev){

	});
}




//会员等级销售分析图
function grade_analysis_echart(){
	var myChart = echarts.init(document.getElementById('grade_analysis_echart'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '会员等级销售分析图',
        top:5,
        left:20
        
        
    },
     tooltip: {
        trigger: 'axis'
    },
    toolbox: {
        show: true,
        top:5,
        feature: {
            dataView:{
                show:true
            },
          
            dataZoom:{
                show:true
            },
            saveAsImage: {
                show: true
            },
            magicType: {
                type: ['line', 'bar']
            }
        }
    },
    legend: {
    	top:5,
        data: ['所有订单','积分订单','普通订单']
    },
    xAxis: {
        data: ["vip1","vip2","vip3","vip4","vip5","vip6"]
    },
    yAxis: {},

    series: [{

        name: '所有订单',
        type: 'line',
        data: [52, 202, 362, 104, 101, 205],//所有订单的数据，ajax请求更新
		  markPoint: {
            data: [
                {type: 'max', name: '最大值'},
                {type: 'min', name: '最小值',symbol:'arrow'}
            ]
        },
        markLine: {
            data: [
                {type: 'average', name: '平均值'}
            ]
        }
    },
    {

        name: '积分订单',
        type: 'line',
        data: [512, 502, 312, 204, 181, 105],//所有订单的数据，ajax请求更新
		  markPoint: {
            data: [
                {type: 'max', name: '最大值'},
                {type: 'min', name: '最小值',symbol:'arrow'}
            ]
        },
        markLine: {
            data: [
                {type: 'average', name: '平均值'}
            ]
        }
    },
    {

        name: '普通订单',
        type: 'line',
        data: [20, 285, 300, 304, 200, 510],//所有订单的数据，ajax请求更新
		  markPoint: {
            data: [
                {type: 'max', name: '最大值'},
                {type: 'min', name: '最小值',symbol:'arrow'}
            ]
        },
        markLine: {
            data: [
                {type: 'average', name: '平均值'}
            ]
        }
    }]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);

}





// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	//会员增长拆线图
	order_growth_echart();

	//复选框添加全选或非合适的事件
	electAll();
	
	//使用icheckrt插件给单选框复选框添加样式
	initialize();	
	

	//时期操作
	time_opertion();


});

function look_details(){
	$("#details_look_modal").modal("show");
}

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


//复选框添加全选或非合适的事件
function electAll(){
		$('#sale_sall').on('ifChecked', function(){ 
				$("input").iCheck('check');
			});
		
			
			$('#sale_sall').on('ifUnchecked', function(){ 
				$("input").iCheck('uncheck');
				//$('input').iCheck('uncheck');
			});
	
}

//使用icheckrt插件给单选框复选框添加样式
function initialize(){
	
	$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%" 
			});
}

//会员卡办理增长拆线图
function order_growth_echart(){
	var myChart = echarts.init(document.getElementById('order_growth_echart'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: false,
        text: '会员增长趋势图',
        top:5,
        left:20
        
        
    },
     tooltip: {
        trigger: 'axis'
    },
    toolbox: {
        show: false,
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
        data: ['']
    },
    xAxis: {
        data: ["周日","周一", "周二", "周三", "周四", "周五", "周六","周一", "周二", "周三", "周四", "周五", "周六","周一", "周二", "周三", "周四", "周五", "周六","周一", "周二", "周三", "周四", "周五", "周六"]
    },
    yAxis: {},
    dataZoom: [{
        type: 'slider',
        start: 10,
        end: 40
    }],
    series: [{

        name: '',
        type: 'line',
        data: [5, 20, 36, 10, 10, 20,21, 20, 36, 10, 10, 20,21, 20, 36, 10, 10, 20,21, 20, 36, 10, 10, 20,21],//所有订单的数据，ajax请求更新
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





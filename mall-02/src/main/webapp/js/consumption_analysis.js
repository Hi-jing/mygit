// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {


	//复选框添加全选或非合适的事件
	electAll();
	
	//使用icheckrt插件给单选框复选框添加样式
	initialize();	
	

	
	
	integral_service_echart();
	income_spend_echart();

});



function warning(){

		$("#warning_modal").modal("show");


	
	
}
//复选框添加全选或非合适的事件
function electAll(){
		$('#re_all').on('ifChecked', function(){ 
				$("[name='re_bar']").iCheck('check');
			});
		
			
			$('#re_all').on('ifUnchecked', function(){ 
				$("[name='re_bar']").iCheck('uncheck');
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


//积分服务类型分析图
function integral_service_echart(){
	var myChart = echarts.init(document.getElementById('integral_service_echart'));

// 指定图表的配置项和数据
var option = {
    title : {
		show: true,
        text: '消费类型占比',
        top:20,
        x:'left'

		
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 380,
		top :100,
        data: ['普通消费','会员卡消费','0元换购','补差换购']
    },
    series : [
        {
            name: '订单交易类型',
            type: 'pie',
            radius : '65%',
            center: ['25%', '55%'],
            data:[
          	 	 {value:234, name:'普通消费'},
           		 {value:234, name:'会员卡消费'},
                {value:335, name:'0元换购'},
                {value:310, name:'补差换购'}
                
                
            ]
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
}

//会员卡办理增长拆线图
function income_spend_echart(){
	var myChart = echarts.init(document.getElementById('income_spend_echart'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '会员最近六个月收入支出情况',
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
        data: ['当月结余','收入','支出']
    },
    xAxis: {
        data: ["一月","二月", "三月", "四月", "五月", "六月"]
    },
    yAxis: {},
    series: [{

        name: '当月结余',
        type: 'line',
        data: [50, 200, -100, 100, 300, 320],//所有订单的数据，ajax请求更新
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
    },{

        name: '收入',
        type: 'line',
        data: [500, 2000, 1000, 1050, 3000, 3200],//所有订单的数据，ajax请求更新
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
    },{

        name: '支出',
        type: 'line',
        data: [500, 2000, 2050, 1500, 300, 320],//所有订单的数据，ajax请求更新
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


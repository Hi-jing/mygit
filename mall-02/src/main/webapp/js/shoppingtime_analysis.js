// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {


	shoppingtime_analysis_echart01();
	shoppingtime_analysis_echart02();

});

//最近一次购物消费额度占比饼图
function shoppingtime_analysis_echart02(){
	var myChart = echarts.init(document.getElementById('shoppingtime_analysis_echart02'));

// 指定图表的配置项和数据
var option = {
    title : {
		show: true,
        text: '最近一次购物消费额度占比',
        top:20,
        x:'left'

		
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 450,
		top :100,
        data: ['100元以内','100-200元','200-500元','500元以上']
    },
    series : [
        {
            name: '订单交易类型',
            type: 'pie',
            radius : '65%',
            center: ['25%', '55%'],
            data:[
          	 	 {value:234, name:'100元以内'},
           		 {value:234, name:'100-200元'},
                {value:335, name:'200-500元'},
                {value:310, name:'500元以上'}
                
                
            ]
        }
    ]
};

//最近一次购物时段分析图
myChart.setOption(option);
}

//会员卡办理增长拆线图
function shoppingtime_analysis_echart01(){
	var myChart = echarts.init(document.getElementById('shoppingtime_analysis_echart01'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '最近一次购物时段分析图',
        top:5,
       left:250
        
        
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
        data: ['男','女']
    },
    xAxis: {
        data: ["上午","中午", "下午", "傍晚", "晚上", "半夜", "凌晨"]
    },
    yAxis: [
        {
            type: 'value',
            name: '该时段人数',
            axisLabel: {
                formatter: '{value} 人'
            }
        }
    ],
    series: [{

        name: '男',
        type: 'line',
        data: [500, 200, 100, 120, 300, 320],//所有订单的数据，ajax请求更新
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

        name: '女',
        type: 'line',
        data: [450, 250, 106, 109, 103, 320],//所有订单的数据，ajax请求更新
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
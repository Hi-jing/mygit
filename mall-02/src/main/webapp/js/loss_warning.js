// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {

	
	loss_warning_echart();

});



//会员流失分析图
function loss_warning_echart(){
	var myChart = echarts.init(document.getElementById('loss_warning_echart'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '会员流失分析图',
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
        data: ['男','女','未消费时日']
    },
    xAxis: {
        data: ["10岁前","10-17岁","18-35岁","36-59岁","60岁以上"]
    },
   	yAxis: [
        {
            type: 'value',
            name: '未消费人数',
            axisLabel: {
                formatter: '{value} 人'
            }
        },
        {
            type: 'value',
            name: '未消费时日',
            axisLabel: {
                formatter: '{value} 天'
            }
        }
    ],

    series: [{

        name: '男',
        type: 'bar',
        data: [2320, 420, 320, 540, 888],//所有订单的数据，ajax请求更新
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

        name: '女',
        type: 'bar',
        data: [2200, 520, 300, 640, 1088],//所有订单的数据，ajax请求更新
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

        name: '未消费时日',
        type: 'line',
        yAxisIndex: 1,
        data: [900, 220, 120, 240, 828],//所有订单的数据，ajax请求更新
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


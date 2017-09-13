// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {

	
	trend_analysis_echart();

});


function trend_analysis_echart(){
	var myChart = echarts.init(document.getElementById('trend_analysis_echart'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '商品销售趋势分析图',
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
        data: ['成本','利润','该商品']//当点击分析后，该商品转化为某商品或某商品类型
    },
    xAxis: {
        data: ["一月","二月","三月","四月","五月","六月"]
    },
   	yAxis: [
        {
            type: 'value',
            name: '销量',
            axisLabel: {
                formatter: '{value} 件'
            }
        },
        {
            type: 'value',
            name: '金额',
            axisLabel: {
                formatter: '{value} 元'
            }
        }
    ],

    series: [{

        name: '成本',
        type: 'line',
        data: [220, 420, 320, 540, 188, 288],//所有订单的数据，ajax请求更新
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

        name: '利润',
        type: 'line',
        data: [20, 50, 30, 40, 28, 48],//所有订单的数据，ajax请求更新
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

        name: '该商品',
        type: 'bar',
        yAxisIndex: 1,
        data: [210, 120, 120, 240, 58, 78],//所有订单的数据，ajax请求更新
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

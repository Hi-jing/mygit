// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {


	group_analysis_echart01();
	group_analysis_echart02();

});

//消费群体雷达分析图
function group_analysis_echart02(){
	        // 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('group_analysis_echart02'));

// 指定图表的配置项和数据
option = {
    title: {
        text: '消费群体雷达分析图'
    },
    tooltip: {},
    legend: {
        data: ['']
    },
    radar: {
        // shape: 'circle',
        indicator: [
           { name: '上班族（worker）', max: 6500},
           { name: '学生族（student ）', max: 6500},
           { name: '休闲族（leisure）', max: 6500},
           { name: '其他（others）', max: 6500}
        ]
    },
    series: [{
        name: '消费群体雷达分析',
        type: 'radar',
        // areaStyle: {normal: {}},
        data : [
            {
                value : [4300, 5000, 3500, 5200],
                name : ''
            }
        ]
    }]
};
// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
}

//会员卡办理增长拆线图
function group_analysis_echart01(){
	var myChart = echarts.init(document.getElementById('group_analysis_echart01'));

// 指定图表的配置项和数据
var option = {
    title: {
    	show: true,
        text: '一周内消费会员性质图',
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
        data: ['男','女','10-17岁','18-35岁','36-59岁','60岁以上']
    },
    xAxis: {
        data: ["8月6日","8月7日", "8月8日", "8月9日", "8月10日", "8月11日", "8月12日"]
    },
    yAxis: [
        {
            type: 'value',
            name: '消费订单数',
            axisLabel: {
                formatter: '{value} 单'
            }
        }
    ],
    series: [{

        name: '男',
        type: 'bar',
        data: [500, 200, 100, 120, 300, 320],//所有订单的数据，ajax请求更新
        markLine: {
            data: [
                {type: 'average', name: '平均值'}
            ]
        }
    },{

        name: '女',
        type: 'bar',
        data: [450, 250, 106, 109, 103, 320],//所有订单的数据，ajax请求更新
        markLine: {
            data: [
                {type: 'average', name: '平均值'}
            ]
        }
    },{

        name: '10-17岁',
        type: 'line',
        data: [23, 11, 4, 3, 55, 6]//所有订单的数据，ajax请求更新

    },{

        name: '18-35岁',
        type: 'line',
        data: [53, 31, 24, 35, 5, 26]//所有订单的数据，ajax请求更新

    },{

        name: '36-59岁',
        type: 'line',
        data: [23, 11, 34, 45, 23, 16]//所有订单的数据，ajax请求更新
 
    },{

        name: '60岁以上',
        type: 'line',
        data: [3, 12, 14, 25, 13, 13]//所有订单的数据，ajax请求更新
 
    }]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);

}
// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {

	
	shoppingamount_analysise_echart();

});



//消费群体雷达分析图
function shoppingamount_analysise_echart(){
	        // 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('shoppingamount_analysise_echart'));

// 指定图表的配置项和数据
option = {
    title: {
        text: '购物金额雷达分析图'
    },
    tooltip: {},
    legend: {
        data: []
    },
    radar: {
        // shape: 'circle',
        indicator: [
           { name: '最大消费金额', max: 5000},
           { name: '最小消费金额', max: 50},
           { name: '周均消费金额', max: 17500},
            { name: '月均消费金额', max: 75000},
            { name: '年度累计消费金额', max: 912500}
        ]
    },
    series: [{
        name: '购物金额雷达分析图',
        type: 'radar',
        // areaStyle: {normal: {}},
        data : [
            {
                value : [4300, 20, 15000, 52000,880580],
                name : ''
            }
        ]
    }]
};
// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
}
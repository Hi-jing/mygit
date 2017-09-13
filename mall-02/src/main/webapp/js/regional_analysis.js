// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {


	regional_analysis();

});



//积分服务类型分析图
function regional_analysis(){
	var myChart = echarts.init(document.getElementById('regional_analysis_echart'));

// 指定图表的配置项和数据
var option = {
    title : {
		show: true,
        text: '商品销售类型占比',
        top:20,
        x:'left'

		
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 500,
		top :50,
        data: ['食品','家电','手机数码','女装','男装','鞋靴','箱包','内衣配饰','百货','运动户外','家居家纺'
        ,'图书']
    },
    series : [
        {
            name: '商品类型',
            type: 'pie',
            radius : '65%',
            center: ['25%', '55%'],
            data:[
          	 	 {value:234, name:'食品'},
           		 {value:234, name:'家电'},
                {value:335, name:'手机数码'},
                {value:310, name:'女装'},
                {value:234, name:'男装'},
           		 {value:234, name:'鞋靴'},
                {value:335, name:'箱包'},
                {value:310, name:'内衣配饰'},
                {value:234, name:'百货'},
           		 {value:234, name:'运动户外'},
                {value:335, name:'家居家纺'},
                {value:310, name:'图书'}
         
                
            ]
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
}


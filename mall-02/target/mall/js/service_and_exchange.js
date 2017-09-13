// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {


	//复选框添加全选或非合适的事件
	electAll();
	
	//使用icheckrt插件给单选框复选框添加样式
	initialize();	
	
	//操作事件
	operation();
	
	//时期操作
	time_opertion();
	
	
	integral_service_echart();

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

function operation(){
	$("#se_operation > span").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	$(".conlook").click(function(){
		$("#se_look_modal").modal("show");
	})


	
	$(".condelete").click(function(){
		if(confirm("确认要删除吗?")){
			alert("true");
    	}else{
    		alert("false");
    	}
	});
	
	$(".se_nav_li > a").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	
}
//复选框添加全选或非合适的事件
function electAll(){
		$('#se_seall').on('ifChecked', function(){ 
				$("[name='se_sebar']").iCheck('check');
			});
		
			
			$('#se_seall').on('ifUnchecked', function(){ 
				$("[name='se_sebar']").iCheck('uncheck');
				//$('input').iCheck('uncheck');
			});
			
			
		$('#se_se2all').on('ifChecked', function(){ 
				$("[name='se_se2bar']").iCheck('check');
			});
		
			
			$('#se_se2all').on('ifUnchecked', function(){ 
				$("[name='se_se2bar']").iCheck('uncheck');
				//$('input').iCheck('uncheck');
			});
			
		$('#se_se3all').on('ifChecked', function(){ 
				$("[name='se_se3bar']").iCheck('check');
			});
		
			
			$('#se_se3all').on('ifUnchecked', function(){ 
				$("[name='se_se3bar']").iCheck('uncheck');
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
        text: '积分服务类型占比',
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
        data: ['0元换购','补差换购','积分抽奖']
    },
    series : [
        {
            name: '订单交易类型',
            type: 'pie',
            radius : '65%',
            center: ['25%', '55%'],
            data:[
                {value:335, name:'0元换购'},
                {value:310, name:'补差换购'},
                {value:234, name:'积分抽奖'}
                
            ]
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
}




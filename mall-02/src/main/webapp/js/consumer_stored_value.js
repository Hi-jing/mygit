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
	$("#con_operation > span").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	$(".conlook").click(function(){
		$("#con_look_modal").modal("show");
	})


	
	$(".condelete").click(function(){
		if(confirm("确认要删除吗?")){
			alert("true");
    	}else{
    		alert("false");
    	}
	})
	
}
//复选框添加全选或非合适的事件
function electAll(){
		$('#con_sall').on('ifChecked', function(){ 
				$("[name='con_sbar']").iCheck('check');
			});
		
			
			$('#con_sall').on('ifUnchecked', function(){ 
				$("[name='con_sbar']").iCheck('uncheck');
				//$('input').iCheck('uncheck');
			});
			
			
		$('#con_iall').on('ifChecked', function(){ 
				$("[name='con_ibar']").iCheck('check');
			});
		
			
			$('#con_iall').on('ifUnchecked', function(){ 
				$("[name='con_ibar']").iCheck('uncheck');
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






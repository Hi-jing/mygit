// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	inve_operation();
	initialize();
	//复选框添加全选或非合适的事件
	electAll();

});


function replenishment(){
	$("#in_goods_modal").modal("show");
}

function setting_date(){
	$("#set_date_modal").modal("show");
}
function inve_operation(){

	
	$("#unified_into").click(function(){
		$("#in_goods_modal").modal("show");
	})

	
	


}

//使用icheckrt插件给单选框复选框添加样式
function initialize(){
	
	$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%" 
			});
}


//复选框添加全选或非合适的事件
function electAll(){
	$('#in_all').on('ifChecked', function(){  
				$('input').iCheck('check');
			});
		
			
			$('#in_all').on('ifUnchecked', function(){  
				$('input').iCheck('uncheck');
			});
}
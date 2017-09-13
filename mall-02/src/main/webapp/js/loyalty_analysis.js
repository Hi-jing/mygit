// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	lo_operation();
	initialize();
	electAll();

});


//复选框添加全选或非合适的事件
function electAll(){
	$('#lo_all').on('ifChecked', function(){  
				$('input').iCheck('check');
			});
		
			
			$('#lo_all').on('ifUnchecked', function(){  
				$('input').iCheck('uncheck');
			});
}



function lo_operation(){
	
	$("#unified_coupons").click(function(){
		$("#gift_coupons_modal").modal("show");
	})

	$("#unified_integral").click(function(){
		$("#gift_integral_modal").modal("show");
	})

	
	$(".coupons").click(function(){
		$("#gift_coupons_modal").modal("show");
	})

	$(".integral").click(function(){
		$("#gift_integral_modal").modal("show");
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
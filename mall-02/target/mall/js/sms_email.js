// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
			//复选框添加全选或非合适的事件
	electAll();
	
	//使用icheckrt插件给单选框复选框添加样式
	initialize();
	together_operation();
});

function together_operation(){
	$("#sms_send").click(function(){
		$("#reply_sms_modal").modal("show");
	});
	$("#email_send").click(function(){
		$("#reply_email_modal").modal("show");
	})

}



function reply_sms(){
	$("#reply_sms_modal").modal("show");

}

function reply_email(){
	$("#reply_email_modal").modal("show");

}
//复选框添加全选或非合适的事件
function electAll(){
		$('#sms_seall').on('ifChecked', function(){ 
				$("[name='sms_sebar']").iCheck('check');
			});
		
			
			$('#sms_seall').on('ifUnchecked', function(){ 
				$("[name='sms_sebar']").iCheck('uncheck');
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
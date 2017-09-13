// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	ac_operation();
	initialize();

});

function ac_operation(){
	
	//对各种记录中的移入样式
	$(".ac_record").mouseover(function() {
		$(this).css("cursor", "pointer");
		$(this).css("color", "blue");
		$(this).text("明细");
		$(this).css("text-decoration", "underline");
		
	});
	//对各种记录中的移出样式	
	$(".ac_record").mouseout(function() {
		$(this).css("color", "#000");
		$(this).text("0");
		$(this).css("text-decoration", "none");
		
	});
	
	$(".ac_record").click(function(){
		//alert($(this).attr("name"));
		if("consumption" == $(this).attr("name")){
			$("#record_consumption_modal").modal("show");
		}else if("integral" == $(this).attr("name")){
			$("#record_integral_modal").modal("show");
		}else{
			$("#record_recharge_modal").modal("show");
		}
		//$("#in_look_modal").modal("show");
	})

	
	$(".aclook").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	$(".aclook").click(function(){
		$("#spend_income_modal").modal("show");
	})
	
	$(".ac_nav_li > a").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	
	$(".ac_nav_li > a").click(function() {
		$("#ac_nav_condition").text($(this).text());
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
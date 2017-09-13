// JavaScript Document
//显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {
	in_operation();
	initialize();

});

function in_operation(){
	$(".inlook").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	$(".inlook").click(function(){
		$("#in_look_modal").modal("show");
	})

	
	$(".inedit").mouseover(function() {
		$(this).css("cursor", "pointer");
	});
	
	$(".inedit").click(function(){
		$("#in_edit_modal").modal("show");
	})
	
	
	
	$(".in_nav_li > a").mouseover(function() {
		$(this).css("cursor", "pointer");
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
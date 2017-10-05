// JavaScript Document
$(document).ready(function() {
	var i;
	var par_text;
	
	jump_page("mem_care.jsp");
	
	//获得根目录
	function getRootPath() {
		var strFullPath = window.document.location.href;
		var strPath = window.document.location.pathname;
		var pos = strFullPath.indexOf(strPath);
		var prePath = strFullPath.substring(0, pos);
		var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
		return (prePath + postPath);
	}

	// 对菜单移入样式定义
	$(".second").children().mouseover(function() {
				$(this).css("background", "#e6edf5");
				$(this).css("color", "red");
				$(this).css("cursor", "pointer");
			});

	// 对菜单移出样式定义
	$(".second").children().mouseout(function() {
				$(this).css("background", "#f2f9ff");
				$(this).css("color", "#000");
			});

	// 对路径导航处理
	$(".second").children().click(function() {
		if (i != 1) {
			$("#path_nav").children(":last").remove();
		} else {
			i = 2;
		}
		// 首先判断是否是该父级点的，true:改变父级text()，false:不改变
		if ($(this).parent().prev().text() == par_text) {
			var child_text = $(this).text();
			var child_li = $("<li></li>").addClass("active").append(child_text);
			$("#path_nav").append(child_li);
		} else {
			$("#path_nav").empty();
			var child_text = $(this).text();
			var child_li = $("<li></li>").addClass("active").append(child_text);
			var parant_li = $("<li></li>").addClass("active").append($(this)
					.parent().prev().text());
			$("#path_nav").append(parant_li).append(child_li);
		}
	
		jump_page($(this).attr("value"));

	})

	//ajax请求跳转页面
	function jump_page(str) {
		
		var jPage = "jsp/"+str;
		$.ajax({
					url : getRootPath()+"/jumpPage",
					type : "GET",
					dataType: "html",
					success : function(result) {
						$("#content").empty();
						$("#content").load(jPage);
					}
				});
	}

	// 对导航条移入移出样式定义
	$(".first").mouseover(function() {
				$(this).css("background", "#e8e8e8");
				$(this).css("cursor", "pointer");
			})

	$(".first_1").mouseover(function() {
				$(this).css("background", "#e8e8e8");
				$(this).css("cursor", "pointer");

			})
	$(".first_1").click(function() {
				par_text = $(this).text();
				$("#path_nav").empty();
				var par_text = $(this).text();
				var par_li = $("<li></li>").addClass("active").append(par_text);
				$("#path_nav").append(par_li);
				
				jump_page($(this).attr("name"));
				
				
			});
	$(".first_1").mouseout(function() {
				$(this).css("background", "#fff");
			})

	$(".first").mouseout(function() {
				$(this).css("background", "#fff");
			})

	// 对导航条点击显示或隐藏菜单以及对路径导航的处理
	$(".first").click(function() {
				i = 1;
				par_text = $(this).text();
				$("#path_nav").empty();
				$(this).next().toggle("display");

				$(this).children(":last")
						.toggleClass("glyphicon glyphicon-menu-left");
				$(this).children(":last")
						.toggleClass("glyphicon glyphicon-menu-down");
				var par_text = $(this).text();
				var par_li = $("<li></li>").addClass("active").append(par_text);
				$("#path_nav").append(par_li);
			});
			
			
	$("#tt_right > span").eq(0).click(function(){
		$("#setting_modal").modal("show");
	})
	
	$("#tt_right > span").eq(2).click(function(){
		if(confirm("确认要退出吗?")){
			//ajax删除session
			$.ajax({
					url : getRootPath()+"/deleteSession",
					type : "GET",
					success : function(result) {
						if(result.code ==100){
							window.location.href = getRootPath();
						}else{
							alert("失败");
						}
						
					}
				});
    	}else{
    		//alert("false");
    	}
	})
	
	$("#tt_right > span").mouseover(function(){
		$(this).css("color", "#e6e8ea");
		$(this).css("cursor", "pointer");
	});
	$("#tt_right > span").mouseout(function(){
		$(this).css("color", "#fff");
	})
	
	


})
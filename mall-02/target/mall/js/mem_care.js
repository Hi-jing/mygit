// JavaScript Document
// 显示当周的订单的记录情况，运用拆线图和条形图切换展示数据
$(document).ready(function() {

			// 复选框添加全选或非合适的事件
			electAll();

			// 使用icheckrt插件给单选框复选框添加样式
			initialize();

			// 操作事件
			operation();

			// 时期操作
			time_opertion();

			$("#sale_select").change(function() {
						var opt = $("#sale_select").val();
						if (opt == "2") {
							$(".in_input").removeAttr("disabled");
							//$(".now_price").attr("disabled", true);
							//$(".pre_price").attr("disabled", true);

							// alert($(this));
						} else {
							// alert($(this));
							$(".in_input").attr("disabled", true);
							//$(".now_price").removeAttr("disabled");
							//$(".pre_price").removeAttr("disabled");

						}

						if (opt == "3") {
							$(".date_input").removeAttr("disabled");

							// alert($(this));
						} else {
							// alert($(this));
							$(".date_input").attr("disabled", true);

						}

					});

		});

function time_opertion() {
	$('.form_date').datetimepicker({
				todayBtn : 1,
				autoclose : 1,
				startView : 1,
				minView : 1
			});

	// 结束时间改变时触发事件
	$('#end_time').datetimepicker().on('changeDate', function(ev) {

			});
}

function operation() {
	$("#se_operation > span").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".conlook").click(function() {
				$("#se_look_modal").modal("show");
			})

	$(".salelook").click(function() {
				$("#look_sale_modal").modal("show");
			})

	$(".saledelete").click(function() {
				if (confirm("确认要删除吗?")) {
					alert("true");
				} else {
					alert("false");
				}
			});

	$(".se_nav_li > a").mouseover(function() {
				$(this).css("cursor", "pointer");
			});

	$(".se_nav_li > a").click(function() {
				$("#se_nav_condition").text($(this).text());
			});

	$('input[id=lefile01]').change(function() {
				$('#photoCover01').val($(this).val());
			});

	$('input[id=lefile02]').change(function() {
				$('#photoCover02').val($(this).val());
			});

	$('input[id=lefile03]').change(function() {
				$('#photoCover03').val($(this).val());
			});

	$('input[id=lefile04]').change(function() {
				$('#photoCover04').val($(this).val());
			});

	$('input[id=lefile05]').change(function() {
				$('#photoCover05').val($(this).val());
			});
		

		//ajax保存商品信息
	$("#save_goodmsg").click(function() { 
		//alert(getRootPath());
		$.ajax({
			url : getRootPath()+"/saveGoodMsg",
			type : "POST",
			dataType: 'json',
			data : $("#good_form").serialize(),
			success : function(result) {
				alert(result.code);
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){  
 	        alert("请求对象XMLHttpRequest: "+XMLHttpRequest);  
 	        alert("错误类型textStatus: "+textStatus);  
 	        alert("异常对象errorThrown: "+errorThrown);  
	       }  
		});

	});		
	
	
	
		//ajax保存商品信息
	$("#save_goodPic").click(function() { 
		
		
		alert($("#ceshiform").serialize());
		/*$.ajax({
			url : getRootPath()+"/uploadHeadPhoto",
			type : "POST",
//			data : $("#good_form").serialize(),
			success : function(result) {
				if (result.code == 100) {
					alert("请求成功");
				}else{
					alert("请求失败");
				}
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){  
 	        alert("请求对象XMLHttpRequest: "+XMLHttpRequest);  
 	        alert("错误类型textStatus: "+textStatus);  
 	        alert("异常对象errorThrown: "+errorThrown);  
	       }  
		});*/

	});	
	
	
	
		$("#close_model").click(function() {
				$("#add_sign").removeClass("glyphicon glyphicon-info-sign");
				$("#add_sign").addClass("glyphicon glyphicon-ok-sign");
				$("#add_sign").css("color","green");
			
			})
	


}
// 复选框添加全选或非合适的事件
function electAll() {
	$('#se_seall').on('ifChecked', function() {
				$("[name='se_sebar']").iCheck('check');
			});

	$('#se_seall').on('ifUnchecked', function() {
		$("[name='se_sebar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});

	$('#se_se2all').on('ifChecked', function() {
				$("[name='se_se2bar']").iCheck('check');
			});

	$('#se_se2all').on('ifUnchecked', function() {
		$("[name='se_se2bar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});

	$('#se_se3all').on('ifChecked', function() {
				$("[name='se_se3bar']").iCheck('check');
			});

	$('#se_se3all').on('ifUnchecked', function() {
		$("[name='se_se3bar']").iCheck('uncheck');
			// $('input').iCheck('uncheck');
		});
}

// 使用icheckrt插件给单选框复选框添加样式
function initialize() {

	$("input").iCheck({
				checkboxClass : "icheckbox_square-blue",
				radioClass : "iradio_square-blue",
				increaseArea : "20%"
			});
}

function add_picture() {
	$("#add_picture_modal").modal("show");
}


//获得根目录
	function getRootPath() {
		var strFullPath = window.document.location.href;
		var strPath = window.document.location.pathname;
		var pos = strFullPath.indexOf(strPath);
		var prePath = strFullPath.substring(0, pos);
		var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
		return (prePath + postPath);
	}

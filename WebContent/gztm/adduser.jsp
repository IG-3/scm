<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String path=request.getContextPath();
	//http://localhost:8080/工程路径/
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" >
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="user.html">用户管理</a></li>
    <li><a href="#">添加新用户</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息</span></div>
    
    <ul class="forminfo">
    <li><label>用户账号<span>*</span></label><input name="" type="text" class="dfinput" /><span class="remind">标题不能超过30个字符</span></li>
    <li><label>用户姓名<span>*</span></label><input name="" type="text" class="dfinput" /><span class="remind">多个关键字用,隔开</span></li>
    <li><label>用户密码<span>*</span></label><input name="" type="password" class="dfinput" /><span class="remind">默认为用户账号</span></li>
    <li><label>添加日期<span>*</span></label><input name="" type="text" class="dfinput" value="2018/08/01" readonly /></li>
    <li><label>锁定状态<span>*</span></label><cite><input name="" type="radio" value="" />是&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="radio" value="" checked="checked" />否</cite></li>
    <li><label>权限<span>*</span></label><cite><input name="" type="checkbox" value="" class="manager"/>管理员&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="checkbox" value="" />采购&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="checkbox" value="" />销售&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="checkbox" value="" />仓管&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="checkbox" value="" />财务</cite></li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/>&nbsp; 
    <input name="" type="button" class="cancel" value="取消" /></li>
    </ul>
    
    
    </div>
    
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript">
    	$(function(){
	    	$(".manager").change(function(){
	    		$(".forminfo :checkbox:gt(0)").prop('checked',$(this).prop('checked'));
	    	});
	    	
	    	$('.forminfo :checkbox:gt(0)').change(function(){
	    		$('.manager').prop('checked',$('.forminfo :checkbox:gt(0):not(:checked)').length>0?false:true);
	    	})
    	})
    </script>
</body>
</html>
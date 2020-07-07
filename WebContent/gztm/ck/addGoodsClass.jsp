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
    <li>产品管理</li>
    <li><a href="category.html">产品分类列表</a></li>
    <li>添加产品分类</li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息</span></div>
    
    <form action="categoryAddServlet">
    <ul class="forminfo">
    <li><label>产品分类序号<span>*</span></label><input name="cateid" type="text" class="dfinput" disabled= "true" placeholder="无需输入"/><span class="remind">标题不能超过30个字符</span></li>
    <li><label>名称<span>*</span></label><input name="name" type="text" class="dfinput" /><span class="remind">多个关键字用,隔开</span></li>
    <li><label>描述<span>*</span></label><input name="dric" type="text" class="dfinput" /></li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/>&nbsp; 
    <input name="" type="button" class="cancel" value="取消" /></li>
    </ul>
    </form>
    
    </div>
</body>
</html>
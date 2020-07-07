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
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table class="tablelist itemlist" id="detailTable" style="margin-top:10px;">
			<tr>
				
				<th>产品编号</th>
				<th>产品名称</th>
				<th>数量单位</th>
				<th>产品数量</th>
				<th>销售单价</th>
				<th>产品明细总价</th>
			</tr>
				
			<tr>
				
					<td >${soitem.productCode}</td>
					<td>${soitem.pname }</td>
					<td>${soitem.unitName}</td>
					<td>${soitem.num }</td>
					<td>${soitem.unitPrice }></td>
					<td>${soitem.itemPrice }</td>
					
			</tr>
			
			
			
		</table>
</body>
</html>
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
				<th>采购单价</th>
				<th>明细总价</th>
			</tr>
				
			<tr>
				
					<td >${poitem.productCode }</td>
					<td>${poitem.pname }</td>
					<td>${poitem.unitName}</td>
					<td>${poitem.num }</td>
					<td>${poitem.unitPrice }></td>
					<td>${poitem.itemPrice }</td>
					
			</tr>
			
			
			
		</table>
</body>
</html>
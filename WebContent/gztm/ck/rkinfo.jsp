<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String path=request.getContextPath();
	//http://localhost:8080/工程路径/
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
				
				<th>入库时间</th>
				<th>采购单号</th>
				<th>入库经手人</th>
				<th>入库数量</th>
				<th>入库类型</th>
				
			</tr>
			<c:forEach items="${list }" var="s" varStatus="abc">
			
			
			<tr>
			
					
					<td>${s.stockTime }</td>
					<td>${s.orderCode}</td>
					<td>${s.createUser }</td>
					<td>${s.stockNum }></td>
					<td>${s.stockType==1? '采购入库':'销售入库' }</td>
					
					
			</tr>
		
			
			</c:forEach>
			
			
		</table>
		</br>
		</br>
		</br>
		</br>
		<table class="tablelist itemlist" id="detailTable" style="margin-top:10px;">
			<tr>
				
				<th>出库时间</th>
				<th>销售单号</th>
				<th>出库经手人</th>
				<th>出库数量</th>
				<th>出库类型</th>
				
			</tr>
			<c:forEach items="${list2 }" var="s2" varStatus="abc">
			
			
			<tr>
			
					
					<td>${s2.stockTime }</td>
					<td>${s2.orderCode}</td>
					<td>${s2.createUser }</td>
					<td>-${s2.stockNum }></td>
					<td>${s2.stockType==1? '采购入库':'销售出库' }</td>
					
					
			</tr>
		
			
			</c:forEach>
			
			
		</table>
</body>
</html>
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
<link href="css/style.css" rel="stylesheet" type="text/css" />


</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="over.html">采购管理</a></li>
			<li><a href="#">采购单查询</a></li>
		</ul>
	</div>

	<div class="formbody">
		
		<ul class="seachform">
      <form action ="ckQueryServlet" id="s">
			<li><label>产品编号</label><input id="id" name="id" type="text"
				class="scinput" /></li>
				<li><label>产品名称</label><input id="name" name="name" type="text"
				class="scinput" /></li>
			<li><label>库存数量范围</label>
				<input type="text"  class="scinput" id="minNum"  name ="minNum" placeholder="最小值"/></li>
				<li><label>最大值</label>
				<input type="text"  class="scinput" id="maxNum" name="maxNum" placeholder="最大值"/></li>

		
			<li><input name="" type="submit"
				class="scbtn" value="查询" onclick="select()"/></li>
		</form>
		</ul>
		

		<table class="tablelist">
		<thead>
			<tr>
				<th>编号<span class="sort"><img src="../images/px.gif" /></span></th>
				<th>产品编号</th>
				<th>产品名称</th>
				<th>库存数量</th>
				<th>采购在途数</th>
				<th>预销售数</th>
				<th>变更记录</th>
				
			</tr>
			</thead>
			<tbody>
			
		<c:forEach items="${products }" var="s" varStatus="abc">
			
			
			<tr>
				<td>1</td>
					<td >${s.productCode}</td>
					<td>${s.name }</td>
					<td>${s.num}</td>
					<td>${s.poNum }</td>
					<td>${s.soNum }></td>
					<td><a href="ckchangeServlet?id=${s.productCode}">查询</a></td>
					
			</tr>
		
			
			</c:forEach>
			
			</tbody>
		</table>

	</div>

		<script type="text/javascript">
		function select(){
			var id =document.getElementById("id").value;
			var name=document.getElementById("name").value;
			var minNum=document.getElementById("minNum").value;
			var maxNum=document.getElementById("maxNum").value;
			
			var s=document.getElementById("s");
			
		}
		</script>
</body>
</html>
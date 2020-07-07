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
<title>网站后台管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">产品管理</a></li>
			<li><a href="#">产品列表</a></li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">
				<li><a href="productAddServlet"><img src="images/t01.png" />添加</a></li>
			</ul>

		</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th>序号<span class="sort"><img src="images/px.gif" /></span></th>
					<th>产品编号</th>
					<th>产品名称</th>
					<th>数量单位</th>
					<th>分类名称</th>
					<th>添加日期</th>
					<th>销售价</th>
					<th>产品描述</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="s" varStatus="i">
			
			
			<tr>
				<td>${i.index+1 }</td>
					<td >${s.productCode }</td>
					<td>${s.name }</td>
					<td>${s.unitName }</td>
					<td>${s.cname }</td>
					<td>${s.createDate }</td>
					<td>${s.price}</td>
					<td>${s.remark}</td>
					
				
					<td><a href="productChangeServlet?id=${s.productCode }&&name=${s.name }&&rek=${s.remark}&&date=${s.createDate }&&unitname=${s.unitName } class="tablelink click">修改</a>
					<a href="productDelServlet?id=${s.productCode }" class="tablelink click">删除</a>
					
					</td>
			</tr>
		
			
			</c:forEach>
				


			</tbody>
		</table>


		<div class="pagin">
			<div class="message">
				共<span class="blue">${total }</span>页，当前显示第&nbsp;<span class="blue">${currpage }&nbsp;</span>页
			</div>
			<ul class="paginList">
			<c:if test="${currpage!=total }">
				<li class="paginItem"><a href="productServlet?page=${currpage }"><p class="pagepre"></p></a></li>
				</c:if>
				
				<c:forEach begin="1"  end="${total }" var="p">
				<c:choose>
				<c:when test="${p==currpage }">
				<li class="paginItem current"><a href="productServlet?page=${p }">${p }</a></li>
				
				
				</c:when>
				
				<c:otherwise>
				<li class="paginItem"><a href="productServlet?page=${p }">${p }</a></li>
				
				</c:otherwise>
				
				
				</c:choose>
				
				
				</c:forEach>
				<c:if test="${currpage!=total }">
				
				<li class="paginItem"><a href="productServlet?page=${currpage + 1 }"><p class="pagenxt"></p></a></li>
				</c:if>
			</ul>
		</div>


		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span>
			</div>

			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>

		</div>




	</div>
	<script type="text/JavaScript" src="js/jquery.js"></script>
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>

	<script type="text/javascript">
		$(function() {
			$(".click").click(function() {
				$(".tip").fadeIn(200);
			});

			$(".tiptop a").click(function() {
				$(".tip").fadeOut(200);
			});

			$(".sure").click(function() {
				$(".tip").fadeOut(100);
			});

			$(".cancel").click(function() {
				$(".tip").fadeOut(100);
			});

		});
	</script>
</body>
</html>
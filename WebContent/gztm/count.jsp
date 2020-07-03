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

<meta charset="UTF-8">
<title>网站后台管理系统</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">库存管理</a></li>
			<li><a href="#">库存盘点</a></li>
		</ul>
	</div>

	<div class="rightinfo">
		<table class="tablelist">
			<thead>
				<tr>
					<th>序号<span class="sort"><img src="../images/px.gif" /></span></th>
					<th>产品编号</th>
					<th>产品名称</th>
					<th>当前库存</th>
					<th>采购在途数</th>
					<th>预销售数</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>pro0001</td>
					<td>金龙鱼油</td>
					<td>100</td>
					<td>32</td>
					<td>18</td>
					<td><a href="changeCount.jsp" class="tablelink">盘点</a></td>
				</tr>
				<tr>
					<td>2</td>
					<td>pro0002</td>
					<td>稻花香大米</td>
					<td>90</td>
					<td>55</td>
					<td>43</td>
					<td><a href="changeCount.jsp" class="tablelink click">盘点</a></td>
				</tr>
				

			</tbody>
		</table>


		<div class="pagin">
			<div class="message">
				共<span class="blue">10</span>页，当前显示第&nbsp;<span class="blue">2&nbsp;</span>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><p
						class="pagepre"></p></a></li>
				<li class="paginItem"><a href="javascript:;">1</a></li>
				<li class="paginItem current"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><p
						class="pagenxt"></p></a></li>
			</ul>
		</div>






	</div>
	<script type="text/JavaScript" src="../js/jquery.js"></script>
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
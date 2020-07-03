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
<title>网站后台管理系统</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="over.html">销售管理</a></li>
			<li>添加销售单</li>
		</ul>
	</div>

	<div id="poDiv" class="rightinfo">
		<form action="#" id="pomainForm">
		<div class="tools">

			<ul class="toolbar">
				<li onclick="addItem()"><img src="../images/t01.png" />增加明细</li>
				<li onclick="savePomain()"><img src="../images/t07.png" />保存</li>
			</ul>

		</div>
		<table class="tablelist">

			<tr>
				<td>销售单编号</td>
				<td><input type="text" value="sm0001" class="poinput"/> <span>*</span></td>
				<td>创建时间</td>
				<td><input type="text" value="2018-01-29" class="poinput"/> <span>*</span></td>
				<td>客户名称</td>
				<td><input type="text" readonly class="poinput"/> <span>*</span> <img src="../images/leftico03.png" class="point" onclick="" /></td>
			</tr>
			<tr>
				<td>创建用户</td>
				<td><input type="text" readonly class="poinput" value="admin"/> <span>*</span></td>
				<td>附加费用</td>
				<td><input type="text" class="poinput"/> <span>*</span></td>
				<td>产品总价</td>
				<td><input type="text" class="poinput"/> <span>*</span></td>
			</tr>
			<tr>
				<td>付款方式</td>
				<td><select class="poinput">
					<option>货到付款</option>
					<option>款到发货</option>
					<option>预付款到发货</option>
				</select> <span>*</span></td>
				<td>最低预付款金额</td>
				<td><input type="text" class="poinput" /> <span>*</span></td>
				<td>备注</td>
				<td><input type="text" class="poinput" /></td>
			</tr>

		</table>
		
		<table class="tablelist itemlist" id="detailTable" style="margin-top:10px;">
			<tr>
				<th>序号</th>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>数量单位</th>
				<th>产品数量</th>
				<th>销售单价</th>
				<th>销售明细总价</th>
				<th>操作</th>
			</tr>
		</table>
		</form>


		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span>
			</div>

			<div class="tipinfo">
				<span><img src="../images/ticon.png" /></span>
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
	<div id="productDiv" class="rightinfo" style="display:none">
		<div class="tools">
			<ul class="toolbar">
				<li onclick="sure()"><span><img src="../images/t06.png" /></span>确定</li>
				<li onclick="hiddenDiv()"><span><img src="../images/t03.png" /></span>取消</li>
			</ul>
		</div>
		<table class="tablelist" id="spxxTable">
		  <tr>
		    <td>选择</td>
		    <td>商品编码</td>
		    <td>商品名称</td>
		    <td>数量单位</td>
		  </tr>
		  <tr>
		    <td><input type="radio" name="choice"/></td>
		    <td>00001</td>
		    <td>光明牛奶</td>
		    <td>箱</td>
		  </tr>
		  <tr>
		    <td><input type="radio" name="choice"/></td>
		    <td>00002</td>
		    <td>西湖大米</td>
		    <td>袋</td>
		  </tr>
		  <tr>
		    <td><input type="radio" name="choice"/></td>
		    <td>00003</td>
		    <td>金龙鱼色拉油</td>
		    <td>瓶</td>
		  </tr>

		</table>
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
	<script type="text/javascript" src="../js/productDiv.js"></script>
</body>
</html>
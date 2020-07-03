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

<script type="text/javascript" src="../js/laydate/laydate.js"></script>
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
		<form>
		<ul class="seachform">

			<li><label>采购单编号</label><input name="" type="text"
				class="scinput" /></li>
			<li><label>日期范围</label>
				<input type="text" name="" class="scinput" id="timeRange" placeholder="起始日期 ~ 截止日期"/></li>

			<li><label>处理状态</label>
					<select>
						<option></option>
						<option>新增</option>
						<option>已入库</option>
						<option>已付款</option>
						<option>已了结</option>
					</select>
			</li>

			<li><label>&nbsp;</label><input name="" type="submit"
				class="scbtn" value="查询" /></li>

		</ul>
		</form>

		<table class="tablelist">
			<tr>
				<th>编号<span class="sort"><img src="../images/px.gif" /></span></th>
				<th>采购单编号</th>
				<th>创建时间</th>
				<th>供应商名称</th>
				<th>创建用户</th>
				<th>附加费用</th>
				<th>采购产品总价</th>
				<th>采购单总价格</th>
				<th>付款方式</th>
				<th>处理状态</th>
			</tr>
		</table>

	</div>
	<script type="text/javascript">
		laydate.render({
			elem: '#timeRange',
			type: 'date',
			range: '~',
			format:'yyyy-MM-dd'
		});
	</script>
</body>
</html>
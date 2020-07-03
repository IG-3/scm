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
<link href="../css/style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="../js/laydate/laydate.js"></script>
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>报表</li>
			<li>月度销售报表</li>
		</ul>
	</div>

	<div class="formbody">
		<form>
		<ul class="seachform">

			<li>
				<label>日期</label>
				<input type="text" name="" class="scinput" id="time" placeholder="请选择年月"/>
			</li>



			<li><label>&nbsp;</label><input name="" type="submit"
				class="scbtn" value="查询" /></li>

		</ul>
		</form>

		<!-- 主信息 -->
		<table class="tablelist">
			<tr>
				<th>销售单数</th>
				<th>已了结单数</th>
				<th>销售总金额</th>
				<th>已付款金额</th>
			</tr>
			<tr>
				<td>5</td>
				<td></td>
				<td>150</td>
				<td></td>
			</tr>
		</table>
		
		<!-- 明细信息列表 -->
		<table class="tablelist" style="margin-top:20px">
			<tr>
				<th>编号<span class="sort"><img src="../images/px.gif" /></span></th>
				<th>销售单编号</th>
				<th>客户编号</th>
				<th>客户名称</th>
				<th>销售日期</th>
				<th>经手人</th>
				<th>销售单总价格</th>
				<th>未付款金额</th>
				<th>处理状态</th>
			</tr>
			<tr>
				<td>1</td>
				<td>s1001</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>30</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>2</td>
				<td>s1002</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>30</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>3</td>
				<td>s1003</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>30</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>4</td>
				<td>s1004</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>30</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>5</td>
				<td>s1005</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>name</td>
				<td>30</td>
				<td></td>
				<td></td>
			</tr>
		</table>

	</div>
	<script type="text/javascript">
		laydate.render({
			elem: '#time',
			type: 'month'
		});
	</script>
</body>
</html>
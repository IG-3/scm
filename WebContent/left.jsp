<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body style="background: #f0f9fd;">
	<div class="lefttop">
		<span></span>菜单管理
	</div>

	<dl class="leftmenu">

		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>管理信息
			</div>
			<ul class="menuson">
				<li class="active"><cite></cite><a href="main.jsp"
					target="rightFrame">首页</a><i></i></li>
				<li><cite></cite><a href="gztm/user.jsp" target="rightFrame">用户管理</a><i></i></li>
				<li><cite></cite><a href="login.jsp" target="_parent">退出</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>产品管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="gztm/category.jsp" target="rightFrame">产品分类列表</a><i></i></li>
				<li><cite></cite><a href="gztm/product.jsp" target="rightFrame">产品列表</a><i></i></li>
			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>采购管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="gztm/vender.jsp" target="rightFrame">供应商管理</a><i></i></li>
				<li><cite></cite><a href="gztm/over.jsp" target="rightFrame">新添采购单</a><i></i></li>
				<li><cite></cite><a href="gztm/end.jsp" target="rightFrame">采购单了结</a><i></i></li>
				<li><cite></cite><a href="gztm/query.jsp" target="rightFrame">采购单查询</a><i></i></li>
			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>仓管管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="gztm/inbound.jsp" target="rightFrame">入库登记</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">出库登记</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">库存查询</a><i></i></li>
				<li><cite></cite><a href="gztm/count.jsp" target="rightFrame">库存盘点</a><i></i></li>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>销售管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="error.jsp" target="rightFrame">客户管理</a><i></i></li>
				<li><cite></cite><a href="gztm/addSale.jsp" target="rightFrame">新添销售单</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">销售单了结</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">销售单查询</a><i></i></li>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>财务收支
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="gztm/inMoney.jsp" target="rightFrame">收款登记</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">付款登记</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">收支查询</a><i></i></li>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>月度报表
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="error.jsp" target="rightFrame">月度采购报表</a><i></i></li>
				<li><cite></cite><a href="gztm/report.jsp" target="rightFrame">月度销售报表</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">月度出库报表</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">月度入库报表</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">月度库存报表</a><i></i></li>
				<li><cite></cite><a href="error.jsp" target="rightFrame">月度收支报表</a><i></i></li>
			</ul>

		</dd>

	</dl>

	<script language="JavaScript" src="js/jquery.js"></script>

	<script type="text/javascript">
		$(function() {
			//导航切换
			$(".menuson li").click(function() {
				$(".menuson li.active").removeClass("active")
				$(this).addClass("active");
			});

			$('.title').click(function() {
				var $ul = $(this).next('ul');
				$('dd').find('ul').slideUp();
				if ($ul.is(':visible')) {
					$(this).next('ul').slideUp();
				} else {
					$(this).next('ul').slideDown();
				}
			});
		})
	</script>
</body>
</html>

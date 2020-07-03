<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    	<li><a href="#">首页</a></li>
    </ul>
    </div>
    
    <div class="mainindex">
    
    
    <div class="welinfo">
    <img src="images/sun.png" alt="天气" />
    <span>Admin早上好，欢迎使用信息管理系统</span>
    </div>
    
    <div class="welinfo">
    <img src="images/time.png" alt="时间" />
    <span>您登录的时间：<span class="logTime"></span></span>
    </div>
    
    <script type="text/javascript">
    	var date = new Date().toLocaleString();
    	$('.welinfo .logTime').text(date);
    </script>
</body>
</html>

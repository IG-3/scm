<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body style="background:url(images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main.html" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
    </div>
       
    <div class="topright">    
 
    <div class="user">
    <span class="in">admin</span>
    
   	<span class="out">系统时间：<span class="time"></span>
    </div>    
    </div>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
    	var date;
    	function now(){
    		date = new Date().toLocaleString();
    		$(".user .time").text(date);
    	}
    	setInterval("now()",1000);
    </script>
</body>
</html>

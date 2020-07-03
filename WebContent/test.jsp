<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<script type="text/javascript" src="js/vue.min.js"></script>
	<div id="vue_det">
	    <h2>site : {{site}}</h2>
	    <h2>url : {{url}}</h2>
	    <h2>Alexa : {{alexa}}</h2>
	    
	    
	    <input type="checkbox" id="sel"/><label for="sel">选择</label>
	</div>
	
	<input type="text"/>
	<script type="text/javascript">
	// 我们的数据对象
	var da = { site: "菜鸟教程", url: "www.runoob.com", alexa: 10000}
	var vm = new Vue({
	    el: '#vue_det',
	    data: da
	})
	 
	document.write(vm.$data === da) // true
	document.write("<br>") 
	document.write(vm.$el === document.getElementById('vue_det')) // true
	</script>
	
</body>
</html>
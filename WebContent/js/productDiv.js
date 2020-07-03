var rowIndex;

function addItem(){
	var tr = $('<tr></tr>');
	$('#detailTable').append(tr);
	tr.append('<td>'+tr.index()+'</td>'
		+'<td><input type="text" name="productCode" class="poinput" readonly /> <img src="../images/leftico03.png" class="point" onclick="choiceSpxx(this)" /></td>'  
		+'<td><input type="text" name="name" class="poinput" readonly /></td>'
		+'<td><input type="text" name="" class="poinput" readonly /></td>'
		+'<td><input type="text" class="poinput" /></td>'
		+'<td><input type="text" class="poinput" /></td>'
		+'<td><input type="text" class="poinput"/></td>'
		+'<td><img src="../images/delete.gif" class="point" onclick="delItem(this)"/></td>'
	);
}

//删除行,注意这里的行号全部要重新计算 刷新的
function delItem(delImg) {
	var tr = $(delImg).parents('tr');
	var index = tr.index()-1;// 获得删除行的前一行的索引
	tr.remove();
	// 修改删除的行后面行的序号
	$('#detailTable tr:gt('+index+')').each(function(){
		$(this).find('td:first').text($(this).index());
	});
}

// 选择产品
function choiceSpxx(img){
	rowIndex = $(img).parents('tr').index();// 选择行的索引
	showDiv();
	$('#spxxTable [name=choice]').prop('checked',false);
}

function hiddenDiv() {
	$('#poDiv').show();
	$('#productDiv').hide();
	
}
function showDiv(){
	$('#poDiv').hide();
	$('#productDiv').show();
}

function sure(){
	var check = $('#spxxTable [name=choice]:checked');
	if(check.length==0){
		alert('请先选择产品');
		return;
	}
	var tr = check.parents('tr');
	tr.find('td:gt(0)').each(function(i){
		$('#detailTable tr:eq('+rowIndex+')').find('td:eq('+(i+1)+') :text').val($(this).text());
	});
	hiddenDiv();
	
}

function savePomain(){
	$('#pomainForm').submit();
}
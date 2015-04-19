<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AJAX文件下载演示</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script>
//Ajax 文件下载
jQuery.download = function(url, data, method){
    // 获取url和data
    if( url && data ){ 
        // data 是 string 或者 array/object
        data = typeof data == 'string' ? data : jQuery.param(data);
        // 把参数组装成 form的  input
        var inputs = '';
        jQuery.each(data.split('&'), function(){ 
            var pair = this.split('=');
            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
        });
        // request发送请求
        //var form = jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
        var form = jQuery('<form/>');
        form.attr('style','display:none');
        //form.attr('target','');
        form.attr('method',method||'post');
        form.attr('action',url);
        form.html(inputs);
        form.appendTo('body').submit().remove();
    };
};

function doDownload(){
	$.download('export.jsp','p1=nexus5','post');	
}


</script>
</head>
<body>
<h1>here WE GO</h1>
懒人快乐，,,,哈哈。

<a href="javascript:doDownload()">去虾仔</a>
</body>
</html>
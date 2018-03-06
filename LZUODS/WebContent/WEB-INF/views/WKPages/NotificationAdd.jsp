<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知添加</title>
</head>
<body>
	<form action="add_notify" method="post">
		请输入通知标题:<input name="title" type="text" />
		<input name="society_no" type="hidden" value="1" >
		<input name="publisher_no" type="hidden" value="0" >
		<input name="publish_time" type="hidden" value="20180305" >
		请输入通知内容:<textarea name="content" rows="2" cols="6"></textarea>
		<input type="submit" />
		<input type="reset">
	</form>
</body>
</html>
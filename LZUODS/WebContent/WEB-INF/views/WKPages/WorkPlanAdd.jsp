<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>计划添加</title>
</head>
<body>
	<form action="add_workplan" method="POST">
		请输入计划标题：<input name="title" type="text" value="这是默认标题" />
		请输入计划时间：<input name="happen_time" type="text" value="20180305" >
		请输入计划内容：<textarea name="content" rows="2" cols="6"></textarea>
		<input name="planer_no" type="hidden" value='2' >
		<input name="plan_status" type="hidden" value='3' >
		<input type="submit" />
		<input type="reset">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="ahead" method="POST">
		<input type="text" name="account" value="admin"/>
		<input type="password" name="passwd" value="123456" />
		<input type="hidden" name="login_status" value="<%=request.getAttribute("login_status")%>">
		<input type="submit" />
		<input type="reset" />
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getParameter("func_condition") %>
<div>
<form action="HMMang" method="post">
<input type="hidden" name="func_condition" value="<%=request.getParameter("func_condition") %>"/>
<button type="submit">确认</button>
</form>
<button type="button">取消</button>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
当你看见这个页面时意味着你已经成功地通过文件名${title.toString()}访问指定文件，
<br />
当前文件的绝对路径为：<%= application.getRealPath(request.getRequestURI()) %>
</body>
</html>
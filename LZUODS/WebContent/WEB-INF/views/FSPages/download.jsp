<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Here is a download page</title>
</head>
<%@ page import="java.util.List" %>
<body>
	<%
		List<String> file_names = (List<String>)request.getAttribute("file_list");
		if( file_names != null){
			for( int i = 0;i < file_names.size(); i++) {
	%>
			<a href="download.action?file_name=<%=file_names.get( i) %>"><%=file_names.get( i) %></a>
	<%
			}
		} else{
	%>
		<%=file_names %>
	<%
		}
	%>
	<br />
	<%= application.getRealPath("/") %>
</body>
</html>
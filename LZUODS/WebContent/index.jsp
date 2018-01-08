<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="com.gsb.BasicObject.MBG.AtvInfo" %>
<body>
<% AtvInfo atv_info = (AtvInfo) request.getAttribute("atv_info"); %>
活动地点：<%= atv_info!=null?atv_info.getAtvTopic():"没有数据" %>
<a href="/<%= this.getServletContext().getServletContextName() %>/HMM/HMHome">Homepage</a>
</body>
</html>
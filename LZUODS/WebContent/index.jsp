<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="com.gsb.BasicObject.MBGPOJO.AtvInfo" %>
<body>
<a href="/<%= this.getServletContext().getServletContextName() %>/HMM/Home">Homepage</a>
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/Notifications">Notifications</a>
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlans">WorkPlans</a>
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/NotificationAdd">NotificationAdd</a>
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlanAdd">WorkPlanAdd</a>
<a href="/<%= this.getServletContext().getServletContextName() %>/SPM/SympathyAtv">SympathyAtvs</a>

</body>
</html>
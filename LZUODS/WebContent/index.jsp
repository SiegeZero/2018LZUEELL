<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ page import="com.gsb.BasicObject.MBGPOJO.AtvInfo" %>
<body>
<a href="/<%= this.getServletContext().getServletContextName() %>/HMM/Home">Homepage</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/Notifications">Notifications</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlans">WorkPlans</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlanDel">WorkPlanDelete</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/NotificationDel">NotificationDelete</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlanChange">WorkPlanChange</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/NotificationChange">NotificationChange</a><br />

<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/NotificationAdd">NotificationAdd</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/WKM/WorkPlanAdd">WorkPlanAdd</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/SPM/SympathyAtv">SympathyAtvs</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/FSM/upload">FileUpload</a><br />
<a href="/<%= this.getServletContext().getServletContextName() %>/FSM/download">FileDownload</a><br />

</body>
</html>
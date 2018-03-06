<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知中心</title>
<%@page import="java.util.List,com.gsb.BasicObject.MBGPOJO.Notification" %>
<%
	List<Notification> notify_list = (List<Notification>)request.getAttribute("notify_list");
%>
</head>
<body>
	<%
	if( notify_list != null && !notify_list.isEmpty()) {
		for( Notification n: notify_list) { 
	%>
		<p>
		通知Id：<%=n.getNotificationNo() %>&nbsp
		通知发布人Id：<%=n.getPublisherNo() %> &nbsp
		通知发布时间：<%=n.getPublishTime() %> &nbsp
		通知标题：<%=n.getTitle() %> &nbsp
		通知内容：<%=new String(n.getNotificationContent()) %> &nbsp
		</p>
	<%
		}
	}
	%>
</body>
</html>
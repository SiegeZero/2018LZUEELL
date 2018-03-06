<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工作计划测试页面</title>
</head>
<%@page import="java.util.List,com.gsb.BasicObject.MBGPOJO.WorkPlan" %>

<%
List<WorkPlan> workplan_list = (List<WorkPlan>)request.getAttribute("workplan_list");
%>
<body>
	<%
	if( workplan_list != null && !workplan_list.isEmpty()) {
		for( WorkPlan p: workplan_list) { 
	%>
		<p>
		计划人Id：<%=p.getSysNo() %>&nbsp
		计划时间：<%=p.getHappenDate() %> &nbsp
		计划标题：<%=p.getTitle() %> &nbsp
		计划内容：<%=new String(p.getRemark()) %> &nbsp
		计划状态：<%=p.getStatus() %>&nbsp 
		</p>
	<%
		}
	}
	%>
</body>
</html>
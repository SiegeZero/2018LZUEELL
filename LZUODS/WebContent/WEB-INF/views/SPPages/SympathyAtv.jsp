<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>慰问活动页面</title>
</head>
<%@ page import="
	java.util.List,
	java.util.Map,
	com.gsb.BasicObject.MBGPOJO.SympathyAtv,
	com.gsb.BasicObject.Beans.SympathyWithName" %>
<%
	List<SympathyAtv> sympathy_atv_list = (List<SympathyAtv>)request.getAttribute("sympathy_atv_list");
	List<Map<SympathyAtv, List<SympathyWithName>>> sympathy_list = (List<Map<SympathyAtv, List<SympathyWithName>>>)request.getAttribute("sympathy_list");
%>
<body>
<%
if(sympathy_atv_list != null && !sympathy_atv_list.isEmpty()){
	for( int i = 0;i<sympathy_atv_list.size();i++) {
		SympathyAtv atv = sympathy_atv_list.get(i);
		Map<SympathyAtv, List<SympathyWithName>> map = sympathy_list.get(i);
	%>
	<span><%=atv.getActivityNo() %></span>
	<span><%=atv.getSympathyTime() %></span>
	<span><%=atv.getActivityRemark() %></span>
	<hr />
	<%
		List<SympathyWithName> sym_list = map.get(sympathy_atv_list.get(i));
		if(  sym_list != null && !sym_list.isEmpty()) {
			for( SympathyWithName s:sym_list){
				
	%>
	<span><%=s.getSysNo() %></span>
	<span><%=s.getPerson_name() %></span>
	<span><%=s.getSympathyTime() %></span>
	<hr />
<%
			}
		}
	}
}
%>
</body>
</html>
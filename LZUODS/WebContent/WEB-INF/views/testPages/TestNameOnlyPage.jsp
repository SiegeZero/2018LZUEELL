<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@page import="java.util.List,com.gsb.BasicObject.MBG.Person"%>
<body>
当你看见这个页面时意味着你已经成功地通过文件名访问指定文件，
<br />
当前文件的绝对路径为：<%= application.getRealPath(request.getRequestURI()) %>
<%
List<Person> list = (List<Person>)request.getAttribute("person_list");
int index = 0;
%>
<%= application.getAttribute("person_list") %>
<table>
<% while( index < list.size()) { %>
	<tr>
		<td><%= list.get(index).getSysNo() %></td>
		<td><%= list.get(index).getName() %></td>
		<td><%= list.get(index).getTelephoneNum() %></td>
		<td><%= list.get(index).getPoliticalStatus()%></td>
	</tr>
<% 
			index++;
		}
%>
</table>

</body>
</html>
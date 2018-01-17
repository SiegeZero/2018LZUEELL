<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">

<head style="height: 100%">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--IE浏览器渲染方式-->
<title>Document</title>
</head>
<%@ page import="java.util.List,java.lang.String,java.util.HashMap" %>
<%
	List<String>[] stuffs = (List<String>[])request.getAttribute("stuffs");
	List<?>[] points = (List<?>[])request.getAttribute("points");
	
%>
<body>
	<div>
		<table>
			<tr>
				<th>姓名</th>
				<th>分数</th>
				<th>百分比</th>
				<th>评定等级</th>
			</tr>
			<%
				int i=0;
				while(i<stuffs.length){
					int j=0;
					while(j<stuffs[i].size()){
						HashMap<String, String> map = (HashMap<String,String>)points[i].get(j);
			%>
			<tr>
				<td><a href="judge?group=<%=i %>&id=<%=j %>"><%= stuffs[i].get(j) %></a></td>
				<td><%= map.get("real_point") %></td>
				<td>perc1</td>
				<td>level1</td>
			</tr>
			<%
					j++;
					}
				i++;
				}
			%>
		</table>
	</div>
</body>

</html>

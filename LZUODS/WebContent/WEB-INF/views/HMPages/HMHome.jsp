<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<! doctype html>
<html>

<head>
<title>首页</title>
</head>
<%@page import ="java.io.File,java.util.List,java.util.ArrayList" %>
<%
String[] allamount_attrs = (String[])request.getAttribute("allamount_attrs");
String[] party_attrs = (String[])request.getAttribute("party_attrs");
List<String[]> details = new ArrayList<>();
if( allamount_attrs != null)
	details.add( allamount_attrs);
if( party_attrs != null)
	details.add( party_attrs);
%>
<body>
	<jsp:include page="../public/NavigationBar.jsp"></jsp:include>

    <div class="container-fluid">
        <p class="alert alert-info"><strong>主页</strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
			少于100岁的退休人员人数：<%= request.getAttribute("lessthan100") %>
		</strong></p>
    </div>
    <%
    for( String[] tmp:details) {
    %>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
    <%
    	for( String t:tmp) {
    %>
       	<%=t %>：<%= request.getAttribute(t) %>人
    <%
    	}
    %>
    	</strong></p>
    </div>
    <%
    }
    %>
</body>
</html>
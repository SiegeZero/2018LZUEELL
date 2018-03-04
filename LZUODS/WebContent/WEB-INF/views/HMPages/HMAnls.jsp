<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<! doctype html>
<html>

<head>
<title>统计分析</title>
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
	<jsp:include page="NavigationBar.jsp"></jsp:include>

    <div class="container-fluid">
        <p class="alert alert-info"><strong>基本数据</strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
			小于100岁的退休人员人数：<%= request.getAttribute("lessthan100") %>
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
    
    <div style="width:50%;margin: 0px auto;">
    	<canvas id="chart-pie" width="450" height="450"></canvas>
    </div>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.bundle.min.js"></script>
    <script src="js/chart-pie.js"></script>
    
</body>
</html>
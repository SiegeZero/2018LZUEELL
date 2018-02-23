<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<%@page import ="java.io.File" %>
<body>
	<jsp:include page="NavigationBar.jsp"></jsp:include>

    <div class="container-fluid">
        <p class="alert alert-info"><strong>主页</strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
			少于100岁的退休人员人数：<%= request.getAttribute("lessthan100") %>
		</strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
       		 党员总人数：<%= request.getAttribute("party0") %>
        </strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
       		 女性党员总人数：<%= request.getAttribute("party1") %>
        </strong></p>
    </div>
    <div class="container-fluid">
        <p class="alert alert-info"><strong>
       		 男性党员总人数：<%= request.getAttribute("party2") %>
        </strong></p>
    </div>
    <div>
    	
    </div>
</body>
</html>
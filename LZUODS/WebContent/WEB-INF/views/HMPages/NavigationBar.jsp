<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: "宋体"
}

#NavigationBar {
	z-index: 1;
	background: #3b78e7;
	width: 100%;
	height: 12%;
	margin: 0px;
	padding: 0px;
	line-height: 84px;
	color: #FFFFFF;
	position: fixed;
}

#NavigationBar div {
	padding-right: 2%;
	font-size: 22px;
	float: right;
	font-weight: bold;
}

#NavigationBar span {
	padding-left: 2%;
	font-size: 30px;
	font-weight: bold;
}
#NavigationBar a:link {
	text-decoration: none;
	color: white;
}

#NavigationBar a:visited {
	text-decoration: none;
	color: white;
}
</style>
</head>
<body>
	<div id="NavigationBar">
		<span>离退休工作管理系统</span>
		<div>
			<a id="home_page_btn" href="HMHome">首页</a> <a id="human_manage_btn"
				href="HMMang">人员管理</a> <a id="party_manage_btn" href="HMPaty">党建管理</a>
			<a id="others_btn">其他模块</a>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0; /*去除边缘间隙*/
	padding: 0;
	font-family: "微软雅黑";
}

#NavigationBar {
	background: #0F88EB;
	width: 100%;
	line-height: 56px;
	position: fixed; /*绝对定位，不随网页滚动而滚动*/
}

#NavigationBar span {
	position: absolute;
	display: block;
	color: #FFFFFF;
	font-size: 22px;
	font-weight: bold;
	text-align: center;
	padding: 5px;
}

#NavigationBar ul {
	margin: 0px;
	padding: 0px;
	list-style-type: none;
	overflow: hidden; /*长度溢出文字将被隐藏*/
}

#NavigationBar li {
	right: 10px;
	float: right;
}

#NavigationBar a {
	display: inline-block;
	padding: 5px;
	margin-right: 20px;
	text-align: center;
	border-bottom: none;
	width: 120px;
	font-size: 18px;
	font-weight: bold;
	color: #FFFFFF;
	-webkit-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	-moz-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	-o-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	transition: background-color 0.5s ease, color 0.5s ease, border-bottom
		0.5s ease;
}

#NavigationBar a:link, a:visited {
	text-decoration: none;
	text-transform: uppercase;
}

#NavigationBar a:hover, a:active {
	background-color: #36C6D3; /*鼠标滑过时的背景色*/
}
</style>
</head>
<body>
	<div id="NavigationBar">
		<span>兰州大学离退休工作管理系统</span>
		<ul>
			<li><a id="others_btn">其他模块</a></li>
			<li><a id="party_manage_btn" href="HMPaty">党建管理</a></li>
			<li><a id="human_manage_btn" href="HMMang">人员管理 </a></li>
			<li><a id="home_page_btn" href="HMHome">首页</a></li>
		</ul>
	</div>
</body>
</html>
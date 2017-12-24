<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细情况</title>
</head>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: "宋体";
}

#NavigationBar {
	background: #3b78e7;
	width: 100%;
	height: 12%;
	margin: 0px;
	padding: 0px;
	line-height: 84px;
}

#Title {
	margin-left: 2%;
	font-size: 30px;
	font-weight: bold;
	color: #FFFFFF;
}

table {
	text-align: left;
	font-size: 12px;
	width: 95%;
	color: #000000;
}

td {
	width: 15%;
	white-space: nowrap;
	text-align: left;
	padding-left: 10px;
	padding-top: 1px;
}

#Detail span {
	display: block;
	background: #E3E3E3;
	padding: 5px;
	margin-left: 1%;
	margin-top: 1%;
	color: #3B78E7;
	font-weight: bold;
	font-size: 12px;
}
</style>
</head>
<body>
	<div id="NavigationBar">
		<span id="Title">离退休工作管理系统</span>
	</div>
	<div id="Detail">
		<span>基本信息</span>
		<center>
			<table>
				<tr>
					<td>工资编号:</td>
					<td>10001</td>
					<td>姓名:</td>
					<td>张三</td>
					<td>性别:</td>
					<td>男</td>
					<td rowspan="4" style="width: 200px"><img
						src="snipaste_20171111_233556.png" height="150px" width="150px"></td>
				</tr>
				<tr>
					<td>所在分会:</td>
					<td>离休一分会</td>
					<td>工资库:</td>
					<td>93前</td>
					<td>工作单位:</td>
					<td>文学院</td>
				</tr>
				<tr>
					<td>籍贯:</td>
					<td>甘肃兰州</td>
					<td>学历:</td>
					<td>本科</td>
					<td>民族:</td>
					<td>汉</td>
				</tr>
				<tr>
					<td>离休情况:</td>
					<td>离休</td>
					<td>政治面貌:</td>
					<td>党员</td>
					<td>兵役情况:</td>
					<td>军人</td>
				</tr>
			</table>
		</center>
	</div>
	<div id="Detail">
		<span>工作经历</span>
		<center>这里是工作经历</center>
	</div>
	<div id="Detail">
		<span>家庭情况</span>
		<center>这里是家庭情况</center>
	</div>
	<div id="Detail">
		<span>健康状况</span>
		<center>这里是健康状况</center>
	</div>
	<div id="Detail">
		<span>家庭住址</span>
		<center>这里是家庭住址</center>
	</div>
</body>
</html>
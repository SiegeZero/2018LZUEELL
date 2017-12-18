<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员管理</title>
<style>
#HMMenu {
	padding-top: 84px;
	z-index: 2;
	width: 15%;
	height: 80%;
	position: fixed;
}

#HMMenu span {
	display: block;
	padding-bottom: 8px;
	padding-top: 8px;
	padding-left: 36px;
	background: #36C6D3;
	color: #FFFFFF;
	font-size: 18px;
	font-weight: bold;
}

#HMMenu ul {
	padding-left: 33%;
	width: 48%;
	list-style: none;
	font-size: 12px;
	line-height: 36px;
	font-weight: bold;
}

#CommentField {
	width: 85%;
	z-index: 3;
	float: right;
	padding-top: 7%;
}

#SearchField {
	width: 50%;
	height: 28px;
	font-size: 12px;
	color: #777777;
	padding-left: 10px;
	border: thin solid #3B78E7;
}

#SearchBtn {
	background: #3B78E7;
	color: #FFFFFF;
	width: 72px;
	height: 30px;
	font-size: 12px;
	border: #000000;
}

#BaseAttr li {
	float: left;
	list-style: none;
	width: 8.2%;
	font-size: 12px;
	font-weight: bold;
	color: #3B78E7;
}

#HMInfoAndSearch li {
	list-style: none;
	color: #3B78E7;
	font-size: 12px;
	padding-left: 3%;
	font-weight: bold;
	line-height: 200%;
}

#HMInfoAndSearch table {
	width: 80%;
	font-size: 12px;
	padding-left: 2%;
}

#HMInfoAndSearch td {
	border: 0px #FFFFFF;
	white-space: nowrap;
	text-align: left;
	padding: 10px;
}

#HMTools {
	padding-left: 3%;
}

#HMTools input {
	width: 66px;
	height: 24px;
	background: #3B78E7;
	color: #FFFFFF;
	border: #000000;
}
</style>
</head>
<body>
	<jsp:include page="NavigationBar.jsp"></jsp:include>
	<div id="HMMenu">
		<span>人员管理</span>
		<ul>
			<li>人员信息</li>
			<li>工资管理</li>
			<li>统计分析</li>
			<li>其他功能</li>
		</ul>
	</div>
	<div id="CommentField">
		<div id="HMInfoAndSearch">
			<center>
				<input id="SearchField" type="text" value="输入要查找的信息"> <input
					id="SearchBtn" type="button" value="搜索">
			</center>
			<br />
			<div id="BaseAttr">
				<li>基本选项：</li>
				<li>性别</li>
				<li>兵役情况</li>
				<li>离休情况</li>
				<li>在世情况</li>
				<li>贫困情况</li>
				<li>慰问情况</li>
			</div>
			<br /> <br /> <br />
			<div>
				<li>年龄：</li>
				<li>职级：</li>
				<li>职称：</li>
				<li>所在分会：</li>
				<li>民族：</li>
			</div>
			<br />
			<hr />
			<table cellpadding="500px">
				<tr>
					<td>序号</td>
					<td>工资编码</td>
					<td>姓名</td>
					<td>所在分会</td>
					<td>单位名称</td>
					<td>工资库</td>
					<td>离/退</td>
					<td>性别</td>
					<td>民族</td>
					<td>籍贯</td>
					<td>学历</td>
					<td>政治面貌</td>
				</tr>
				<tr>
					<td>11</td>
					<td>93003</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
				<tr>
					<td>11</td>
					<td>93003</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
				<tr>
					<td>11</td>
					<td>93003</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
			</table>
			<hr />
		</div>
		<div id="HMTools">
			<input type="button" value="导入"> <input type="button"
				value="导出"> <input type="button" value="下载模板">
		</div>
		<br />
	</div>
</body>
</html>